package com.project.BodaProject.repository;

import com.project.BodaProject.domain.ExhibitionToday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionTodayRepository extends JpaRepository<ExhibitionToday, Long> {
    ExhibitionToday findByPlaceAndStartDateAndSubject(Object place, Object startDate, Object subject);
}