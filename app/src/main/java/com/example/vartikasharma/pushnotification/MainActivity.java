package com.example.vartikasharma.pushnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if(resultCode != ConnectionResult.SUCCESS) {
            if(GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                //Play Services is not installed/enabled
                GooglePlayServicesUtil.showErrorNotification(resultCode, this);
            } else {
                //This device does not support Play Services
                Toast.makeText(this, "Device does not support Play Services", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }
}
