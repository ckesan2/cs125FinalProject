package com.example.csfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ClickAdd extends AppCompatActivity {

    private Button submit;
    private Button cancel;
    private EditText date;
    private EditText wakeTime;
    private EditText sleepTime;
    private String sleep;
    private String wake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_add);

        date = findViewById(R.id.Date);
        wakeTime = findViewById(R.id.Waketime);
        sleepTime = findViewById(R.id.Sleeptime);

        sleep = sleepTime.getText().toString();
        wake = wakeTime.getText().toString();

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
                openSubmit();
            }
        });


    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openSubmit() {
        Intent intent = new Intent(this, ClickSubmit.class);
        intent.putExtra("sleep", sleep);
        intent.putExtra("wake", wake);
        startActivity(intent);
    }
}
