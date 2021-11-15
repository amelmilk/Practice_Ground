package com.example.practice_ground;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Practice_Calc extends Activity {

    EditText ed1, ed2;
    Button btn1, btn2, btn3, btn4, btn5;
    TextView text1;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_calc);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        text1 = (TextView) findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")){ // trim()은 공백을 제거해주는 명령어
                    Toast.makeText(getApplicationContext(),"오류 발생, 값을 입력하시오",Toast.LENGTH_SHORT).show();
                }
                // ed1또는(or -> ||) ed2에 아무것도 입력하지 않았을경우 num1이나 num2에 아무것도 없기 때문에 Toast메세지를 출력한다
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    text1.setText("계산 결과 : " + result.toString());
                }
                // 아닐경우 실행결과 출력

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                if (num1.equals("") || num2.equals("")){
                    Toast.makeText(getApplicationContext(),"오류 발생, 값을 입력하시오",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    text1.setText("계산 결과 : " + result.toString());
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                if (num1.equals("") || num2.equals("")){
                    Toast.makeText(getApplicationContext(),"오류 발생, 값을 입력하시오",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    text1.setText("계산 결과 : " + result.toString());
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                if (num1.equals("") || num2.equals("")){
                    Toast.makeText(getApplicationContext(),"오류 발생, 값을 입력하시오",Toast.LENGTH_SHORT).show();
                }
                // 우선 입력값이 있는지 확인한다
                else if(num2.equals("0")){
                    Toast.makeText(getApplicationContext(), "0으로 나눌수는 없습니다",Toast.LENGTH_SHORT).show();
                }
                // 만약 나눌값에 0이 있다면 토스트메세지를 출력한다
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    text1.setText("계산 결과 : " + result.toString());
                }
                // 아닐경우 결과값 출력

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                if (num1.equals("") || num2.equals("")){
                    Toast.makeText(getApplicationContext(),"오류 발생, 값을 입력하시오",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    text1.setText("계산 결과 : " + result.toString());
                }
                // 나머지값을 구하는 수식 (%)

            }
        });


    }
}
