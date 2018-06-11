package com.cssoft.firstapp11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clearTest(View v) {
        EditText editText;
        editText = findViewById(R.id.editTextValue);

        TextView textView;
        textView = findViewById(R.id.textViewData);


        String value = editText.getText().toString();
        textView.setText(value);

        textView.setText(editText.getText().toString());


    }


}
