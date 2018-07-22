package com.prassatyan.resume.data.model.github;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Data class for Github profile service call
 *
 * @author Satya
 */
@AutoValue
public abstract class Owner implements Parcelable {

    public static Owner create(String name, String email, String location, String profileUrl, String reposUrl, String hireable) {
        return new AutoValue_Owner(name, email, location, profileUrl, reposUrl, hireable);
    }

    public static TypeAdapter<Owner> typeAdapter(Gson gson) {
        return new AutoValue_Owner.GsonTypeAdapter(gson);
    }

    abstract String name(); // "name" : "Android"

    abstract String email(); // "email" : "Android@google.com"

    abstract String location(); // "location" : "Plano"

    @SerializedName("html_url")
    abstract String profileUrl(); // "html_url" : "http://github.com/repo"

    @SerializedName("repos_url")
    abstract String reposUrl(); // "repos_url" : "http://github.com/repo"

    abstract String hireable(); // "hireable" : null

}