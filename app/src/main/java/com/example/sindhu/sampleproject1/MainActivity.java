package com.example.sindhu.sampleproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button;
    String result,result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button_id);
        editText1=findViewById(R.id.to_id);
        editText2=findViewById(R.id.from_id);
        }

    public void gencard(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        result=editText1.getText().toString();
        result1=editText2.getText().toString();
        intent.putExtra(getString(R.string.tostring),result);
        intent.putExtra(getString(R.string.fromstring),result1);
        startActivity(intent);
        }
}
