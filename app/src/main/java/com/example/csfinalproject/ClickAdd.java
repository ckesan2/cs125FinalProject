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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_add);

        date = findViewById(R.id.Date);
        wakeTime = findViewById(R.id.Waketime);
        sleepTime = findViewById(R.id.Sleeptime);

        submit = findViewById(R.id.Submit);
        cancel = findViewById(R.id.Cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });


    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
