package com.example.lenovo.sp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText un,pn;
Button LOGIN;
@override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText)findViewById(R.id.editText);
        pn=(EditText)findViewById(R.id.editText2);
        LOGIN=(Button)findViewById(R.id.button);

        SharedPreferences=getSharedPreferences("my shared",context.mode_private);
        String ukey="usrname",pkey="passwod";
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=un.getText().toString();
                String pass=pn.getText().toString();
                String Log=LOGIN.getText().toString();

                SharedPreferences.Editor editor=SharedPreferences.edit();
                editor.putString(ukey,uname);
                editor.putString(pkey.pass);
                editor.commit();


            toast.makeText(mainActivity.This,"saved", Toast.LENGTH_SHORT).show();
            }
        }