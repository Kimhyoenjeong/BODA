package com.project.BodaProject.repository;

import com.project.BodaProject.domain.ExhibitionAll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionAllRepository extends JpaRepository<ExhibitionAll, Long> {
    ExhibitionAll findByPlaceAndStartDateAndSubject(Object place, Object startDate, Object subject);
}