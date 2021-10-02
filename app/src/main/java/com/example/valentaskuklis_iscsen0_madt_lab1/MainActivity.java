package com.example.valentaskuklis_iscsen0_madt_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TvMain = findViewById(R.id.TvMain);
    }

    public void onBtnClick(View view) {
        this.TvMain.setText("Text was changed!!!");
    }
}