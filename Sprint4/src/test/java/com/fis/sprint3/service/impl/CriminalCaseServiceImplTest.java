package com.fis.sprint3.service.impl;

import com.fis.sprint3.repository.EvidenceRepo;
import com.fis.sprint3.service.CriminalCaseService;
import com.fis.sprint3.service.DetectiveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CriminalCaseServiceImplTest {
    @Autowired
    private CriminalCaseService criminalCaseService;
    @Autowired
    private DetectiveService detectiveService;
    @Autowired
    private EvidenceRepo evidenceRepo;
    @Test
    void save() {
    }
}