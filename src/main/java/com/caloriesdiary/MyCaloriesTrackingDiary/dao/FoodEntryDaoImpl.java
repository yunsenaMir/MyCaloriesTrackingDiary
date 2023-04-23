package com.caloriesdiary.MyCaloriesTrackingDiary.dao;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.FoodEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.FoodType;
import com.caloriesdiary.MyCaloriesTrackingDiary.dao.interfaces.FoodEntryDao;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.mappers.FoodEntryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FoodEntryDaoImpl implements FoodEntryDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(FoodEntry entry) {
        return jdbcTemplate.update("insert into foodEntry (foodType, amountInGrams) values (?, ?) ",
                entry.getFoodType(), entry.getAmount());
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete foodEntry where id = ? ",
                id);
    }

    @Override
    public FoodEntry getById(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from foodEntry where id = ?", new FoodEntryMapper(), id);
    }

    @Override
    public FoodEntry getByFoodType(FoodType type) {
        return jdbcTemplate.queryForObject(
                "select * from foodEntry where foodType = ?", new FoodEntryMapper(), type);
    }

    @Override
    public List<FoodEntry> getAll() {
        return jdbcTemplate.query(
                "select * from foodEntry", new FoodEntryMapper());
    }

}
