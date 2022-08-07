package com.example.myapplicationcw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Ed1 = findViewById(R.id.edit1);
        EditText Ed2 = findViewById(R.id.edit2);
        Button b = findViewById(R.id.button);
        TextView t = findViewById(R.id.textView);
        TextView t2 = findViewById(R.id.textView2);
        Button  b2 = findViewById(R.id.button2);



       b.setOnClickListener(new View.OnClickListener() {
       @Override
           public void onClick(View view)  {
           int num1 = Integer.parseInt(Ed1.getText().toString());
           int num2 = Integer.parseInt(Ed2.getText().toString());

            int textView2 = num1 + num2 ;

            t2.setText(String.valueOf(textView2));

       }
       });














    }
}