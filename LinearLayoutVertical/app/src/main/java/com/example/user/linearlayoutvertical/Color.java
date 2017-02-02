package com.example.user.linearlayoutvertical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Intent intent=getIntent();
        String clr=intent.getExtras().getString("color");
        String clrname=intent.getExtras().getString("colorname");

        LinearLayout linear=(LinearLayout)findViewById(R.id.activity_color);
        linear.setBackgroundColor(android.graphics.Color.parseColor(clr));
        TextView txt=(TextView)findViewById(R.id.textViewname);
        txt.append(clrname);

    }
}
