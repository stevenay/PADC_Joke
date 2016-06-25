package com.passion.padc_joke.models;

/**
 * Created by Dell on 6/24/2016.
 */
public class Joke {

    private int mJokeId;
    private int mImageId;
    private int mJokeNameResId;
    private int mTextResId;
    private boolean mIsStart = false;
    private boolean mIsFinal = false;

    public Joke(int jokeId, int imageId, int jokeNameResId, int resId) {
        mJokeId = jokeId;
        mImageId = imageId;
        mJokeNameResId = jokeNameResId;
        mTextResId = resId;
    }

    public Joke(int jokeId, int imageId, int jokeNameResId, int resId, boolean isStart, boolean isFinal) {
        mJokeId = jokeId;
        mImageId = imageId;
        mJokeNameResId = jokeNameResId;
        mTextResId = resId;
        mIsStart = isStart;
        mIsFinal = isFinal;
    }

    public int getJokeId() {
        return mJokeId;
    }

    public void setJokeId(int jokeId) {
        mJokeId = jokeId;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public int getJokeNameResId() {
        return mJokeNameResId;
    }

    public void setJokeNameResId(int jokeNameResId) {
        mJokeNameResId = jokeNameResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isStart() {
        return mIsStart;
    }

    public void setStart(boolean start) {
        mIsStart = start;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }
}
