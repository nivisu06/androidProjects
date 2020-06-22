package com.example.myoverflowmenu;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout main_View = (ConstraintLayout) findViewById(R.id.main_view);
        switch(item.getItemId()){
            case R.id.menu_red:
                    if(item.isChecked()){
                        item.setChecked(false);
                    }else{
                        item.setChecked(true);
                        main_View.setBackgroundColor(Color.RED);
                        return true;
                    }

            case R.id.menu_blue:
                if(item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    main_View.setBackgroundColor(Color.BLUE);
                    return true;
                }
            case R.id.menu_green:
                if(item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    main_View.setBackgroundColor(Color.GREEN);
                    return true;
                }
            default : return super.onOptionsItemSelected(item);

        }
    }
}