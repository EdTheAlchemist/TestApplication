package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String BUTTON_LOG_TAG = "MyButtonListener Log";

    private EditText input_string_et;
    private Button click_me_btn;
    private TextView display_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.input_string_et = findViewById(R.id.string_edittext);
        this.click_me_btn = findViewById(R.id.click_btn);
        this.display_tv = findViewById(R.id.display_tv);

        Log.d(BUTTON_LOG_TAG, "var click_me_btn: " + click_me_btn.toString());

        this.click_me_btn.setOnClickListener(new MyButtonListener(this.input_string_et, display_tv));
    }
}