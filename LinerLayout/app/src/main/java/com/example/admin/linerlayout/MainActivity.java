package com.example.admin.linerlayout;

import android.app.Activity;
import android.content.Intent;
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
        Button btn1=(Button)findViewById(R.id.btr);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColorDisplay.class);
                intent.putExtra("colour", "#fa024e");
                intent.putExtra("Ctext", "Red");
                startActivity(intent);

            }
        });
        Button btn2=(Button)findViewById(R.id.bto);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#f8d305");
                intent.putExtra("Ctext","Orange");
                startActivity(intent);

            }
        });
        Button btn3=(Button)findViewById(R.id.bty);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#eaf805");
                intent.putExtra("Ctext","Yellow");
                startActivity(intent);

            }
        });
        Button btn4=(Button)findViewById(R.id.btg);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#10f805");
                intent.putExtra("Ctext","Green");
                startActivity(intent);

            }
        });
        Button btn5=(Button)findViewById(R.id.btb);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#3305f8");
                intent.putExtra("Ctext","Blue");
                startActivity(intent);

            }
        });
        Button btn6=(Button)findViewById(R.id.bti);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#ef05f8");
                intent.putExtra("Ctext","Indigo");
                startActivity(intent);

            }
        });
        Button btn7=(Button)findViewById(R.id.btv);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorDisplay.class);
                intent.putExtra("colour","#f805c2");
                intent.putExtra("Ctext","Violet");
                startActivity(intent);

            }
        });

    }

}
