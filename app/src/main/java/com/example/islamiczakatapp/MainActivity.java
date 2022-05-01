
package com.example.islamiczakatapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Zakkat;
    Button Fitrana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Zakkat=(Button) findViewById(R.id.Zakwat);
        Zakkat.setOnClickListener(this);
        Fitrana=(Button) findViewById(R.id.Fitrana);
        Fitrana.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.Zakwat:
                startActivity(new Intent(MainActivity.this, ZakatPage.class));
                break;
            case R.id.Fitrana:
                startActivity(new Intent(MainActivity.this, activity_Fitrana.class));
                break;
        }
    }
}