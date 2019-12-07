package com.example.csfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClickAdd extends AppCompatActivity {

    private Button submit;
    private Button cancel;
    private EditText date;
    private EditText wakeTime;
    private EditText sleepTime;
    private String sleep;
    private String wake;
    private String dat;
    private TextView hours;
    private TextView sleepMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_add);

        date = findViewById(R.id.Date);
        wakeTime = findViewById(R.id.Waketime);
        sleepTime = findViewById(R.id.Sleeptime);

        sleep = sleepTime.getText().toString();
        wake = wakeTime.getText().toString();
        dat = date.getText().toString();

        hours = findViewById(R.id.Hours);
        sleepMessage = findViewById(R.id.Message);

        submit = findViewById(R.id.Submit);
        cancel = findViewById(R.id.Cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //openSubmit();
                timeComp();
            }
        });


    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public String timeComputePM(int tsh, int tsm, int twh, int twm) {
        int diffh;
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
        return combo;
    }
    public String timeComputeAM(int tsh, int tsm, int twh, int twm) {
        int diffh;
        int diffm = twm - tsm;
        if (tsh == 12 && diffm == 0) {
            int num = 12 - twh;
            diffh = 12 - num;
        } else if (tsh == 12 && diffm > 0) {
            int num = 12 - twh;
            diffh = 12 - num;
        } else if (tsh == 12 && diffm < 0) {
            diffm = 60 - Math.abs(twm - tsm);
            int num = 12 - twh;
            diffh = 12 - num - 1;
        } else if (diffm == 0) {
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
        return combo;
    }
    public void timeComp() {
        wakeTime = findViewById(R.id.Waketime);
        sleepTime = findViewById(R.id.Sleeptime);

        sleep = sleepTime.getText().toString();
        wake = wakeTime.getText().toString();
        dat = date.getText().toString();

        hours = findViewById(R.id.Hours);
        sleepMessage = findViewById(R.id.Message);

        if (sleep != null && !(sleep.equals("")) && wake != null && !(wake.equals(""))) {
            String[] a = sleep.split(":");


            int tsh = Integer.parseInt(a[0]);
            int tsm = Integer.parseInt(a[1]);
            String[] b = wake.split(":");
            int twh = Integer.parseInt(b[0]);
            int twm = Integer.parseInt(b[1]);
            if (sleep.contains("AM")|| sleep.contains("am")) {
                hours.setText(timeComputeAM(tsh, tsm, twh, twm));
                /**int num = Integer.parseInt(timeComputeAM(tsh, tsm, twh, twm));
                if (num < 7) {
                    sleepMessage.setText("NOt enough");
                } else if (num > 10) {
                    sleepMessage.setText("Too much");
                } else {
                    sleepMessage.setText("That's a great amount of sleep!");
                } */
            } else if (sleep.contains("PM") || sleep.contains("pm")) {
                hours.setText(timeComputePM(tsh, tsm, twh, twm));
                /**int num = Integer.parseInt(timeComputeAM(tsh, tsm, twh, twm));
                if (num < 7) {
                    sleepMessage.setText("not enough");
                } else if (num > 10) {
                    sleepMessage.setText("too much");
                } else {
                    sleepMessage.setText("That's a great amount of sleep!");
                }*/
            } else  {
                hours.setText("Should contain AM or PM ");
            }

        }

    }

    /**public void openSubmit() {
        Intent intent = new Intent(this, ClickSubmit.class);
        intent.putExtra("sleep", sleep);
        intent.putExtra("wake", wake);
        intent.putExtra("date", dat);
        startActivity(intent);
        finish();
    }*/

}
