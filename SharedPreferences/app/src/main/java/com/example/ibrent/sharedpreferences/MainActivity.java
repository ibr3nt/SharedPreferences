package com.example.ibrent.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences localPrefs;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        localPrefs = this.getPreferences(Context.MODE_PRIVATE);
        String savedFav = localPrefs.getString(getString(R.string.favorite_food_key), "unknown");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("My favorite food is: " + savedFav);
    }

    public void setFavoriteFood(View view) {
        String favFood = "pizza";

        SharedPreferences.Editor editor = localPrefs.edit();
        editor.putString(getString(R.string.favorite_food_key), favFood);
        editor.apply();
    }

    public void setFavoriteColor(View view) {
        SharedPreferences sharedPreferences = this.getSharedPreferences("MY_APP_PREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("FAVORITE_COLOR", "Blue");
        editor.apply();

        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

}
