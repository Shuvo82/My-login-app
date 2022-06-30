package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username=findViewById(R.id.username);
        EditText pass=findViewById(R.id.pass);
        TextView forgotPass=findViewById(R.id.forgotpass);
        MaterialButton loginButton=(MaterialButton) findViewById(R.id.login);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && pass.getText().toString().equals("123")){

                    Toast.makeText(getApplicationContext(), "Successfully logged In", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        public void onLoginClick(new View){
//            startActivity(new Intent(this,test.class));
//            //overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
//
//        }

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),test.class));

            }
        });



    }
}