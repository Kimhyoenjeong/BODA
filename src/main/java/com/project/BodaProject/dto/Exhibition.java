package com.project.BodaProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Exhibition {
    private Long id;
    private String start_date;
    private String end_date;
    private String place;
    private String subject;
}