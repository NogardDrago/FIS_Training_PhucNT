package com.fis.sprint3.repository;

import com.fis.sprint3.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriminalCaseRepo extends JpaRepository<CriminalCase, Long> {
}
