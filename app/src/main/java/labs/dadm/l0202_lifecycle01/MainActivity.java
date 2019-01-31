/*
 * Copyright (c) 2016. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l0202_lifecycle01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // It is a good practice to create constants for your tags
    private static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log information will be sent to output (check LogCat)
        Log.d(TAG, "Creating the activity");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "Restarting the activity");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "Starting the activity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "Resuming the activity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "Pausing the activity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "Stopping the activity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "Destroying the activity");
        super.onDestroy();
    }

}
