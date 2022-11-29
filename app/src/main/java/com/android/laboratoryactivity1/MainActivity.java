package com.android.laboratoryactivity1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText TextName;
    Button butangSubmit;
    TextView displayText;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextName = (EditText) findViewById(R.id.edit_textname);
        butangSubmit = (Button) findViewById(R.id.button_submit);
        displayText = (TextView) findViewById(R.id.text_callingname);
        butangSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = TextName.getText().toString();
                displayText.setText(nama);
            }
        });
    }
    }
