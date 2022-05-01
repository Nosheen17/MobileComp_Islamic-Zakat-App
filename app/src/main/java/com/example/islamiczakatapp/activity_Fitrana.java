package com.example.islamiczakatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_Fitrana extends AppCompatActivity implements View.OnClickListener {

    int count=0;
    int amount=0;
    Button wheat;
    Button date;
    Button Raisins;
    TextView result;
    EditText inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Fitrana);
        wheat=(Button) findViewById(R.id.wheat);
        wheat.setOnClickListener(this);
        date=(Button) findViewById(R.id.date);
        date.setOnClickListener(this);
        Raisins=(Button) findViewById(R.id.raisins);
        Raisins.setOnClickListener(this);
        result=(TextView) findViewById(R.id.result);
        inp=(EditText) findViewById(R.id.inp);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.wheat:
                if(inp.getText()+""!="")
                {
                    count=Integer.parseInt(inp.getText().toString());
                    amount=amount+160*count;
                }
                else
                {
                    amount=0;
                    count=0;
                }
                result.setText("RS. "+amount);
                amount=0;
                count=0;
                break;
            case R.id.date:
                if(inp.getText()+""!="")
                {
                    count=Integer.parseInt(inp.getText().toString());
                    amount=amount+675*count;
                }
                else
                {
                    amount=0;
                    count=0;
                }
                result.setText("RS. "+amount);
                amount=0;
                count=0;
                break;
            case R.id.raisins:
                if(inp.getText()+""!="")
                {
                    count=Integer.parseInt(inp.getText().toString());
                    amount=amount+1875*count;
                }
                else
                {
                    amount=0;
                    count=0;
                }
                result.setText("RS. "+amount);
                amount=0;
                count=0;
                break;
        }
    }
}