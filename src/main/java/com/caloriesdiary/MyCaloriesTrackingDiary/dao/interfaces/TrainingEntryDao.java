package com.caloriesdiary.MyCaloriesTrackingDiary.dao.interfaces;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.TrainingEntry;
import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.TrainingType;

import java.util.List;

public interface TrainingEntryDao {
    int save(TrainingEntry entry);

    int deleteById(Long id);

    TrainingEntry getById(Long id);

    TrainingEntry getByTrainingType(TrainingType type);

    List<TrainingEntry> getAll();
}
