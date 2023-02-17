package com.example.gpavilchezr1calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText box1,
            box2,
            box3,
            box4,
            box5;
    TextView results;
    int count=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.b);
        box1=(EditText)findViewById(R.id.box1);
        box2=(EditText)findViewById(R.id.box2);
        box3=(EditText)findViewById(R.id.box3);
        box4=(EditText)findViewById(R.id.box4);
        box5=(EditText)findViewById(R.id.box5);
        results=(TextView)findViewById(R.id.results);
        results.setBackgroundColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float g1, g2, g3, g4, g5;
                if (count % 2 == 0) {
                    if (box1.getText().toString().equals("") || box2.getText().toString().equals("") || box3.getText().toString().equals("") || box4.getText().toString().equals("") || box5.getText().toString().equals("")) {
                        results.setText("Please enter your grades in the boxes!!!");
                    }
                    else {
                        g1 = Float.parseFloat(box1.getText().toString());
                        g2 = Float.parseFloat(box2.getText().toString());
                        g3 = Float.parseFloat(box3.getText().toString());
                        g4 = Float.parseFloat(box4.getText().toString());
                        g5 = Float.parseFloat(box5.getText().toString());
                        float avg = g1 + g2 + g3 + g4 + g5;
                        avg = avg / 5;
                        if (avg < 60) {
                            results.setText(Float.toString(avg));

                            results.setBackgroundColor(Color.RED);

                        } else if (avg > 60 && avg < 80) {
                            results.setText(Float.toString(avg));

                            results.setBackgroundColor(Color.YELLOW);

                        } else if (avg >= 80 && avg <= 100) {
                            results.setText(Float.toString(avg));

                            results.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        b.setText("Clear");
                    }

                }
                else
                {
                    box1.setText("");

                    box2.setText("");

                    box3.setText("");

                    box4.setText("");

                    box5.setText("");

                    results.setText("");

                    b.setText("Generate the GPA Score of the courses");

                    results.setBackgroundColor(Color.BLACK);

                    count++;
                }
            }
        });
    }
}