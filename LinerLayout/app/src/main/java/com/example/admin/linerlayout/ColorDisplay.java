package com.example.admin.linerlayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ColorDisplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_display);
        Intent inten=getIntent();
        String str=inten.getExtras().getString("colour");
        String str1=inten.getExtras().getString("Ctext");

        LinearLayout liobj=(LinearLayout)findViewById(R.id.lout);
        liobj.setBackgroundColor(Color.parseColor(str));
        TextView textobj=(TextView)findViewById(R.id.textc);
        textobj.append(str1);
    }


}
