package com.prassatyan.resume.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Helper class to save key value to preference file
 *
 * @author Satya
 */
public class DataStorage {

    private static final String TAG = DataStorage.class.getSimpleName();
    private static final String RESUME_PREFS = "RESUME_PREFS";

    private static SharedPreferences sharedPreferences;

    public DataStorage(SharedPreferences preferences) {
        sharedPreferences = preferences;
    }

    public static void initialize(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static SharedPreferences.Editor getEditor() {
        return sharedPreferences.edit();
    }

    private static SharedPreferences getPrefs() {
        return sharedPreferences;
    }

    /**
     * Method to clear all preferences saved
     */
    public static void clear() {
        getEditor().clear().commit();
    }

    /**
     * Method to remove key from preference
     *
     * @param key
     */
    public static void remove(String key) {
        if (getPrefs().contains(key)) {
            getEditor().remove(key).commit();
        }
    }

    /**
     * Method to save string value to preferences
     *
     * @param key
     * @param value
     */
    public static void save(String key, String value) {
        getEditor().putString(key, value).commit();
    }

    /**
     * Method to int value to preference
     *
     * @param key
     * @param value
     */
    public static void save(String key, int value) {
        getEditor().putInt(key, value).commit();
    }

    /**
     * Method to save boolean value to preference
     *
     * @param key
     * @param value
     */
    public static void save(String key, boolean value) {
        getEditor().putBoolean(key, value).commit();
    }
}
