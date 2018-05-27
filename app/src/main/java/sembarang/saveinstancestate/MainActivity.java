package sembarang.saveinstancestate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String savedString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate");

        // atau dari onRestoreInstanceState
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("savedString")) {
            savedString = savedInstanceState.getString("savedString");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState");
        // atau dari onCreate
        // if (savedInstanceState.containsKey("savedString")) {
        //     savedString = savedInstanceState.getString("savedString");
        // }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("savedString", savedString);
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void saveString(View view) {
        EditText editText = findViewById(R.id.editText);
        savedString = editText.getText().toString();
    }

    public void showString(View view) {
        Toast.makeText(this, savedString, Toast.LENGTH_LONG).show();
    }
}
