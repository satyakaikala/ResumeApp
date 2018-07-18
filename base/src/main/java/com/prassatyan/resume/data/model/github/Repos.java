package com.prassatyan.resume.data.model.github;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Data class for Github repos service call
 *
 * @author Satya
 */
public class Repos implements Parcelable {

    @SerializedName("id")
    private long repoId; //"id": 99999

    @SerializedName("name")
    private String repoName; //"name": "Hello-World"

    @SerializedName("full_name")
    private String repoFullName; //"full_name":"octocat/Hello-World"

    @SerializedName("html_url")
    private String repoUrl; // "html_url":"https://github.com/octocat/Hello-World"

    @SerializedName("description")
    private String repoDescription; //  "description":"This your first repo!"

    @SerializedName("fork")
    private boolean isForked; //  "fork":true

    @SerializedName("created_at")
    private String repoCreatedAt; // "created_at":"2011-01-26T19:01:12Z"

    @SerializedName("updated_at")
    private String repoLastUpdatedAt; //  "updated_at":"2011-01-26T19:14:43Z"

    /**
     * Get repoId
     *
     * @return repoId
     */
    public long getRepoId() {
        return repoId;
    }

    /**
     * Set repoId
     *
     * @param repoId
     */
    public void setRepoId(long repoId) {
        this.repoId = repoId;
    }

    /**
     * Get repoName
     *
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    /**
     * Set repoName
     *
     * @param repoName
     */
    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    /**
     * Get repoFullName
     *
     * @return repoFullName
     */
    public String getRepoFullName() {
        return repoFullName;
    }

    /**
     * Set repoFullName
     *
     * @param repoFullName
     */
    public void setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
    }

    /**
     * Get repoUrl
     *
     * @return
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     * Set repoUrl
     *
     * @param repoUrl
     */
    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    /**
     * Get repoDescription
     *
     * @return repoDescription
     */
    public String getRepoDescription() {
        return repoDescription;
    }

    /**
     * Set repoDescription
     *
     * @param repoDescription
     */
    public void setRepoDescription(String repoDescription) {
        this.repoDescription = repoDescription;
    }

    /**
     * Get isForked
     *
     * @return isForked
     */
    public boolean isForked() {
        return isForked;
    }

    /**
     * Set isForked
     *
     * @param forked
     */
    public void setForked(boolean forked) {
        isForked = forked;
    }

    /**
     * Get repoCreatedAt
     *
     * @return repoCreatedAt
     */
    public String getRepoCreatedAt() {
        return repoCreatedAt;
    }

    /**
     * Set repoCreatedAt
     *
     * @param repoCreatedAt
     */
    public void setRepoCreatedAt(String repoCreatedAt) {
        this.repoCreatedAt = repoCreatedAt;
    }

    /**
     * Get repoLastUpdatedAt
     *
     * @return repoLastUpdatedAt
     */
    public String getRepoLastUpdatedAt() {
        return repoLastUpdatedAt;
    }

    /**
     * Set repoLastUpdatedAt
     *
     * @param repoLastUpdatedAt
     */
    public void setRepoLastUpdatedAt(String repoLastUpdatedAt) {
        this.repoLastUpdatedAt = repoLastUpdatedAt;
    }

    protected Repos(Parcel in) {
        repoId = in.readLong();
        repoName = in.readString();
        repoFullName = in.readString();
        repoUrl = in.readString();
        repoDescription = in.readString();
        isForked = in.readByte() != 0;
        repoCreatedAt = in.readString();
        repoLastUpdatedAt = in.readString();
    }

    public static final Creator<Repos> CREATOR = new Creator<Repos>() {
        @Override
        public Repos createFromParcel(Parcel in) {
            return new Repos(in);
        }

        @Override
        public Repos[] newArray(int size) {
            return new Repos[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(repoId);
        parcel.writeString(repoName);
        parcel.writeString(repoFullName);
        parcel.writeString(repoUrl);
        parcel.writeString(repoDescription);
        parcel.writeByte((byte) (isForked ? 1 : 0));
        parcel.writeString(repoCreatedAt);
        parcel.writeString(repoLastUpdatedAt);
    }
}
