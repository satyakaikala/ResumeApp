package com.prassatyan.resume.data.model.github;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;


/**
 * Data class for Github profile service call
 *
 * @author Satya
 */
@AutoValue
public abstract class Owner implements Parcelable {

    @Json(name = "name")
    abstract String name(); // "name" : "Android"

    @Json(name = "email")
    abstract String email(); // "email" : "Android@google.com"

    @Json(name = "location")
    abstract String location(); // "location" : "Plano"

    @Json(name = "html_url")
    abstract String profileUrl(); // "html_url" : "http://github.com/repo"

    @Json(name = "repos_url")
    abstract String reposUrl(); // "repos_url" : "http://github.com/repo"

    @Json(name = "hireable")
    abstract String hireable(); // "hireable" : null

    public static Owner create(String name, String email, String location, String profileUrl, String reposUrl, String hireable) {
        return new AutoValue_Owner(name, email, location, profileUrl, reposUrl, hireable);
    }

    public static JsonAdapter<Owner> jsonAdapter(Moshi moshi) {
        return new AutoValue_Owner.MoshiJsonAdapter(moshi);
    }

}