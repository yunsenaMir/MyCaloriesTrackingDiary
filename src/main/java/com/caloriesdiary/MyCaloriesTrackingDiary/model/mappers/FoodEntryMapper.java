package com.caloriesdiary.MyCaloriesTrackingDiary.model.mappers;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.FoodEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.FoodType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FoodEntryMapper implements RowMapper<FoodEntry> {
    @Override
    public FoodEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
        FoodEntry foodEntry = new FoodEntry(rs.getLong("id"), (FoodType) rs.getObject("foodType"), rs.getInt("amountInGrams"));
        return foodEntry;
    }
}
