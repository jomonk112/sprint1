package com.example.admin.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class   MainActivity extends Activity implements View.OnClickListener{

    private Button buttAdd,buttSub,buttMul,buttDiv;
    private TextView result;
    private EditText firstNo,seconNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        buttAdd=(Button)findViewById(R.id.button4);
        buttSub=(Button)findViewById(R.id.button2);
        buttMul=(Button)findViewById(R.id.button3);
        buttDiv=(Button)findViewById(R.id.button);
        firstNo=(EditText)findViewById(R.id.editText);
        seconNo=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView4);

        buttAdd.setOnClickListener(this);
        buttSub.setOnClickListener(this);
        buttMul.setOnClickListener(this);
        buttDiv.setOnClickListener(this);

    }
    public void onClick(View view){
        String num1=null;
        String num2=null;

        num1=firstNo.getText().toString();
        num2=seconNo.getText().toString();

        switch (view.getId()){
            case R.id.button4:
                try {
                    if (num1 == null && num2 == null) {
                        result.setText("please enter two numbers");
                    } else {
                        int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                        result.setText(String.valueOf(addition));
                    }
                }catch (Exception e){
                    result.setText("please enter two numbers");
                }

                break;
            case R.id.button2:
                try {
                    if (num1 == null && num2 == null) {
                        result.setText("please enter two numbers");
                    } else {
                        int substraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                        result.setText(String.valueOf(substraction));
                    }
                }catch (Exception e){
                    result.setText("please enter two numbers");
                }
                break;
            case R.id.button3:
                try {
                    if (num1 == null && num2 == null) {
                        result.setText("please enter two numbers");
                    } else {
                        int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                        result.setText(String.valueOf(multiplication));
                    }
                }catch (Exception e){
                result.setText("please enter two numbers");
            }

                break;
            case R.id.button:
                try {
                    if (num1 == null && num2 == null) {
                        result.setText("please enter two numbers");
                    } else {
                        try {
                            int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                            result.setText(String.valueOf(division));
                        } catch (Exception e) {
                            result.setText("Cannot Divide");
                        }
                    }
                }catch (Exception e){
                    result.setText("please enter two numbers");
                }
                break;
        }

    }
}
