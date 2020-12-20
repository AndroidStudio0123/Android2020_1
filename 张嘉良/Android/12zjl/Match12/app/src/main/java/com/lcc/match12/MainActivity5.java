package com.lcc.match12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    CheckBox checkBox,checkBox2,checkBox3,checkBox4;
    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        tv = findViewById(R.id.Tv);
        bt = findViewById(R.id.Bt);
        bt.setOnClickListener(new View.OnClickListener() {
            String like="";
            @Override
            public void onClick(View v) {
                CheckBox[]checkBoxes=new CheckBox[]{checkBox,checkBox2,checkBox3,checkBox4};
                for(int i=0;i<checkBoxes.length;i++){
                    if (checkBoxes[i].isChecked()){
                        like+=checkBoxes[i].getText().toString()+",";
                    }
                }
                Toast.makeText(MainActivity5.this, like, Toast.LENGTH_SHORT).show();
                like="";
            }
        });
    }
}