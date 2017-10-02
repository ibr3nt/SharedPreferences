package com.example.ibrent.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        SharedPreferences sharedPreferences = this.getSharedPreferences("MY_APP_PREFERENCES", Context.MODE_PRIVATE);
        String favColor = sharedPreferences.getString("FAVORITE_COLOR", "unknown");

        TextView textView = (TextView) findViewById(R.id.colorTextView);
        textView.setText(favColor);

    }
}
