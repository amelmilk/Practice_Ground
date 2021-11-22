package com.example.practice_ground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// ctrl + alt + O = 불필요한 임포트 제거
// ctrl + space = 자동입력
public class MainActivity extends AppCompatActivity {
    //위젯 객체 설정
    Button move001;
    Button move101;
    Button move002;
    Button move102;
    Button move003, move004;
    Button move103, move104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 레이아웃에서 할당된 id를 위젯 주소에 할당, 위젯 객체와 레이아웃의 id는 다를수 있음, 편의를 위해 동일하게 설정
        move001 = (Button)findViewById(R.id.move001);
        move101 = (Button)findViewById(R.id.move101);
        move002 = (Button)findViewById(R.id.move002);
        move102 = (Button)findViewById(R.id.move102);
        move003 = (Button)findViewById(R.id.move003);
        move103 = (Button)findViewById(R.id.move103);
        move004 = (Button)findViewById(R.id.move004);
        move104 = (Button)findViewById(R.id.move104);


        move001.setOnClickListener(new View.OnClickListener() { // 새로운 화면을 띄우는 명령, 새 클래스를 만들었으면 manifests에 꼭 등록해야한다
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice_Button.class); // 코드 외워두자 getApplicationContext(), 뒤에는 액티비티.class가 와야함
                startActivity(intent); // 설정된 intent를 시작해줘야함
                // Intent는 컴포넌트간의 통신을 맡고 있다
            }
        });

        move101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Practice_Layout.class));
                // 굳이 Intent intent 선언하고 startActivity 따로할필요 없이
                // 바아로 startActivity(new Intent)해도 된다
            }
        });

        move002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), View_Class.class);
                startActivity(intent); // 반드시 Intent intent일 필요는 없다 변수 이름을 지정해주는것, Intent a로 해도 상관x
            }
        });

        move102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice_Spinsize.class);
                startActivity(intent);
            }
        });

        move003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice4_2.class);
                startActivity(intent);
            }
        });

        move103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice_Text.class);
                startActivity(intent);
            }
        });

        move004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice_Calc.class);
                startActivity(intent);
            }
        });

        move104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practice_Widget.class);
                startActivity(intent);
            }
        });




    }
}