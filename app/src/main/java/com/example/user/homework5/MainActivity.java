package com.example.user.homework5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_screen1 = (Button) findViewById(R.id.ma_button1);
        Button b_screen2 = (Button) findViewById(R.id.ma_button2);

        b_screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Screen1Activity.class);
                startActivity(intent);
            }
        });

        b_screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Screen2Activity.class);
                startActivity(intent);
            }
        });
    }
}
