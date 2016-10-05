package com.test.tt100501;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Uri uri = Uri.parse("http://tw.yahoo.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        // it.setAction(Intent.ACTION_VIEW);
        // it.setAction("android.intent.action.VIEW");
        startActivity(it);
    }
    public void click2(View v)
    {
        Uri uri = Uri.parse("tel:123");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
    public void click3(View v)
    {
        Uri uri = Uri.parse("geo:0,0?q=巨匠電腦台大認證中心");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void click4(View v)
    {
        Intent sendTextIntent = new Intent();
        sendTextIntent.setAction(Intent.ACTION_SEND);
        sendTextIntent.putExtra(Intent.EXTRA_TEXT, "aa我要分享的文字bb");
        sendTextIntent.setType("text/plain");
        startActivity(sendTextIntent);

    }
}
