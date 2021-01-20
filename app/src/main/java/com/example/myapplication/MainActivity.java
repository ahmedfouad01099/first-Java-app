package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passwdEditText = (EditText) findViewById(R.id.passwdEditText2);
        Log.i("key", "Button Clicked!!");
        Log.i("values", nameEditText.getText().toString());
        Log.i("values", passwdEditText.getText().toString());
        Toast.makeText(this, nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, passwdEditText.getText().toString(), Toast.LENGTH_SHORT).show();

    }


}
