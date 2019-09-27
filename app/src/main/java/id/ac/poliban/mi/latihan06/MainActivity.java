package id.ac.poliban.mi.latihan06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Android Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null) getSupportActionBar().setTitle("Android Life Cycle");

        Log.i(TAG, "OnCreate() executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart() executed" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause() executed" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume() executed" );
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop() executed" );
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart() executed" );
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy() executed" );

    }

}
