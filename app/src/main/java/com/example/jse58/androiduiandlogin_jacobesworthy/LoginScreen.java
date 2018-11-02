package com.example.jse58.androiduiandlogin_jacobesworthy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    private ImageView mLoginImgView = null;
    private EditText mEditTxtEmail = null;
    private EditText mEditTxtPswd = null;
    private Button mBtnLogin = null;
    private TextView mTxtViewOr = null;
    private Button mBtnSignUp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        mLoginImgView = findViewById(R.id.imageViewLogin);
        mEditTxtEmail = findViewById(R.id.editTxtEmail);
        mEditTxtPswd = findViewById(R.id.editTxtPassowrd);
        mBtnLogin = findViewById(R.id.BtnLogin);
        mBtnSignUp = findViewById(R.id.BtnSignUp);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"@string/ToastToSuccessLoginStr",Toast.LENGTH_SHORT).show();

                Intent intentLoginSuccess = new Intent(LoginScreen.this, LoginSuccessActivity.class);
                intentLoginSuccess.putExtra("NAME", "Jacob");
                intentLoginSuccess.putExtra("SURNAME", "Esworthy");
                intentLoginSuccess.putExtra("BIRTHDAY", "April 20, 1993");

                startActivity(intentLoginSuccess);
            }
        });
    }
}
