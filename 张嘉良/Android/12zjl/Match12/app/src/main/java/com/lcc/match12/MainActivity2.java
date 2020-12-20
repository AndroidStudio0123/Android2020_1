package com.lcc.match12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                EditText login = (EditText) findViewById(R.id.username);
                EditText reg = (EditText) findViewById(R.id.password);
                if (login.getText().toString().equals("123")&& reg.getText().toString().equals("123")){
                    intent.putExtra("username",login.getText().toString());
                    intent.putExtra("password",reg.getText().toString());
                    startActivity(intent);
                }else{
                        AlertDialog dialog;
                        dialog = new AlertDialog.Builder(MainActivity2.this)
                                .setMessage("用户名或密码错误")
                                .setPositiveButton("确定",null)
                                .create();
                        dialog.show();
                }

            }
        });
    }
}