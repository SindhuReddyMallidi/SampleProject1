package com.example.sindhu.sampleproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView,textView1;
    String p,q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        p=getIntent().getStringExtra(getString(R.string.tostring));
        q=getIntent().getStringExtra(getString(R.string.fromstring));
        textView=findViewById(R.id.text_id);
        textView1=findViewById(R.id.text_ids);
        textView.setText(p);
        textView1.setText(q);

    }
}
