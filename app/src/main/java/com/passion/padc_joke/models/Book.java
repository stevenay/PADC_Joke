package com.passion.padc_joke.models;

import com.passion.padc_joke.R;

/**
 * Created by Dell on 6/24/2016.
 */
public class Book {
    private Joke[] mJokes;

    public Book() {
        mJokes = new Joke[3];

        mJokes[0] = new Joke(1, R.drawable.joke_1, R.string.joke1_name, R.string.joke1_story, true, false);
        mJokes[1] = new Joke(2, R.drawable.joke_2, R.string.joke2_name, R.string.joke2_story);
        mJokes[2] = new Joke(3, R.drawable.joke_3, R.string.joke3_name, R.string.joke3_story, false, true);
    }

    public Joke[] getJokes() {
        return mJokes;
    }
}
