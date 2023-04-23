package com.caloriesdiary.MyCaloriesTrackingDiary.model.enums;

public enum TrainingType {
    SLOW_RUNNING("Slow running", 472,745),
    FAST_RUNNING("Fast running", 738,1163),
    AEROBICS_LOW_IMPACT("Aerobics, low impact", 295, 465),
    AEROBICS_HIGH_IMPACT("Aerobics, high impact", 413, 651),
    ROPE_SLOW_JUMPING("Jumping rope, slow", 472, 745),
    ROPE_FAST_JUMPING("Jumping rope, fast", 500, 600);

    private final String name;
    private final int burnedCaloriesPerHourLess180lbs;
    private final int burnedCaloriesPerHourMore180lbs;

    TrainingType(String name, int burnedCaloriesPerHourLess180lbs, int burnedCaloriesPerHourMore180lbs) {
        this.name = name;
        this.burnedCaloriesPerHourLess180lbs = burnedCaloriesPerHourLess180lbs;
        this.burnedCaloriesPerHourMore180lbs = burnedCaloriesPerHourMore180lbs;
    }

}
