
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // for number activity clickListener
        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "list is opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, word_list.class);
                startActivity(intent);
            }
        });

        // for color activity clickListener
        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "color is opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(intent);
            }
        });

        // for phrase activity clickListener
        TextView phrase = (TextView) findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "phrase is opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(intent);
            }
        });

        // for family activity clickListener
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "family is opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

    }
}
