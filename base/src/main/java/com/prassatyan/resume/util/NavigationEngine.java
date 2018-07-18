package com.prassatyan.resume.util;

import android.content.Context;
import android.content.Intent;

/**
 * Utility class for Navigation
 *
 * @author Satya
 */
public class NavigationEngine {

    private NavigationEngine() {
    }

    /**
     * Utility method to navigate between screens
     *
     * @param context - Context from
     * @param classTo - Class to navigate
     */
    public static void navigateTo(Context context, Class classTo) {
        Intent intent = new Intent(context, classTo);
        context.startActivity(intent);
    }
}
