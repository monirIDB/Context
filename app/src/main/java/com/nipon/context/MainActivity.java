package com.nipon.context;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout=findViewById(R.id.layoutId);

        TextView apContextTv=new TextView(getApplicationContext());
        apContextTv.setText("this is application context");
        apContextTv.setTextSize(40);

        TextView actiContextTv=new TextView(this);
        actiContextTv.setText("this is a activity context");
        actiContextTv.setTextSize(40);

        layout.addView(apContextTv);
        layout.addView(actiContextTv);

    }
}
