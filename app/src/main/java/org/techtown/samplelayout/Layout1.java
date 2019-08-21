package org.techtown.samplelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Layout1 extends LinearLayout { //LinearLayout 클래스 상속하여 새로운 클래스 정의하기

    ImageView imageView;
    TextView textView;
    TextView textView2;

    public Layout1(Context context) {
        super(context);
        init(context);
    }

    public Layout1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //인플레이션 진행하기

        inflater.inflate(R.layout.layout1, this, true); //메인 레이아웃에 추가되어 사용,

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView3);
        textView2= findViewById(R.id.textView4);  //XML 레이아웃에서 정의했던 뷰 참조하기

    }

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

    public void setName(String name){
        textView.setText(name);
    }
    public void setMobile(String mobile){     //뷰에 대이터 설정하기
        textView2.setText(mobile);
    }
}
