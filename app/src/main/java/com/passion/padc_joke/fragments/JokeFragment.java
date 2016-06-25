package com.passion.padc_joke.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.passion.padc_joke.R;
import com.passion.padc_joke.data.models.JokeModel;
import com.passion.padc_joke.data.vos.JokeVO;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeFragment extends Fragment {

    private static final String BARG_JOKE_INDEX = "BARG_JOKE_INDEX";

    private int jokeIndex;
    private JokeVO joke;

    public static JokeFragment newInstance(int jokeIndex) {
        JokeFragment fragment = new JokeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(BARG_JOKE_INDEX, jokeIndex);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            jokeIndex = bundle.getInt(BARG_JOKE_INDEX);
            joke = JokeModel.getInstance().getJoke(jokeIndex);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, container, false);

        TextView tvJokeName = (TextView) view.findViewById(R.id.tv_joke_name);
        tvJokeName.setText(joke.getJokeTitle());

        ImageView ivJokeImage = (ImageView) view.findViewById(R.id.iv_joke_image);
        ivJokeImage.setImageDrawable(ContextCompat.getDrawable(getContext(), joke.getJokeImage()));
        // ivJokeImage.setImageResource(joke.getJokeImage());

        TextView tvJoke = (TextView) view.findViewById(R.id.tv_joke);
        tvJoke.setText(joke.getJokeContent());

        return view;
    }
}
