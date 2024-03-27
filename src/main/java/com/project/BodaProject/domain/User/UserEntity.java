package com.project.BodaProject.domain.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long No;

    @Column(name = "user_id", nullable = false)
    private String id;

    @Column(name = "pw", nullable = false)
    private String password;

    @Column(name = "user_name")
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDateTime createT;


}
