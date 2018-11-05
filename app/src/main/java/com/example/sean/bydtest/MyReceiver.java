package com.example.sean.bydtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
        String name = intent.getStringExtra("appName");
        Log.d("接收到广播的全称：", intent.getAction());
        PackageManager packageManager = context.getPackageManager();
        Intent startIntent = new Intent();
        startIntent = packageManager.getLaunchIntentForPackage("com.example.sean.bydtest");
        context.startActivity(startIntent);

    }
}
