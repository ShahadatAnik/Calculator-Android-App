package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    TextView equationView;
    boolean flg=true;
    boolean flgEqual = false;
    String tmpResult = "";

    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1;
        }
        else{ // for operator == '*' || operator == '/'
            return 2;
        }
    }

    public static double operation(double num1, double num2, char operator){
        if(operator == '+'){
            return num1 + num2;
        }
        else if(operator == '-'){
            return num1 - num2;
        }
        else if(operator == '*'){
            return num1 * num2;
        }
        else{
            return num1 / num2;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equationView = findViewById(R.id.et_input_num);
        resultView = findViewById(R.id.tv_below_et_input_num);

        Button btn0 = findViewById(R.id.btn_num_0);
        Button btn1 = findViewById(R.id.btn_num_1);
        Button btn2 = findViewById(R.id.btn_num_2);
        Button btn3 = findViewById(R.id.btn_num_3);
        Button btn4 = findViewById(R.id.btn_num_4);
        Button btn5 = findViewById(R.id.btn_num_5);
        Button btn6 = findViewById(R.id.btn_num_6);
        Button btn7 = findViewById(R.id.btn_num_7);
        Button btn8 = findViewById(R.id.btn_num_8);
        Button btn9 = findViewById(R.id.btn_num_9);
        Button btnSum = findViewById(R.id.btn_num_plus);
        Button btnSub = findViewById(R.id.btn_num_minus);
        Button btnMul = findViewById(R.id.btn_num_multiplication);
        Button btnDiv = findViewById(R.id.btn_num_devide);
        Button btnEqual = findViewById(R.id.btn_num_equal);
        Button btnDot = findViewById(R.id.btn_num_dot);
        Button btnCLR = findViewById(R.id.btn_clear);
        Button btnDEL = findViewById(R.id.btn_delete);


        btn0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "0";
                equationView.setText(result);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "1";
                equationView.setText(result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "2";
                equationView.setText(result);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "3";
                equationView.setText(result);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "4";
                equationView.setText(result);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "5";
                equationView.setText(result);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "6";
                equationView.setText(result);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "7";
                equationView.setText(result);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "8";
                equationView.setText(result);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg || flgEqual){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                result += "9";
                equationView.setText(result);
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg){
                    equationView.setText("");
                    flg = false;
                    flgEqual = false;
                }
                String result = equationView.getText().toString();
                if(result.charAt(result.length()-1) == ' '){
                    return;
                }
                if(flgEqual){
                    String[] strArr = result.split(" ");
                    result = strArr[strArr.length-1];
                    flgEqual = false;
                }
                result += " + ";
                equationView.setText(result);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flg){
                    equationView.setText("");
                    flg = false;
                }

                String result = equationView.getText().toString();
                if(result.charAt(result.length()-1) == ' '){
                    return;
                }

                if(flgEqual){
                    String[] strArr = result.split(" ");
                    result = strArr[strArr.length-1];
                    flgEqual = false;
                }

                result += " - ";
                equationView.setText(result);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                String result = equationView.getText().toString();
                if(result.charAt(result.length()-1) == ' '){
                    return;
                }
                if(flgEqual){
                    String[] strArr = result.split(" ");
                    result = strArr[strArr.length-1];
                    flgEqual = false;
                }
                result += " x ";
                equationView.setText(result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String result = equationView.getText().toString();
                if(result.charAt(result.length()-1) == ' '){
                    return;
                }
                if(flgEqual){
                    String[] strArr = result.split(" ");
                    result = strArr[strArr.length-1];
                    flgEqual = false;
                }
                result += " / ";
                equationView.setText(result);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String result = equationView.getText().toString();
                // result += " = ";
                String[] strArr = result.split(" ");
                //equationView.setText(result);

                if(tmpResult == result || result.charAt(result.length()-1) == ' '){
                    return;
                }

                // Infix Evaluation
                Stack<Double> operands = new Stack<>();
                operands.push(0.0);
                Stack<Character> operators = new Stack<>();
                for(String str: strArr){
                    if(str.isEmpty()){
                        continue;
                    }
                    //str = str.trim();
                    if("+".equals(str) || "-".equals(str) || "x".equals(str) || "/".equals(str)){
                        char ch = str.charAt(0);
                        if(ch == 'x'){
                            ch = '*';
                        }
                        while(operators.size() > 0 && precedence(ch) <= precedence(operators.peek())){
                            char operator = operators.pop();
                            double num2 = operands.pop();
                            double num1 = operands.pop();

                            double res = operation(num1, num2, operator);
                            operands.push(res);
                        }
                        operators.push(ch);
                    }
                    else{
                        //System.out.println(str);
                        double num = Double.parseDouble(str);
                        operands.push(num);
                    }
                }

                while(operators.size() != 0){
                    char operator = operators.pop();
                    double num2 = operands.pop();
                    double num1 = operands.pop();

                    double res = operation(num1, num2, operator);
                    operands.push(res);
                }

                //System.out.println(operands.peek());

                result += " = " + Double.toString(operands.peek());
                resultView.setText(Double.toString(operands.peek()));
                tmpResult = result;
                flgEqual = true;
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String result = equationView.getText().toString();
                result += ".";
                equationView.setText(result);
            }
        });

        btnCLR.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                equationView.setText("");
                resultView.setText("");
            }
        });

        btnDEL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                String result = equationView.getText().toString();
                if(!result.isEmpty()){
                    if(result.charAt(result.length()-1) == ' '){
                        result = result.substring(0, result.length()-3);
                    }
                    else{
                        result = result.substring(0, result.length()-1);
                    }
                }
                equationView.setText(result);
            }
        });

    }


}