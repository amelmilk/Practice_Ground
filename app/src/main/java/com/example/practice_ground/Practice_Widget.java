package com.example.practice_ground;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

public class Practice_Widget extends Activity {
    CheckBox check1, check2, check3;
    RadioGroup rGroup1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_widget);
        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        // Java코드에서 체크박스는 강제로 체크를 켜거나 끄는 setChecked(), 체크 상태를 반대로 바꾸는 toggle(),
        // 체크되었는지 확인하는 isChecked() 등의 메소드를 많이 사용한다
        // 버튼에서 OnClickListener를 사용했듯이, 체크박스는 OnCheckedChangeListner리스너를 사용할수 있다
        // 체크박스도 TextView의 하위호환이다

        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        // 라디오그룹에서 가끔 사용되는 메소드는 clearCheck()인데, 그룹안에 체크된걸 모두 해제해준다

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {// 체크박스는 new Compound쳐야됨
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

    }
}
