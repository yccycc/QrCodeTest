package com.yctech.qrcodetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.xys.libzxing.zxing.activity.CaptureActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivityForResult(new Intent(MainActivity.this, CaptureActivity.class), 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        List list = new ArrayList(data.getExtras().keySet());
        Log.i("bitch--", data.getExtras().get(list.get(0).toString()).toString());//get("result")
        Log.i("bitch--", data.getExtras().get(list.get(1).toString()).toString());
        Log.i("bitch--", data.getExtras().get(list.get(2).toString()).toString());
        Log.i("bitch--", data.getExtras().get(list.get(3).toString()).toString());
        Log.i("bitch--", list.toString());
    }
}
