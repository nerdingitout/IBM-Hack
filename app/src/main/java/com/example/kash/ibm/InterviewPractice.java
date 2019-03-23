package com.example.kash.ibm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class InterviewPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_practice);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.homeItem:

                Intent intent;
                intent = new Intent(this, home.class);

                return true;

            case R.id.settingsItem:

                Intent intent2;
                intent2 = new Intent(this, home.class);

                return true;

            default:

                return super.onOptionsItemSelected(item);

        }


    }
}
