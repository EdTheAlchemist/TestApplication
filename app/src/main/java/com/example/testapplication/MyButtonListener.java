package com.example.testapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyButtonListener implements View.OnClickListener {
    private EditText source;
    private TextView destination;

    public MyButtonListener(EditText source, TextView destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void onClick(View view) {
        destination.setText(source.getText());
    }
}
