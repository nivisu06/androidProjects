package com.example.workoutadvisor;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private workoutExpert expert = new  workoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view){
        TextView workouts = (TextView) findViewById(R.id.workouts);
        Spinner workouttype = (Spinner)findViewById(R.id.workouttype);
        String workout = String.valueOf(workouttype.getSelectedItem());
        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutFormatted  = new StringBuilder();
        for(String work : workoutList){
            workoutFormatted.append(work).append("\n");
        }
        workouts.setText(workoutFormatted);
    }
}