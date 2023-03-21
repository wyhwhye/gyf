package com.example.gyf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EndingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        getSupportActionBar().setTitle("结算");

        TextView mTvString = (TextView) findViewById(R.id.ending);
        mTvString.setText(String.format(getString(R.string.ending), 2, 3, 4.23, 10, 1));
    }
}