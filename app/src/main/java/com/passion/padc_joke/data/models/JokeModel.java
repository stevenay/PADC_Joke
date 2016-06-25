package com.passion.padc_joke.data.models;

import android.content.Context;

import com.passion.padc_joke.PADCJokeApp;
import com.passion.padc_joke.R;
import com.passion.padc_joke.data.vos.JokeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 6/24/2016.
 */
public class JokeModel {

    private static JokeModel objInstance;

    private List<JokeVO> jokeList;

    private JokeModel() {
        jokeList = setUpInitialJokes();
    }

    private List<JokeVO> setUpInitialJokes() {
        Context context = PADCJokeApp.getContext();

        List<JokeVO> jokeList = new ArrayList<>();
        jokeList.add(new JokeVO(context.getString(R.string.joke_one_title),
                                context.getString(R.string.joke_one_content),
                                R.drawable.joke_1));
        jokeList.add(new JokeVO(context.getString(R.string.joke_two_title),
                                context.getString(R.string.joke_two_content),
                                R.drawable.joke_2));
        jokeList.add(new JokeVO(context.getString(R.string.joke_three_title),
                                context.getString(R.string.joke_three_content),
                                R.drawable.joke_3));

        return jokeList;
    }

    // Singleton Pattern
    public static JokeModel getInstance() {
        if (objInstance == null) {
            objInstance = new JokeModel();
        }

        return objInstance;
    }

    public JokeVO getJoke(int index) {
        return this.jokeList.get(index);
    }

}
