package com.example.gyf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);  // 去掉标题栏

        setContentView(R.layout.activity_main);

        // 显示 模式选择 界面
//        FragmentManager fm = getSupportFragmentManager();
//        fm.beginTransaction().add(R.id.begin_placrholder, new modelChoose()).commitNow();
    }
}