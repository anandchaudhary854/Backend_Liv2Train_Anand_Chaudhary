package com.exampleSenpiper.senPiper.repository;

import com.exampleSenpiper.senPiper.model.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<Center, Long> {
}
