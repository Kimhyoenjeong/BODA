package com.project.BodaProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

    private Long no;
    private String id;
    private String password;
    private String name;
    private String email;
    private LocalDateTime CreateT;

}
