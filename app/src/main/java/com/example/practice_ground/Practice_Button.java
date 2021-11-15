package com.example.practice_ground;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Practice_Button extends Activity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    EditText edit1;
    Button btn6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_button);
        //새로운 액티비티를 생성하면 위 코드를 반드시 입력해야한다
        // onCreate에서 on만 쳐도 자동입력이 나오니 간단히 할 수 있다
        // 마지막으로 setContentView를 입력해서 불러올 레이아웃을 설정
        btn1 = (Button) findViewById(R.id.btntoast);
        btn2 = (Button) findViewById(R.id.btnopen);
        btn3 = (Button) findViewById(R.id.btnclose);
        btn4 = (Button) findViewById(R.id.btnhidden1);
        btn5 = (Button) findViewById(R.id.btnhidden2);
        edit1 = (EditText) findViewById(R.id.edit001);
        btn6 = (Button) findViewById(R.id.btnnew);

        btn3.setVisibility(View.GONE);
        edit1.setVisibility(View.GONE);
        btn4.setVisibility(View.GONE);
        btn5.setVisibility(View.GONE);
        // 버튼을 숨겨놓아 필요시에만 보이게 한다
        // btn.setVisibillity(View.VISIBLE), (View.GONE), (View.INVISIBLE)등등이 있다
        // 버튼 비활성화 시에는 btn.setEnabled(true or false)를 이용한다

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "호우!", Toast.LENGTH_SHORT).show();
                // 기본적인 토스트 메세지 출력문
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.GONE);
                btn3.setVisibility(View.VISIBLE);
                edit1.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                btn5.setVisibility(View.VISIBLE);
                // 숨겨놓은 버튼을 보이게 하고 미관을 위해 열기버튼을 숨긴다
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.GONE);
                edit1.setVisibility(View.GONE);
                btn4.setVisibility(View.GONE);
                btn5.setVisibility(View.GONE);
                edit1.setText(null);// edittext의 값을 null로 지정해줌으로써 초기화시킨다
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edit1.getText(), Toast.LENGTH_SHORT).show();
                // edittext에서 불러오고싶다면 해당 객체의 주소에서 불러오는 명령어 getText()를 쓴다
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Intent.ACTION_VIEW, Uri.parse(edit1.getText().toString()));
                startActivity(open);
                // Intent는 컴포넌트간의 통신을 맡고 있다
                // Intent.ACTION_VIEW에 뭐가 들어오는지에 따라 실행방향이 결정된다
                // toString 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드이다
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }


}
