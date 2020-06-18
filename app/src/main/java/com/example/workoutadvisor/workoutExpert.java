package com.example.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class workoutExpert {
        List<String> getWorkouts (String workouttypes){
            List<String> workout = new ArrayList<String>();
            if(workouttypes.equals("Chest")) {
                workout.add("Bench Press");
                workout.add("Cable flays");
            }
            else if(workouttypes.equals("Biceps")){
                workout.add("Biceps Curls");
            }
            else if(workouttypes.equals("Triceps")){
                workout.add("Triceps Ext");
                workout.add("Triceps PushDown");
            }
            else if (workouttypes.equals("Shoulder")){
                workout.add("Shoulder Press");
            }
            return workout;
        }

}
