package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle","OnCreate() invoked");

        TextView txtMsg2 = findViewById(R.id.tvMsg2);
        txtMsg2.setText(R.string.Msg2);

    }

    public void onStart() {

        super.onStart();
        Log.i("Lifecycle","OnStart() invoked");
    }

    public void onRestart() {

        super.onRestart();
        Log.i("Lifecycle","OnRestart() invoked");

    }

    public void onResume() {

        super.onResume();
        Log.i("Lifecycle","OnResume() invoked");
    }

    public void onPause() {

        super.onPause();
        Log.i("Lifecycle","OnPause() invoked");
    }

    public void onStop() {

        super.onStop();
        Log.i("Lifecycle","OnStop() invoked");
    }

    public void onDestroy() {

        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoked");
    }
}