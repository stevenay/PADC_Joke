package com.passion.padc_joke.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.passion.padc_joke.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeOneFragment extends Fragment {

    private int mJokeNameResId;
    private int mImageResId;
    private int mJokeResId;

    public static JokeOneFragment newInstance(int jokeNameResId, int imageResId, int jokeResId) {
        JokeOneFragment fragment = new JokeOneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("joke_name_key", jokeNameResId);
        bundle.putInt("image_key", imageResId);
        bundle.putInt("joke_key", jokeResId);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mJokeNameResId = bundle.getInt("joke_name_key");
            mImageResId = bundle.getInt("image_key");
            mJokeResId = bundle.getInt("joke_key");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke_one, container, false);

        TextView tvJokeName = (TextView) view.findViewById(R.id.tv_joke_name);
        tvJokeName.setText(getResources().getString(mJokeNameResId));

        ImageView ivJokeImage = (ImageView) view.findViewById(R.id.iv_joke_image);
        ivJokeImage.setImageDrawable(ContextCompat.getDrawable(getContext(), mImageResId));

        TextView tvJoke = (TextView) view.findViewById(R.id.tv_joke);
        tvJoke.setText(getResources().getString(mJokeResId));

        return view;
    }
}
