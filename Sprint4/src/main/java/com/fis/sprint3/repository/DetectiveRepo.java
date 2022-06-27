package com.fis.sprint3.repository;

import com.fis.sprint3.model.Detective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectiveRepo extends JpaRepository<Detective, Long> {
}
