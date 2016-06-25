package com.passion.padc_joke.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.passion.padc_joke.R;
import com.passion.padc_joke.fragments.JokeFragment;
import com.passion.padc_joke.data.vos.JokeVO;
import com.passion.padc_joke.utils.PADCJokeConstants;

public class MainActivity extends AppCompatActivity {

    private int jokeIndex = -1;

    private Button btnPrevious;
    private Button btnNext;

    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPrevious = (Button) this.findViewById(R.id.btn_previous);
        btnNext = (Button) this.findViewById(R.id.btn_next);

        if (savedInstanceState == null) {
            jokeIndex++;
            loadFragment(jokeIndex);
        }
        
        if (btnNext != null)
            btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jokeIndex++;
                    if (jokeIndex < PADCJokeConstants.TOTAL_JOKES) {
                        loadFragment(jokeIndex);
                    } else {
                        jokeIndex = PADCJokeConstants.TOTAL_JOKES - 1;
                        Toast.makeText(getApplicationContext(), R.string.msg_no_more_joke, Toast.LENGTH_SHORT).show();
                    }
                }
            });

        if (btnPrevious != null) {
            btnPrevious.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jokeIndex--;
                    if (jokeIndex >= 0) {
                        loadFragment(jokeIndex);
                    } else {
                        jokeIndex = 0;
                        Toast.makeText(getApplicationContext(), R.string.msg_no_more_joke, Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void loadFragment(int jokeIndex) {
        JokeFragment fragment = JokeFragment.newInstance(jokeIndex);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

//    private void loadPage(JokeVO joke) {
//        if (joke == null)
//            return;
//
//        Fragment fragment = JokeFragment.newInstance(joke.getJokeNameResId(), joke.getImageId(), joke.getTextResId());
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fl_container, fragment)
//                .commit();
//
//        if (joke.isStart()) btnPrevious.setEnabled(false);
//        else btnPrevious.setEnabled(true);
//
//        if (joke.isFinal()) btnNext.setEnabled(false);
//        else btnNext.setEnabled(true);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
