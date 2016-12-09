package com.example.hyein.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer choronometer2;
    Switch switch1;
    TextView spa,pizza,sal,textView4,textView5,textView6,textView;
    EditText spawon,pizzawon,salwon;
    RadioButton radioButton3,radioButton4,radioButton2,radioButton9,radioButton10;
    ImageView imageView;
    Button button3,button2,button5,button6;
    TimePicker timePicker3;
    CalendarView calendarView2;
    LinearLayout dc,aa;
    double  num1,num2,num3,result,price1,price2,price3;
    double result2,result3;
    String rd,rd1,r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    choronometer2 = (Chronometer) findViewById(R.id.chronometer2);
        switch1=(Switch)findViewById(R.id.switch1);
        spawon=(EditText)findViewById(R.id.spawon);
        pizzawon=(EditText)findViewById(R.id.pizzawon);
        salwon=(EditText)findViewById(R.id.salwon);
        spa=(TextView)findViewById(R.id.spa);
        pizza=(TextView)findViewById(R.id.pizza);
        sal=(TextView)findViewById(R.id.sal);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioButton9=(RadioButton)findViewById(R.id.radioButton9);
        radioButton10=(RadioButton)findViewById(R.id.radioButton10);
        radioButton4=(RadioButton)findViewById(R.id.radioButton4);
        imageView=(ImageView)findViewById(R.id.imageView);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        timePicker3=(TimePicker)findViewById(R.id.timePicker3);
        calendarView2=(CalendarView)findViewById(R.id.calendarView2);
        dc=(LinearLayout)findViewById(R.id.dc);
        aa=(LinearLayout)findViewById(R.id.aa);

     switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             if (switch1.isChecked()){
                 dc.setVisibility(View.VISIBLE);
                 choronometer2.setBase(SystemClock.elapsedRealtime());
                 choronometer2.start();
                 choronometer2.setTextColor(Color.RED);
                 imageView.setImageResource(R.drawable.pp);
             }
         }
     });


        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton2.isChecked()){
                    num1 = Integer.parseInt(pizzawon.getText().toString());
                    num2 = Integer.parseInt(spawon.getText().toString());
                    num3 = Integer.parseInt(salwon.getText().toString());
                    result=num1+num2+num3;
                    price1=num1*16000;
                    price2=num2*11000;
                    price3=num3*4000;
                    result3=price1+price2+price3*0.05;
                    textView5.setText("기본 할인 적용"+result3);
                }
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton2.isChecked()){
                    num1 = Integer.parseInt(pizzawon.getText().toString());
                    num2 = Integer.parseInt(spawon.getText().toString());
                    num3 = Integer.parseInt(salwon.getText().toString());
                    result=num1+num2+num3;
                    price1=num1*16000;
                    price2=num2*11000;
                    price3=num3*4000;
                    result3=price1+price2+price3*0.1;
                    textView5.setText("현금할인 적용"+result3);
                }
            }
        });
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButton2.isChecked()){
                    num1 = Integer.parseInt(pizzawon.getText().toString());
                    num2 = Integer.parseInt(spawon.getText().toString());
                    num3 = Integer.parseInt(salwon.getText().toString());
                    result=num1+num2+num3;
                    price1=num1*16000;
                    price2=num2*11000;
                    price3=num3*4000;
                    result3=price1+price2+price3*0.2;
                    textView5.setText("멤버쉽 할인 적용"+result3);
                }
            }
        });



       button3.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               num1 = Integer.parseInt(pizzawon.getText().toString());
               num2 = Integer.parseInt(spawon.getText().toString());
               num3 = Integer.parseInt(salwon.getText().toString());
               result=num1+num2+num3;
               price1=num1*16000;
               price2=num2*11000;
               price3=num3*4000;
               result2=price1+price2+price3;
               textView4.setText("총 인원"+result);
               textView5.setText("할인 금액"+result3);
               textView6.setText("결제 금액"+result2);

           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dc.setVisibility(View.INVISIBLE);
                aa.setVisibility(View.VISIBLE);
            }
        });

    }
}
