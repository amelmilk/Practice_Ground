package com.example.practice_ground;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.translation.ViewTranslationCallback;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Practice_4P extends Activity {

    int a = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_4p);

        CheckBox c1, c2, c3;
        Button b1, b2;
        EditText ed1;
        ImageView im1;
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        ed1 = (EditText) findViewById(R.id.ed1);
        im1 = (ImageView) findViewById(R.id.im1);
        int b = 0;


        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (c1.isChecked()) {
                    b1.setEnabled(false);
                } else {
                    b1.setEnabled(true);
                }
                // c1이 isChecked되었을땐 버튼을 사용하지 못하게 하고
                // c1이 체크해제되었을땐 버튼을 사용할수 있게 한다
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (c2.isChecked()) {
                    b1.setClickable(false);
                } else {
                    b1.setClickable(true);
                }

            }
        });

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (c3.isChecked()) {
                    b1.setRotation(45);
                } else {
                    b1.setRotation(0);
                }

            }
        });

        ed1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Toast.makeText(getApplicationContext(), ed1.getText(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // setOnKeyListener로 에디텍스트의 키가 눌릴때마다 글자가 토스트 메세지로 나오도록 설정했다

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + 10;
                im1.setRotation(a);
                if (a == 360) { // 각도가 360이 되었을경우
                    Toast.makeText(getApplicationContext(), "치야아아아아앗!!", Toast.LENGTH_SHORT).show();
                    a = 0;
                    // 0으로 조정하고 메세지 출력
                }
            }
        }); // 앞서 선언된 변수 a값을 받아와서 버튼이 눌릴때마다 a값에 10을 더하고
        // 더한값을 불러와서 적용시킨다

    }
}
