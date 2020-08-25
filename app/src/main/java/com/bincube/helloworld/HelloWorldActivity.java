package com.bincube.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {
    String msg = "Android: ";

    /**
    * 修改国会大厦公司vhj
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(msg,"The onCreat() event");
      //  Log.d("HelloWorldActivity","onCreat execute");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"The onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"The onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"The onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"The onDestory() event");
    }

}
