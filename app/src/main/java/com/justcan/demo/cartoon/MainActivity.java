package com.justcan.demo.cartoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = findViewById(R.id.animationView);
        animationView.setImageAssetsFolder("demo/");
        animationView.setAnimation("justcan_demo.json");
        animationView.loop(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        animationView.playAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
        animationView.cancelAnimation();
    }

    public static int getFloatData(float value) {
        int temp = ((int) (value * 1000)) / 10;

        if (((int) (value * 1000)) % 10 > 0) {
            temp += 1;
        }
        return temp;
    }
}
