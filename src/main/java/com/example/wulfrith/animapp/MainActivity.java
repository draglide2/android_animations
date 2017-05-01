package com.example.wulfrith.animapp;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivRect = null;
    ImageView ivAbstract = null;

    Animation move = null;
    Animation rotate = null;
    Animation fade_in = null;
    Animation fade_out = null;
    Animation magnify = null;
    Animation diminish = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivRect = (ImageView) findViewById(R.id.rectangle);
        ivAbstract = (ImageView) findViewById(R.id.animTarget);

        move = AnimationUtils.loadAnimation(this, R.anim.move);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        magnify = AnimationUtils.loadAnimation(this, R.anim.magnify);
        diminish = AnimationUtils.loadAnimation(this, R.anim.diminish);
    }

    public void moveAnim (View v) {
        ivRect.startAnimation(move);
    }

    public void rotateAnim (View v) {
        ivRect.startAnimation(rotate);
    }

    public void fadeInAnim (View v) {
        ivRect.startAnimation(fade_in);
    }

    public void fadeOutAnim (View v) {
        ivRect.startAnimation(fade_out);
    }

    public void magnifyAnim (View v) {
        ivRect.startAnimation(magnify);
    }

    public void diminishAnim (View v) {
        ivRect.startAnimation(diminish);
    }

    public void frameAnim (View v) {
        ((AnimationDrawable) ivAbstract.getBackground()).start();
    }
}
