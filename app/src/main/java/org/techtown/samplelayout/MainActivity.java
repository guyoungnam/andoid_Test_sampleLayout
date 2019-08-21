package org.techtown.samplelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Layout1 layout1 = findViewById(R.id.layout1); //xml 레이아웃에 추가한 뷰 참조하기

        layout1.setImage(R.drawable.profile1);
        layout1.setName("김민수");
        layout1.setMobile("010-4433-2233");  //뷰의 메서드 호출하여 데이터 설정하기

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layout1.setImage(R.drawable.profile1); //버튼 클랙했을 때 이미지 설정하기

            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                layout1.setImage(R.drawable.profile2);
            }
        });



    }
}
