package com.devlanka.smarty;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class FieldProgressActivity extends AppCompatActivity {

    ProgressBar progressBar1,progressBar2,progressBar3;
    ImageView smiley;
    TextView smiley_text,water_status;
    Button refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fieled_progress_activity);


        progressBar1 = (ProgressBar) findViewById(R.id.progressBar);
        //progressBar1.setProgress(60);

        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        //progressBar2.setProgress(50);

        progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
        //progressBar3.setProgress(90);


        water_status = (TextView) findViewById(R.id.water_progress);


        ProgressBarAnimation anim1 = new ProgressBarAnimation(progressBar1, 1, 40);
        anim1.setDuration(1800);
        progressBar1.startAnimation(anim1);

        ProgressBarAnimation anim2 = new ProgressBarAnimation(progressBar2, 1, 80);
        anim2.setDuration(1800);
        progressBar2.startAnimation(anim2);

        ProgressBarAnimation anim3 = new ProgressBarAnimation(progressBar3, 1, 90);
        anim3.setDuration(1800);
        progressBar3.startAnimation(anim3);


        if (progressBar1.getProgress()>=75){
        }else if (progressBar2.getProgress()>=50){

        }else if (progressBar3.getProgress()>=25){

        }else{

        }

        refresh = (Button) findViewById(R.id.refresh);
        refresh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                ProgressBarAnimation anim1 = new ProgressBarAnimation(progressBar1, 1, 100);
                anim1.setDuration(1800);
                progressBar1.startAnimation(anim1);

                smiley_text.setText("Thank You!");
                water_status.setText("Perfect");

            }
        });

    }
}
