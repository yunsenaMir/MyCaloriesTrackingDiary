package com.caloriesdiary.MyCaloriesTrackingDiary.dao;


import com.caloriesdiary.MyCaloriesTrackingDiary.model.TrainingEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.TrainingType;
import com.caloriesdiary.MyCaloriesTrackingDiary.dao.interfaces.TrainingEntryDao;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.mappers.FoodEntryMapper;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.mappers.TrainingEntryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class TrainingEntryDaoImpl implements TrainingEntryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int save(TrainingEntry entry) {
        return jdbcTemplate.update("insert into trainingEntry (trainingType, trainingTimeAmount) values (?, ?) ",
                entry.getTrainingType(), entry.getTrainingTimeAmount());
    }


    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete trainingEntry where id = ? ",
                id);
    }

    @Override
    public TrainingEntry getById(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from trainingEntry where id = ?", new TrainingEntryMapper(), id);
    }

    @Override
    public TrainingEntry getByTrainingType(TrainingType type) {
        return jdbcTemplate.queryForObject(
                "select * from trainingEntry where foodType = ?", new TrainingEntryMapper(), type);
    }

    @Override
    public List<TrainingEntry> getAll() {
        return jdbcTemplate.query(
                "select * from trainingEntry", new TrainingEntryMapper());
    }
}
