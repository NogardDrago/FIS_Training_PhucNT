package com.fis.sprint4.service.impl;

import com.fis.sprint4.model.CriminalCase;
import com.fis.sprint4.repository.CriminalCaseRepo;
import com.fis.sprint4.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriminalCaseServiceImpl implements CriminalCaseService {
    @Autowired
    private CriminalCaseRepo criminalCaseRepo;
    @Override
    public void save(CriminalCase criminalCase) {
        criminalCaseRepo.save(criminalCase);
    }
    @Override
    public List<CriminalCase> getAll() {
        return criminalCaseRepo.findAll();
    }

    @Override
    public CriminalCase update(CriminalCase criminalCase) {
        return criminalCaseRepo.save(criminalCase);
    }

    @Override
    public void deleteById(Long id) {
        criminalCaseRepo.deleteById(id);
    }

    @Override
    public CriminalCase findById(Long id) {
        return criminalCaseRepo.findById(id).orElse(null);
    }
}
