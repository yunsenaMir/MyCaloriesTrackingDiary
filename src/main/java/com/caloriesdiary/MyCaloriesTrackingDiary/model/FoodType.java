package com.caloriesdiary.MyCaloriesTrackingDiary.model;

public enum FoodType {
    MEAL("Meal", 300),
    SPAGETTI("Spagetti", 400);

    private String name;
    private int caloriesAmountIn100grammes;


    FoodType(String name, int caloriesAmountIn100grammes) {
        this.name = name;
        this.caloriesAmountIn100grammes = caloriesAmountIn100grammes;
    }

    private int getCaloriesAmountIn100grammes() {
        return caloriesAmountIn100grammes;
    }

}
