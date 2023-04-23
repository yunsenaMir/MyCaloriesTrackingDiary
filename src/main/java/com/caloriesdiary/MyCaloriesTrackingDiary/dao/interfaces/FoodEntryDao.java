package com.caloriesdiary.MyCaloriesTrackingDiary.dao.interfaces;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.FoodEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.FoodType;

import java.util.List;

public interface FoodEntryDao {
    int save(FoodEntry entry);

    int deleteById(Long id);

    FoodEntry getById(Long id);

    FoodEntry getByFoodType(FoodType type);

    List<FoodEntry> getAll();
}
