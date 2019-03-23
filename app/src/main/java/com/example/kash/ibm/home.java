package com.example.kash.ibm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    private static String TAG = "MAIN";
    private Button button2;
    private Button button3;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Log.d(TAG, "onCreate()");
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button5 = findViewById(R.id.button5);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInterviewPage();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPresentationPage();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistoryPage();
            }
        });



    }
    public void openInterviewPage()
    {
        Intent intent;
        intent = new Intent(this, InterviewPractice.class);
    }
    public void openPresentationPage()
    {

        Intent intent;
        intent = new Intent(this, PresentationPractice.class);

    }
    public void openHistoryPage()
    {
        Intent intent;
        intent = new Intent(this, HistoryPage.class);
    }


}
