package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main linear_layout_9_18 constraint_layout_9_18 table_layout_9_18
    }

    public void clickHandler(View source) {
        // Get the text box with ID R.layout.show in UI interface
        TextView tv = findViewById(R.id.show);
        //change the text content of the text box
        tv.setText(R.string.app_and + "-" + new java.util.Date());

    }
}