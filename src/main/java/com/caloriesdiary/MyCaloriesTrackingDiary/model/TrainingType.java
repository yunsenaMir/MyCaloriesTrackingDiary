package com.caloriesdiary.MyCaloriesTrackingDiary.model;

public enum TrainingType {
    SLOW_RUNNING("Slow running", 300);

    private String name;
    private int burnedCaloriesPerHour;

    TrainingType(String name, int burnedCaloriesPerHour) {
        name = name;
        burnedCaloriesPerHour = burnedCaloriesPerHour;
    }

}
