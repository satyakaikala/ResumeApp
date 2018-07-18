package com.prassatyan.resume.data.model.github;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Data class for Github profile service call
 *
 * @author Satya
 */
public class Owner implements Parcelable {

    @SerializedName("name")
    private String name; // "name" : "Android"

    @SerializedName("email")
    private String email; // "email" : "Android@google.com"

    @SerializedName("location")
    private String location; // "location" : "Plano"

    @SerializedName("html_url")
    private String profileUrl; // "html_url" : "http://github.com/repo"

    @SerializedName("repos_url")
    private String reposUrl; // "repos_url" : "http://github.com/repo"

    @SerializedName("hireable")
    private String hireable; // "hireable" : null

    /**
     * Get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get email
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get location
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set location
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get profileUrl
     *
     * @return
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Set profileUrl
     *
     * @param profileUrl
     */
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    /**
     * Get reposUrl
     *
     * @return
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * Set reposUrl
     *
     * @param reposUrl
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     * Get hireable
     *
     * @return hireable
     */
    public String getHireable() {
        return hireable;
    }

    /**
     * Set hireable
     *
     * @param hireable
     */
    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    protected Owner(Parcel in) {
        name = in.readString();
        email = in.readString();
        location = in.readString();
        profileUrl = in.readString();
        reposUrl = in.readString();
        hireable = in.readString();
    }

    public static final Creator<Owner> CREATOR = new Creator<Owner>() {
        @Override
        public Owner createFromParcel(Parcel in) {
            return new Owner(in);
        }

        @Override
        public Owner[] newArray(int size) {
            return new Owner[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(email);
        parcel.writeString(location);
        parcel.writeString(profileUrl);
        parcel.writeString(reposUrl);
        parcel.writeString(hireable);
    }
}
