package com.example.admin.linearlayoutverti;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button org=(Button)findViewById(R.id.button1);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent = new Intent(MainActivity.this, color.class);
                intent.putExtra("color", "#fb9620");
                intent.putExtra("colorname", " Orenge");
                startActivity(intent);
            }
        });
        Button grn=(Button)findViewById(R.id.button3);
        grn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent=new Intent(MainActivity.this,color.class);
                intent.putExtra("color","#2e7420");
                intent.putExtra("colorname"," Green");
                startActivity(intent);
            }
        });
        Button blu=(Button)findViewById(R.id.button2);
        blu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent=new Intent(MainActivity.this,color.class);
                intent.putExtra("color","#4657a1");
                intent.putExtra("colorname"," Blue");
                startActivity(intent);
            }
        });
        Button Vlt=(Button)findViewById(R.id.button4);
        Vlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent = new Intent(MainActivity.this, color.class);
                intent.putExtra("color", "#662055");
                intent.putExtra("colorname", " Violet");
                startActivity(intent);
            }
        });
        Button Indi=(Button)findViewById(R.id.button5);
        Indi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent = new Intent(MainActivity.this, color.class);
                intent.putExtra("color", "#cb60de");
                intent.putExtra("colorname", " Indigo");
                startActivity(intent);
            }
        });
        Button yellw=(Button)findViewById(R.id.button6);
        yellw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent=new Intent(MainActivity.this,color.class);
                intent.putExtra("color","#fffc06");
                intent.putExtra("colorname"," Yellow");
                startActivity(intent);
            }
        });
        Button red=(Button)findViewById(R.id.button7);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String clr="#fb9620";
                Intent intent=new Intent(MainActivity.this,color.class);
                intent.putExtra("color","#fc0516");
                intent.putExtra("colorname"," Red");
                startActivity(intent);
            }
        });




    }


}
