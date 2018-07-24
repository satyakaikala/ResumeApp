package com.prassatyan.resume.data.model.github;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;


/**
 * Data class for Github repos service call
 *
 * @author Satya
 */
@AutoValue
public abstract class Repo implements Parcelable {

    public static Repo create(long repoId, String repoName, String repoFullName, String repoUrl, String repoDescription, boolean isForked, String repoCreatedAt, String repoUpdatedAt) {
        return new AutoValue_Repo(repoId, repoName, repoFullName, repoUrl, repoDescription, isForked, repoCreatedAt, repoUpdatedAt);
    }

    public static TypeAdapter<Repo> typeAdapter(Gson gson) {
        return new AutoValue_Repo.GsonTypeAdapter(gson);
    }

    @SerializedName("id")
    abstract long repoId(); //"id": 99999

    @SerializedName("name")
    abstract String repoName(); //"name": "Hello-World"

    @SerializedName("full_name")
    abstract String repoFullName(); //"full_name":"octocat/Hello-World"

    @SerializedName("html_url")
    abstract String repoUrl(); // "html_url":"https://github.com/octocat/Hello-World"

    @SerializedName("description")
    abstract String repoDescription(); //  "description":"This your first repo!"

    @SerializedName("fork")
    abstract boolean isForked(); //  "fork":true

    @SerializedName("created_at")
    abstract String repoCreatedAt(); // "created_at":"2011-01-26T19:01:12Z"

    @SerializedName("updated_at")
    abstract String repoLastUpdatedAt(); //  "updated_at":"2011-01-26T19:14:43Z"
}