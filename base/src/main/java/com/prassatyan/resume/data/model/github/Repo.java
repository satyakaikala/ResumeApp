package com.prassatyan.resume.data.model.github;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;


/**
 * Data class for Github repos service call
 *
 * @author Satya
 */
@AutoValue
public abstract class Repo implements Parcelable {

    @Json(name = "id")
    abstract long repoId(); //"id": 99999

    @Json(name = "name")
    abstract String repoName(); //"name": "Hello-World"

    @Json(name = "full_name")
    abstract String repoFullName(); //"full_name":"octocat/Hello-World"

    @Json(name = "html_url")
    abstract String repoUrl(); // "html_url":"https://github.com/octocat/Hello-World"

    @Json(name = "description")
    abstract String repoDescription(); //  "description":"This your first repo!"

    @Json(name = "fork")
    abstract boolean isForked(); //  "fork":true

    @Json(name = "created_at")
    abstract String repoCreatedAt(); // "created_at":"2011-01-26T19:01:12Z"

    @Json(name = "updated_at")
    abstract String repoLastUpdatedAt(); //  "updated_at":"2011-01-26T19:14:43Z"

    public static Repo create(long repoId, String repoName, String repoFullName, String repoUrl, String repoDescription, boolean isForked, String repoCreatedAt, String repoUpdatedAt) {
        return new AutoValue_Repo(repoId, repoName, repoFullName, repoUrl, repoDescription, isForked, repoCreatedAt, repoUpdatedAt);
    }

    public static JsonAdapter<Repo> repoJsonAdapter(Moshi moshi) {
        return new AutoValue_Repo.MoshiJsonAdapter(moshi);
    }
}