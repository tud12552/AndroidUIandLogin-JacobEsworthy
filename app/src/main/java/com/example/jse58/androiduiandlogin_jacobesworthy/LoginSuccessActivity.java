package com.example.jse58.androiduiandlogin_jacobesworthy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginSuccessActivity extends AppCompatActivity {

    private TextView mTxtViewWelcomeMessage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        mTxtViewWelcomeMessage = findViewById(R.id.txtViewLoginSuccess);

        StringBuilder strBuild = new StringBuilder();
        //strBuild.append()))
    }
}
