package com.caloriesdiary.MyCaloriesTrackingDiary.model.enums;

public enum FoodCategory {
    COMMON_MEALS("Common meals"),
    PROTEINS("Proteins"),
    VEGETABLES("Vegetables"),
    FRUIT("Fruit"),
    BEVERAGES("Beverages");

    private String description;

    FoodCategory(String description) {
        this.description = description;
    }

}
