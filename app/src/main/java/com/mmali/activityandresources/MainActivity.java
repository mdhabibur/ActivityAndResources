package com.mmali.activityandresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //An Activity is a single, focused thing a user can do.
        //An activity should do only one task at a time

        //lifecycle methods of activity
        //onCreate()-onStart()-onResume()-onPause-onStop()-onDestroy()

        secondCommitDone();
        thirdCommitDone();
    }

    public void secondCommitDone(){
        Toast.makeText(MainActivity.this, "second commit done", Toast.LENGTH_SHORT).show();
    }
    public void thirdCommitDone(){
        Toast.makeText(MainActivity.this, "third commit is done", Toast.LENGTH_SHORT).show();
    }
}