package com.jimes.ripple_animation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jimes.rippleAnimation.RippleAnimation;

public class MainActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.root);

    }

    public void onRed(View view) {
        RippleAnimation.create(view).setDuration(500).start();

        layout.setBackgroundColor(Color.RED);
    }

    public void onYellow(View view) {
        RippleAnimation.create(view).setDuration(500).start();

        layout.setBackgroundColor(Color.YELLOW);
    }

    public void onBlue(View view) {
        RippleAnimation.create(view).setDuration(500).start();

        layout.setBackgroundColor(Color.BLUE);
    }

    public void onGreen(View view) {
        RippleAnimation.create(view).setDuration(500).start();

        layout.setBackgroundColor(Color.GREEN);
    }

    public void onCyan(View view) {
        RippleAnimation.create(view).setDuration(500).start();

        layout.setBackgroundColor(Color.CYAN);
    }
}
