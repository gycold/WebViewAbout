package com.example.webviewabout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.webviewabout.AndroidCallJs.AndCallJsActivity1;
import com.example.webviewabout.AndroidCallJs.AndCallJsActivity2;
import com.example.webviewabout.JsCallAndroid.JsCallAndActivity1;
import com.example.webviewabout.JsCallAndroid.JsCallAndActivity2;
import com.example.webviewabout.JsCallAndroid.JsCallAndActivity3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AndJs1(View view) {
        Intent intent = new Intent(this, AndCallJsActivity1.class);
        startActivity(intent);
    }

    public void AndJs2(View view) {
        Intent intent = new Intent(this, AndCallJsActivity2.class);
        startActivity(intent);
    }

    public void JsAnd1(View view) {
        Intent intent = new Intent(this, JsCallAndActivity1.class);
        startActivity(intent);
    }

    public void JsAnd2(View view) {
        Intent intent = new Intent(this, JsCallAndActivity2.class);
        startActivity(intent);
    }

    public void JsAnd3(View view) {
        Intent intent = new Intent(this, JsCallAndActivity3.class);
        startActivity(intent);
    }
}