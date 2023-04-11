package com.example.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExampleReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())){
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
        }
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())){
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
        }
    }
}
