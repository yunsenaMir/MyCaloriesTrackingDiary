package com.caloriesdiary.MyCaloriesTrackingDiary.model;

import com.caloriesdiary.MyCaloriesTrackingDiary.model.enums.TrainingType;
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
    private LocalDate date;

    TrainingEntry(TrainingType trainingType, int trainingTimeAmount, LocalDate date) {
        this.trainingType = trainingType;
        this.trainingTimeAmount = trainingTimeAmount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrainingType: " + trainingType + ", trainingTimeAmount: " + trainingTimeAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingType, trainingTimeAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TrainingEntry))
            return false;
        return Objects.equals(this, o);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public int getTrainingTimeAmount() {
        return trainingTimeAmount;
    }

    public void setTrainingTimeAmount(int trainingTimeAmount) {
        this.trainingTimeAmount = trainingTimeAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
