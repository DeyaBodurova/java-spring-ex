package com.example.testspringjava.repositories;

import com.example.testspringjava.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from `test-spring`.users order by RAND () LIMIT 1",
            nativeQuery = true)
    Optional<User> getRandomEntity();


}