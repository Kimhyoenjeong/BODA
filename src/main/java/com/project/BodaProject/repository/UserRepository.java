package com.project.BodaProject.repository;


import com.project.BodaProject.domain.User.UserEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository
        extends JpaRepository<UserEntity, Long> {

    //findBy{colume_name}(column_type)
    Optional<UserEntity> findByName(String name);
    Optional<List<UserEntity>> findByName(String name, Sort sort);

    Optional<UserEntity> findByEmail(String email);
    UserEntity findTop1ByName(String name);
    UserEntity findTopByNameOrderByIdDesc(String name);

    List<UserEntity> findByEmailAndName(String email, String name);
    List<UserEntity> findByCreateT(LocalDateTime createT);
    List<UserEntity> findByCreateTAfter(LocalDateTime yesterday);

    List<UserEntity> findByNameLike(String name);

}
