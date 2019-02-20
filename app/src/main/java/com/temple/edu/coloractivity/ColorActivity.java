package com.temple.edu.coloractivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;


public class ColorActivity extends AppCompatActivity {
    private boolean initial = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> colors = new ArrayList<>();
        colors.add("cyan");
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Magenta");
        colors.add("Purple");
        colors.add("gray");
        colors.add("transparent");
        colors.add("red");
        colors.add("yellow");

        final View layout = findViewById(R.id.activity_palette);
        Spinner spin = (Spinner) findViewById(R.id.color_spinner);
        ColorAdapter co = new ColorAdapter( this, colors );
        spin.setAdapter( co );

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(initial ) {
                    initial = false;
                    return;
                }

                try {
                    layout.setBackgroundColor(Color.parseColor(colors.get(position)));
                    // Set app bakground as chosen color
                    Toast.makeText(ColorActivity.this, "Color selected success!", Toast.LENGTH_LONG).show();
                    // toast message
                } catch (Exception e ){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                layout.setBackgroundColor(Color.WHITE);
            }
        });

    }


}




