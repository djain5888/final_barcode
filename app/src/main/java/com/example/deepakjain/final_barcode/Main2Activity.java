package com.example.deepakjain.final_barcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Intent intent=getIntent();
        String s1=intent.getStringExtra("info");
        t1=findViewById(R.id.textView);
        t1.setText(s1);
        Button b1=findViewById(R.id.button3);
        final Intent intent1=new Intent(this,Main3Activity.class);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

    }
}
