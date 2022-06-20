package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

     private EditText display1,display2;
     private Button dltBtn,sevenBtn,eightBtn,nineBtn,divBtn,
             fourBtn,fiveBtn,sixBtn,mulBtn,oneBtn,twoBtn,threeBtn,
             minusBtn,pointBtn,zeroBtn,equalBtn,plusBtn;

     String concat_string = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display1 = (EditText) findViewById(R.id.editText1);
        display2 = (EditText) findViewById(R.id.editText2);
        dltBtn =  findViewById(R.id.button1);
        sevenBtn =  findViewById(R.id.button2);
        eightBtn =  findViewById(R.id.button3);
        nineBtn =  findViewById(R.id.button4);
        divBtn =  findViewById(R.id.button5);
        fourBtn =  findViewById(R.id.button6);
        fiveBtn =  findViewById(R.id.button7);
        sixBtn =  findViewById(R.id.button8);
        mulBtn =  findViewById(R.id.button9);
        oneBtn =  findViewById(R.id.button10);
        twoBtn =  findViewById(R.id.button11);
        threeBtn =  findViewById(R.id.button12);
        minusBtn =  findViewById(R.id.button13);
        pointBtn =  findViewById(R.id.button14);
        zeroBtn =  findViewById(R.id.button15);
        equalBtn =  findViewById(R.id.button16);
        plusBtn =  findViewById(R.id.button17);

        display1.setShowSoftInputOnFocus(false);

        dltBtn.setOnClickListener(v-> concat("dltBtn"));
        divBtn.setOnClickListener(v-> concat("divBtn"));
        mulBtn.setOnClickListener(v-> concat("mulBtn"));
        minusBtn.setOnClickListener(v-> concat("minusBtn"));
        plusBtn.setOnClickListener(v-> concat("plusBtn"));

        zeroBtn.setOnClickListener(v-> concat("zeroBtn"));
        oneBtn.setOnClickListener(v-> concat("oneBtn"));
        twoBtn.setOnClickListener(v-> concat("twoBtn"));
        threeBtn.setOnClickListener(v-> concat("threeBtn"));
        fourBtn.setOnClickListener(v-> concat("fourBtn"));
        fiveBtn.setOnClickListener(v-> concat("fiveBtn"));
        sixBtn.setOnClickListener(v-> concat("sixBtn"));
        sevenBtn.setOnClickListener(v-> concat("sevenBtn"));
        eightBtn.setOnClickListener(v-> concat("eightBtn"));
        nineBtn.setOnClickListener(v-> concat("nineBtn"));

        pointBtn.setOnClickListener(v-> concat("pointBtn"));

        equalBtn.setOnClickListener(v-> result());

    }

    public void concat (String clickedBtn){
        switch(clickedBtn) {
            case "divBtn":
                concat_string = concat_string + "/";
                display1.setText(concat_string);
                break;
            case "mulBtn":
                concat_string = concat_string + "x";
                display1.setText(concat_string);
                break;
            case "minusBtn":
                concat_string = concat_string + "-";
                display1.setText(concat_string);
                break;
            case "plusBtn":
                concat_string = concat_string + "+";
                display1.setText(concat_string);
                break;
            case "zeroBtn":
                concat_string = concat_string + "0";
                display1.setText(concat_string);
                break;
            case "oneBtn":
                concat_string = concat_string + "1";
                display1.setText(concat_string);
                break;
            case "twoBtn":
                concat_string = concat_string + "2";
                display1.setText(concat_string);
                break;
            case "threeBtn":
                concat_string = concat_string + "3";
                display1.setText(concat_string);
                break;
            case "fourBtn":
                concat_string = concat_string + "4";
                display1.setText(concat_string);
                break;
            case "fiveBtn":
                concat_string = concat_string + "5";
                display1.setText(concat_string);
                break;
            case "sixBtn":
                concat_string = concat_string + "6";
                display1.setText(concat_string);
                break;
            case "sevenBtn":
                concat_string = concat_string + "7";
                display1.setText(concat_string);
                break;
            case "eightBtn":
                concat_string = concat_string + "8";
                display1.setText(concat_string);
                break;
            case "nineBtn":
                concat_string = concat_string + "9";
                display1.setText(concat_string);
                break;
            case "pointBtn":
                concat_string = concat_string + ".";
                display1.setText(concat_string);
                break;
            case "dltBtn":
                if(!concat_string.equals("")){
                    concat_string = concat_string.substring(0, concat_string.length() - 1);
                    if(!concat_string.equals("")){
                        display1.setText(concat_string);
                    }
                    else{
                        display1.setText("Enter a value");
                    }
                }
                else{
                    display1.setText("Enter a value");
                }
                break;

        }

    }

    void result (){

    }


}