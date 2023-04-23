package com.caloriesdiary.MyCaloriesTrackingDiary.model.mappers;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.TrainingEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.TrainingType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainingEntryMapper implements RowMapper<TrainingEntry> {

    @Override
    public TrainingEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
        TrainingEntry trainingEntry = new TrainingEntry(rs.getLong("id"), (TrainingType) rs.getObject("trainingType"), rs.getInt("trainingTimeAmount"), rs.getDate("date").toLocalDate());
        return trainingEntry;
    }
}
