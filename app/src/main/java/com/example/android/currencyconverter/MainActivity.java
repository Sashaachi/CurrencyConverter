package com.example.android.currencyconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Dollars;
    private EditText Kenyan;
    private Button Convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dollars=findViewById(R.id.et_us);
        Kenyan=findViewById(R.id.tv_displayksh);
        Convert=findViewById(R.id.btn_convert);


        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Kenyan.getText().toString().isEmpty()) {
                    convertDollarToKsh();
                }
                if (Dollars.getText().toString().isEmpty()) {
                    convertKshtoDollar();
                }
            }
        });

        }
        @SuppressLint("SetTextI18n")
        public void convertDollarToKsh(){
        double val=Double.parseDouble(Dollars.getText().toString());

        Kenyan.setText(Double.toString(val*100));
        }
    @SuppressLint("SetTextI18n")
    public void convertKshtoDollar(){
        double val=Double.parseDouble(Kenyan.getText().toString());

        Dollars.setText(Double.toString(val/100));
    }
    @SuppressLint("SetTextI18n")
    public void refresh(View v){
        Dollars.setText(Double.toString(0));
        Kenyan.setText(Double.toString(0));
    }
    public void exit(View v){
        finish();
    }
}
