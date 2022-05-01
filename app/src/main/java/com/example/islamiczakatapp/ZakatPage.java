package com.example.islamiczakatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ZakatPage  extends AppCompatActivity implements View.OnClickListener{


        int amount=0;
        Button cal;
        Button reset;
        TextView result;
        EditText inp;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_zakwat_page);
            cal=(Button) findViewById(R.id.Cal);
            reset=(Button) findViewById(R.id.Reset);
            result=(TextView) findViewById(R.id.Result);
            inp=(EditText) findViewById(R.id.Input);
            cal.setOnClickListener(this);
            reset.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.Cal:
                    if(inp.getText()+""!="")
                    {
                        if(Integer.parseInt(inp.getText().toString())>=84000) {
                            amount = Integer.parseInt(inp.getText().toString());
                        }
                        else {
                            Toast.makeText( this , "Zawkat Not Applicable", Toast.LENGTH_SHORT).show();
                            amount=0;
                        }
                    }
                    else {
                        amount=0;
                    }
                    amount*=0.025;
                    result.setText("RS. "+amount);
                    break;
                case R.id.Reset:
                    amount=0;
                    result.setText("RS. "+amount);
                    inp.setText("");
                    break;
            }
        }
}
