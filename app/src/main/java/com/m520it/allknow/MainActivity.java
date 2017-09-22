package com.m520it.allknow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.m520it.allknow.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private ImageView splash;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAnim();
        initListenner();
    }

    private void initListenner() {
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ActivityUtils.startNewActivity(MainActivity.this,
                        HomeActivity.class, true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void initAnim() {
        animation = AnimationUtils.loadAnimation(this, R.anim.splash);
        splash.startAnimation(animation);
    }

    private void initView() {
        splash = (ImageView) findViewById(R.id.splash);
    }
}
