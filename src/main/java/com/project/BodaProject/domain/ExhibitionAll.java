package com.project.BodaProject.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Data
@Builder
@Entity
@Table(name = "exhibition_all")
public class ExhibitionAll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "start_date", nullable = false)
    private String startDate;
    @Column(name = "end_date", nullable = false)
    private String endDate;
    @Column(name = "subject", nullable = false)
    private String subject;
    @Column(name = "place", nullable = false)
    private String place;
}