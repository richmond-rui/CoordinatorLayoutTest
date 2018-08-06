package com.lanlengran.coordinatorlayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        try {
//            Log.d("qin","a.size"+"a".getBytes("GB2312").length);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
}
