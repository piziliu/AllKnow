package com.m520it.allknow.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by liulei on 2017/9/22.
 */

public class ActivityUtils {

    public static void startNewActivity(Context context, Class<? extends AppCompatActivity> clazz, boolean aBoolean) {
        Intent intent = new Intent(context, clazz);
        ((Activity) context).startActivity(intent);
        if (aBoolean == true) {
            ((Activity) context).finish();
        }
    }
}
