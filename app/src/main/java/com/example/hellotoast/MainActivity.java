package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.showCount);
    }



    public void showToast(View view) {

        Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT).show();

    }

    public void showCount(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}