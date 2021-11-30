package com.example.practice_ground;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Practice_Layout_2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.practice_layout_2);
        // 이 클래스에선 layout(xml파일)이 필요없다, java로만 작업하는것이기 때문

        // LayoutParams에선 레이아웃의 패러미터를 설정한다
        // 패러미터는 Width, Height가 들어가며 weight를 지정하고싶다면
        // (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1)의 형태로 지정한다
        // 본인의 경우 직접 풀어보기 5-3을 위해 높이를 줄였다
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400);

        LinearLayout baseLayout = new LinearLayout(this); // 레이아웃 변수를 선언한다 XML코드 <LinearLayout> </LinearLayout>와 동일하다
        baseLayout.setOrientation(LinearLayout.VERTICAL); // 레이아웃의 orientation을 설정한다 android:orientation = "vertical"과 동일하다
        baseLayout.setBackgroundColor(Color.rgb(0,255,0)); // 레이아웃의 색상을 지정한다 android:background = "#00ff00"과 동일하다
        setContentView(baseLayout, params); // 준비된 레이아웃 변수를 화면에 출력한다다

        TextView txt1 = new TextView(this);
        txt1.setText("예제 5-8,9");
        txt1.setTextSize(30);
        baseLayout.addView(txt1);

        // 이어서 버튼을 생성한다
        Button btn = new Button(this); // 버튼 변수를 생성한다
        btn.setText("버튼입니다"); // 버튼에 글자를 설정한다
        btn.setBackgroundColor(Color.MAGENTA); // 버튼의 색상을 지정한다, Color클래스에 상수로 지정된 것을 사용해도 된다
        baseLayout.addView(btn); // 준비된 버튼을 레이아웃에 출력한다 baseLayout은 바로 위에서 선언한 레이아웃이다
        // 지금은 위젯 변수만 남기고 레이아웃 파라미터를 생략했는데, 이럴경우 width는 match_parent가 되고 height는 wrap_content가 된다

        // 버튼 클릭 이벤트는 똑같다
       btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "java코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
            }
        });

       Button btn2 = new Button(this);
       btn.setText("화면바꾸기");
       baseLayout.addView(btn2);



       /////////////////////////////////////////////////// 직접 풀어보기 5-3 /////////////////////////////////////////////////


       LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params3.setMargins(0, 30, 0, 0);

       LinearLayout secondLayout = new LinearLayout(this);
       secondLayout.setOrientation(LinearLayout.VERTICAL);

        TextView txt2 = new TextView(this);
        txt2.setText("직접 풀어보기 5-3");
        txt2.setTextSize(30);
        secondLayout.addView(txt2, params3);

        EditText ed1 = new EditText(this);
        secondLayout.addView(ed1, params2);

        Button read = new Button(this);
        read.setText("에디텍스트 읽기");
        secondLayout.addView(read);

        TextView txt3 = new TextView(this);
        txt3.setText("아래에 출력 :");
        secondLayout.addView(txt3);

        TextView txt4 = new TextView(this);
        txt4.setTextSize(30);
        secondLayout.addView(txt4);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt4.setText(ed1.getText() + ""); // + ""는 null값을 집어넣어 getText()만 했을때 밑줄까지 불러오는걸 방지하는것이다
            }
        });



        LinearLayout aroundLayout = new LinearLayout(this);
        aroundLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(aroundLayout, params2);

        aroundLayout.addView(baseLayout);
        aroundLayout.addView(secondLayout); // aroundLayout에 baseLayout과 secondLayout을 모두 표시한다


   }
}
