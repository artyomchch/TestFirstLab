package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);



        tvOut =  findViewById(R.id.tvOut);
        btnOk =  findViewById(R.id.btnOk);
        btnCancel =  findViewById(R.id.btnCancel);


        View.OnClickListener btnCL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        btnCancel.setOnClickListener(btnCL);

//        Switch sw = findViewById(R.id.dogrun);
//        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                ImageView Sleepdog = (ImageView) findViewById(R.id.imageView2);
//                Sleepdog.setBackgroundResource(R.drawable.animation_dog);
//
//                AnimationDrawable animation = (AnimationDrawable) Sleepdog.getBackground();
//                if (isChecked) {
//                    animation.start();// The toggle is enabled
//                } else {
//
//                    animation.stop(); // The toggle is disabled
//                }
//            }
//        });
    }

    public void onOkButtonClick(View view) {
        tvOut.setText("Нажата кнопка Ok");
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }




}
