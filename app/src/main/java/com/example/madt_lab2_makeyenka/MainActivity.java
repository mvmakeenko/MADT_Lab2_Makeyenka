package com.example.madt_lab2_makeyenka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String text;
    static TextView result;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        spinner = (Spinner) findViewById(R.id.choose_count);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.choose_count, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void buttonPressed (View view) {
        text = ((EditText) findViewById(R.id.text)).getText().toString();
        if (text.length() == 0) {
            CharSequence warn_text = "Please enter the text first";
            Toast warning = Toast.makeText(getApplicationContext(), warn_text, Toast.LENGTH_LONG);
            warning.setMargin(50, 50);
            warning.show();
        }
        String choice = spinner.getSelectedItem().toString();
        Counter.count(text, choice.equals("Chars"));
    }
}