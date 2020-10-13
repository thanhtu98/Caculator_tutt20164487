package com.example.caculator_tutt20164487;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bEqual, add, sub,
            mul, div, clear, clearAll, del, sign, point;
    TextView txt1;
    Double var1 = null;
    Double var2 = null;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSubtract);
        mul = findViewById(R.id.buttonMultiply);
        div = findViewById(R.id.buttonDivide);
        bEqual = findViewById(R.id.buttonEquals);
        clear = findViewById(R.id.buttonClearMemory);
        clearAll = findViewById(R.id.buttonClear);
        del = findViewById(R.id.buttonDelete);
        sign = findViewById(R.id.buttonToggleSign);
        point = findViewById(R.id.buttonDecimalPoint);

        txt1 = findViewById(R.id.textView1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
            }
        });

        //phep cong
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                addition = true;
            }
        });
        //To phep tru
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                subtract = true;
            }
        });
        //To phep nhan
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                multiply = true;
            }
        });
        //To phep chia
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                divide = true;
            }
        });

        //xoa toan hang hien tai
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
            }
        });

        //xoa tat ca phep tinh hien tai
        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        //xoa 1 chu so cua toan hang hien tai
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt1.getText().toString();
                txt1.setText(s.substring(0, s.length()-1));
            }
        });
        //tinh ket qua
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(txt1.getText().toString());
                if(addition){
                    ans = var1 + var2;
                } else if (subtract){
                    ans = var1 - var2;
                } else if (multiply){
                    ans = var1 * var2;
                } else if (divide){
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
                var2 = null;
                var1 = null;
                txt1.setText(ans.toString());
                resetCall();

            }
        });
    }
    //khoa cac phep tinh
    public void buttonFalse(){
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        txt1.setText("");
    }
    //gan bien var1
    public void setVar1(){
        var1 = Double.parseDouble(txt1.getText().toString());
    }
    
    public void allReset(){
        bEqual.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        txt1.setText("");
    }

    //reset cac phep tinh toan, de thuc hien tiep phep toan voi ket qua hien tai
    public void resetCall(){
        bEqual.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
    }


}
