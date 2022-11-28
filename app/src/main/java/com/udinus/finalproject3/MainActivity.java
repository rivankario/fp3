package com.udinus.finalproject3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView a, b;
    Double n1, n2, ans;
    String s, v1, v2;
    boolean c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (TextView) findViewById(R.id.x);
        b = (TextView) findViewById(R.id.y);
        c = false;

    }

    @SuppressLint("SetTextI18n")
    public void btn_0(View view) {
        a.setText(a.getText() + "0");
    }
    @SuppressLint("SetTextI18n")
    public void btn_1(View view) {
        a.setText(a.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn_2(View view) {
        a.setText(a.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn_3(View view) {
        a.setText(a.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn_4(View view) {
        a.setText(a.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn_5(View view) {
        a.setText(a.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn_6(View view) {
        a.setText(a.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn_7(View view) {
        a.setText(a.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn_8(View view) {
        a.setText(a.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn_9(View view) {
        a.setText(a.getText() + "9");
    }


    public void btn_tambah(View view) {
        s = "+";
        v1 = a.getText().toString();
        a.setText(null);
        b.setText("+");
        c = false;
    }

    public void btn_kurang(View view) {
        s = "-";
        v1 = a.getText().toString();
        a.setText(null);
        b.setText("-");
        c = false;
    }

    public void btn_kali(View view) {
        s = "*";
        v1 = a.getText().toString();
        a.setText(null);
        b.setText("×");
        c = false;
    }

    public void btn_bagi(View view) {
        s = "/";
        v1 = a.getText().toString();
        a.setText(null);
        b.setText("÷");
        c = false;
    }

    public void btn_answer(View view) {
        if (s == null) {
            b.setText("Error!");
        } else if (a.getText().equals("")) {
            b.setText("Error!");
        } else if ((s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) && v1.equals("")) {
            b.setText("Error!");
        } else {
            switch (s) {
                case "+":
                    v2 = a.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    ans = n1 + n2;
                    a.setText(ans + "");
                    s = null;
                    b.setText(null);
                    break;
                case "-":
                    v2 = a.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    ans = n1 - n2;
                    a.setText(ans + "");
                    s = null;
                    b.setText(null);
                    break;
                case "*":
                    v2 = a.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    ans = n1 * n2;
                    a.setText(ans + "");
                    s = null;
                    b.setText(null);
                    break;
                case "/":
                    v2 = a.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    ans = n1 / n2;
                    a.setText(ans + "");
                    s = null;
                    b.setText(null);
                    break;
                default:
                    break;
            }
        }
    }

    public void btn_clear(View view) {
        a.setText(null);
        b.setText(null);
        v1 = null;
        v2 = null;
        s = null;
        c = false;
    }

    public void btn_persen(View view) {
        float soal = Float.valueOf(a.getText().toString());
        a.setText(String.valueOf(Integer.valueOf((int) soal)) + "%");
        b.setText(String.valueOf(soal / 100));
    }
}