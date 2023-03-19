package com.caloriesdiary.MyCaloriesTrackingDiary.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "FoodEntry")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FoodEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private FoodType foodType;
    private int amountInGrams;

    FoodEntry(FoodType foodType, int amountInGrams) {
        this.foodType = foodType;
        this.amountInGrams = amountInGrams;
    }
}
