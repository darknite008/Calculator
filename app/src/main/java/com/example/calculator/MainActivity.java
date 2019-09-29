package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private  Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnmulti, btndiv, btnadd, btnsub, btnequ, btnper,btnc;
   private TextView etntext;
   private double first,second;
   private boolean addition,subtract,multiply,division,percent;

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
        btnadd = (Button) findViewById(R.id.btnSum);
        btnsub = (Button) findViewById(R.id.btnSub);
        btndiv = (Button) findViewById(R.id.btnDiv);
        btnmulti = (Button) findViewById(R.id.btnMulti);
        btnper = (Button) findViewById(R.id.btnPer);
        btnequ = (Button) findViewById(R.id.btnEqu);
        btnc = (Button) findViewById(R.id.btnC);

        etntext = (TextView) findViewById(R.id.etValue);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etntext.setText(etntext.getText()+"9");
            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Double.parseDouble(etntext.getText()+"");
                addition=true;
                etntext.setText(null);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Double.parseDouble(etntext.getText()+"");
                subtract=true;
                etntext.setText(null);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Double.parseDouble(etntext.getText()+"");
                multiply=true;
                etntext.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Double.parseDouble(etntext.getText()+"");
                division=true;
                etntext.setText(null);
            }
        });

        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double var=100;
                first=Double.parseDouble(etntext.getText()+"");
                etntext.setText(first/var+"");
            }
        });

        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=Double.parseDouble(etntext.getText()+"");

                if (addition==true) {
                    etntext.setText(first+second +"");
                    addition=false;
                }
                if (subtract==true) {
                    etntext.setText(first-second +"");
                    subtract=false;
                }
                if (multiply==true) {
                    etntext.setText(first*second +"");
                    multiply=false;
                }
                if (division==true) {
                    etntext.setText(first/second +"");
                    division=false;
                }
                if (division==true) {
                    etntext.setText(first/second +"");
                    division=false;
                }else{
                    return;
                }
                       }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Clear();
            }
        }); }

    private void Clear() {
        etntext.setText("");
    }}
