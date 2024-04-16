package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String msg="Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) { //The onCreate() method is one of many methods that are figured when an activity is loaded.
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); //Here, R.layout.activity_main refers to the activity_main.xml file located in the res/layout folder. An activity class loads all the UI component using the XML file available in res/layout folder of the project.
        Log.d(msg, "The onCreate() event");
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}