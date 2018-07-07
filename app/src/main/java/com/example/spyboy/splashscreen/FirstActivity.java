
package com.example.spyboy.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void facultylogin(View view) {
        Intent intent=new Intent(FirstActivity.this,SplashScreenActivity.class);
        startActivity(intent);
    }
    public void studentlogin(View view) {
        Intent intent=new Intent(FirstActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}

