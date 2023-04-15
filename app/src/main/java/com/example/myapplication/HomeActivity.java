package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {
EditText country,duration;

RadioGroup style;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         Button submit=(Button)findViewById(R.id.xyz);
country=(EditText) findViewById(R.id.destination);
duration=(EditText) findViewById(R.id.days);
style=(RadioGroup) findViewById(R.id.radioGroup);

submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String result="Fair to "+  country.getText() +"  for  "+duration.getText()+" days   by  ";
        int id=style.getCheckedRadioButtonId();
        RadioButton radioButton=findViewById(id);
        result+=radioButton.getText()+"  is ";
        int amount=country.getText().length()*duration.getText().length()*radioButton.getText().length();
        result+=amount+"  rupees";




       Intent intent=new Intent(HomeActivity.this,ResultActivity.class);
       intent.putExtra("result",result);
       startActivity(intent);

    }
});




    }
}