package com.example.k14022kk.team_sample;

import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by k14022kk on 2016/08/20.
 */
public class MainActivity extends AppCompatActivity {


    ToneGenerator toneGenerator
            = new ToneGenerator(AudioManager.STREAM_SYSTEM, ToneGenerator.MAX_VOLUME);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }


    public void onMapButtonTapped(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void onClick_Button1(View view){
    //    ToneGenerator toneGenerator
    //            = new ToneGenerator(AudioManager.STREAM_SYSTEM, ToneGenerator.MAX_VOLUME);
        toneGenerator.startTone(ToneGenerator.TONE_DTMF_0,10000);
    }

    public void onClick_Button2(View view){
        toneGenerator.stopTone();
    }

    public void onItemButtonTapped(View view){
        Intent intent=new Intent(this,ItemActicity.class);
        startActivity(intent);
    }
}
