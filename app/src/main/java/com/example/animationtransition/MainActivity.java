package com.example.animationtransition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         myLayout = (RelativeLayout) findViewById(R.id.myLayout);
        myLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent event) { moveButton();
                        return true;
                    }
                }
        );
    }

    private void moveButton() {
        TransitionManager.beginDelayedTransition(myLayout);
        Button myButton = (Button) findViewById(R.id.myButton);
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        myButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = myButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        myButton.setLayoutParams(sizeRules);
    }
}
