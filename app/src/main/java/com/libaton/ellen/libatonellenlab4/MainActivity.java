package com.libaton.ellen.libatonellenlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button txtbtn;
    Button textbot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtbtn = (Button) findViewById(R.id.button2);
        txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(findViewById(android.R.id.content), "Say Hi to the Snackbar!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Log.d("toast","onCreate() was called on Snackbar");


            }
        });

        textbot = (Button) findViewById(R.id.button);
        textbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello Toast!",Toast.LENGTH_SHORT).show();
                Log.d("toast","onCreate() was called on Toast");
            }
        });




    }
}
