package com.example.admin.linearlayoutverti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class color extends Activity {

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
