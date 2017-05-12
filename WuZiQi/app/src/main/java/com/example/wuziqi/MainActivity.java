package com.example.wuziqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private WuZiQi wuZiQi;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wuZiQi = (WuZiQi) findViewById(R.id.id_wuziqi);
        button = (Button) findViewById(R.id.bu1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bu1:
                wuZiQi.start();
        }
    }
}
