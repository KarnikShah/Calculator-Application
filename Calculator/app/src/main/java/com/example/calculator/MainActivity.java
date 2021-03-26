package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSubtract, btnMultiply, btnDivide, btnDot, btnPercent, btnClear, btnEqual;
    TextView ed1,t1;
    Float res1,res2;
    Boolean Add=false, Sub=false, Mul=false, Div=false, Per=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);

        btnEqual = (Button) findViewById(R.id.btnEqual);

        btnClear = (Button) findViewById(R.id.btnClear);

        btnDot = (Button) findViewById(R.id.btnDot);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        ed1 = (TextView) findViewById(R.id.ed1);
        t1=(TextView) findViewById(R.id.t4);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                t1.setText(null );
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") || t1.getText().equals("%")) {
                    Sub = false;
                    Mul = false;
                    Div = false;
                    Per = false;
                    Add = true;
                    t1.setText("+");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Add = true;
                    Sub = Mul = Div = Per = false;
                    ed1.setText(null);
                    t1.setText("+");
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().equals("+") || t1.getText().equals("*") || t1.getText().equals("/") || t1.getText().equals("%")) {
                    Add = false;
                    Mul = false;
                    Div = false;
                    Per = false;
                    Sub = true;
                    t1.setText("-");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Sub = true;
                    Add = Mul = Div = Per = false;
                    ed1.setText(null);
                    t1.setText("-");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("/") || t1.getText().equals("%")) {
                        Add = false;
                        Sub = false;
                        Div = false;
                        Per = false;
                        Mul = true;
                        t1.setText("*");
                    } else {
                        res1 = Float.parseFloat(ed1.getText()+"");
                        Mul = true;
                        Sub = Add = Div = Per = false;
                        ed1.setText(null);
                        t1.setText("*");
                    }
                }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().equals("+") || t1.getText().equals("*") || t1.getText().equals("-") || t1.getText().equals("%")) {
                    Add = false;
                    Mul = false;
                    Sub = false;
                    Per = false;
                    Div = true;
                    t1.setText("/");
                } else {
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Div = true;
                    Sub = Mul = Add = Per = false;
                    ed1.setText(null);
                    t1.setText("/");
                }
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().equals("+") || t1.getText().equals("*") || t1.getText().equals("/") || t1.getText().equals("-")) {
                    Add = false;
                    Mul = false;
                    Div = false;
                    Sub = false;
                    Per = true;
                    t1.setText("%");
                } else {
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Per = true;
                    Add = Sub = Mul = Div = false;
                    res1=res1/100;
                    ed1.setText(null);
                    t1.setText("%");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText()+"");
                t1.setText("=");
                if (Add == true) {
                    ed1.setText(res1+res2 + "");
                    Add = false;
                }
                else if (Sub == true) {
                    ed1.setText(res1-res2 + "");
                    Sub = false;
                }
                else if (Mul == true) {
                    ed1.setText(res1*res2 + "");
                    Mul = false;
                }
                else if (Div == true) {
                    ed1.setText(res1/res2 + "");
                    Div = false;
                }
                else if (Per == true) {
                    ed1.setText(res1*res2 + "");
                    Per = false;
                }

            }
        });
    }
}