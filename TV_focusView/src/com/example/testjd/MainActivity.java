package com.example.testjd;

import android.os.Bundle;

public class MainActivity extends BaseAcitivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        flyBorder.attach2Window(this); //动态添加到当前窗口
    }
}
