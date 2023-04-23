package com.caloriesdiary.MyCaloriesTrackingDiary.model;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.FoodType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;


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
    private int amount;
    private LocalDate date;

    FoodEntry(FoodType foodType, int amountInGrams, LocalDate date) {
        this.foodType = foodType;
        this.amount = amountInGrams;
        this.date = date;
    }

    @Override
    public String toString() {
        return "FoodType: " + foodType + ", amountInGrams: " + amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType, amount);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FoodEntry))
            return false;
        return Objects.equals(this, o);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
