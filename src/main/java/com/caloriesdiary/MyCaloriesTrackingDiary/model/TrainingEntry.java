package com.caloriesdiary.MyCaloriesTrackingDiary.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TrainingEntry")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private TrainingType trainingType;
    private int trainingTimeAmount;

    TrainingEntry(TrainingType trainingType, int trainingTimeAmount) {
        this.trainingType = trainingType;
        this.trainingTimeAmount = trainingTimeAmount;
    }
}
