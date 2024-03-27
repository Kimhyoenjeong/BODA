package com.project.BodaProject.service;

import com.project.BodaProject.domain.User.UserEntity;
import com.project.BodaProject.dto.UserDto;
import com.project.BodaProject.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private EntityManager entityManager;

    public UserDto register(UserDto userDto) {
        return entityToDto(userRepository.save(dtoToEntity(userDto)));
    }

    public UserEntity dtoToEntity(UserDto userDto) {
        var entity = UserEntity.builder()
                .No(userDto.getNo())
                .id(userDto.getId())
                .email(userDto.getEmail())
                .name(userDto.getName())
                .password(userDto.getPassword())
                .build();
        return entity;
    }

    public UserDto entityToDto(UserEntity userEntity) {
        var dto = UserDto.builder()
                .no(userEntity.getNo())
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .name(userEntity.getName())
                .password(userEntity.getPassword())
                .build();
        return dto;
    }
}
