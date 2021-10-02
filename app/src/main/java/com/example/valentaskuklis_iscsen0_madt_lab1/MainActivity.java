package com.example.valentaskuklis_iscsen0_madt_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;

    private TextView TvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TvMain = findViewById(R.id.TvMain);
        // I'm initializing button and text view here
        tv = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.buttonColor);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setTextSize(20);
                tv.setText("Text color has changed");
                tv.setTextSize(18);

                tv.setTextColor(Color.parseColor("#FF0000"));
            }
        });
    }

    public void onBtnClick(View view) {
        this.TvMain.setText("Text was changed!!!");
    }
}