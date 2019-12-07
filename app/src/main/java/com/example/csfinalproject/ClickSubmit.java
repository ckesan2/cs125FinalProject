package com.example.csfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ClickSubmit extends AppCompatActivity {

    //private String sleep;
    //private String wake;
    //private TextView hours;
    //private TextView sleepMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_submit);
        //sleep = getIntent().getStringExtra("sleep");
        //wake = getIntent().getStringExtra("wake");
        //System.out.print("String: " + sleep);
        //hours = findViewById(R.id.Hours);
        //sleepMessage = findViewById(R.id.SleepMessage);
        //timeComp();
    }

    /**public String timeComputePM(int tsh, int tsm, int twh, int twm) {
        int diffh = 0;

        if (tsm > 0) {
            diffh = (12 - (tsh + 1)) + twh;
        } else if (tsm == 0) {
            diffh = (12 - tsh) + twh;
        }
        int diffm = 0;
        if (twm > tsm) {
            diffm = twm - tsm;
        } else if (tsm > twm) {
            diffm = (60 - tsm) + twm;
        }
        String hour = Integer.toString(diffh);
        String minutes = Integer.toString(diffm);
        String combo = hour + " : " + minutes;
        return combo;
    }
    public String timeComputeAM(int tsh, int tsm, int twh, int twm) {
        int diffh = 0;
        if (tsm > 0) {
            diffh = twh - tsh - 1;
        } else if (tsm == 0) {
            diffh = twh - tsh;
        }
        int diffm = 0;
        if (twm > tsm) {
            diffm = twm - tsm;
        } else if (tsm > twm) {
            diffm = (60 - tsm) + twm;
        }
        String hour = Integer.toString(diffh);
        String minutes = Integer.toString(diffm);
        String combo = hour + " : " + minutes;
        return combo;
    }
    public void timeComp() {
        if (sleep != null && !(sleep.equals("")) && wake != null && !(wake.equals(""))) {
            String[] a = sleep.split(":");


            int tsh = Integer.parseInt(a[0]);
            int tsm = Integer.parseInt(a[1]);
            String[] b = wake.split(":");
            int twh = Integer.parseInt(b[0]);
            int twm = Integer.parseInt(b[1]);
            if (sleep.contains("AM")|| sleep.contains("am")) {
                hours.setText(timeComputeAM(tsh, tsm, twh, twm));
            }
            if (sleep.contains("PM") || sleep.contains("pm")) {
                hours.setText(timeComputePM(tsh, tsm, twh, twm));
            }
            hours.setText("Should contain AM or PM ");

        }

    }*/
    /**diffh = 0;
    diffm = twm - tsm;
    if (diffm == 0) {
        diffh = twh - tsh;
    } else if (diffm > 0) {
        diffh = twh - tsh;
    } else {
        diffm = 60 - Math.abs(twm - tsm);
        diffh = twh - tsh - 1;
    }
    String hour = Integer.toString(diffh);
    String minutes = Integer.toString(diffm);
    String combo = hour + " hours " + minutes + " minutes";
        return combo; */

    /**int diffh;
    int sleepnum;
    int num;
    int diffm = twm - tsm;
    if (diffm == 0) {
       sleepnum = 12 - tsh;
       num = 12 - twh;
       diffh = 12 - num + sleepnum;
    } else if (diffm > 0) {
        sleepnum = 12 - tsh;
        num = 12 - twh;
        diffh = 12 - num + sleepnum;
    } else {
        diffm = 60 - Math.abs(twm - tsm);
        sleepnum = 12 - tsh - 1;
        num = 12 - twh;
        diffh = 12 - num + sleepnum;
    }
    String hour = Integer.toString(diffh);
    String minutes = Integer.toString(diffm);
    String combo = hour + " hours " + minutes + " minutes";
        return combo;*/

}


