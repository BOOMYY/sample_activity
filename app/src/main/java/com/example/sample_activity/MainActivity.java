package com.example.sample_activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "ActivityLifecycle";

    EditText count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.count);

        if (savedInstanceState != null) {
            String username = savedInstanceState.getString("username");
            count.setText(username);

            Log.d(TAG, "Restored username: " + username);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String username = count.getText().toString();

        outState.putString("username", username);

        Log.d(TAG, "Saved username: " + username);
    }

//        int num1 = 10;
//        int num2 = 5;
//
//// Bug: wrong operator
//        int result = num1 - num2;
//
//// Fix:
//        int correctResult = num1 + num2;
//        Log.d("CALCULATOR", "Result: " + correctResult);


//        Log.d(TAG, "onCreate: Activity Created");

//        Log.d("MY_APP", "Button clicked!");
//        Log.i("MY_APP", "Application started");
//        Log.w("MY_APP", "Check this condition");
//        Log.e("MY_APP", "Something went wrong");
}

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "onStart: Activity Started");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(TAG, "onResume: Activity Resumed");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause: Activity Paused");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG, "onStop: Activity Stopped");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(TAG, "onRestart: Activity Restarting");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy: Activity Destroyed");
//    }
//}