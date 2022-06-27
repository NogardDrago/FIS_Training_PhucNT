package com.fis.sprint4.service;

import com.fis.sprint4.model.CriminalCase;

import java.util.List;

public interface CriminalCaseService {
    void save(CriminalCase criminalCase);
    List<CriminalCase> getAll();
    CriminalCase update(CriminalCase criminalCase);
    void deleteById(Long id);
    CriminalCase findById(Long id);
}
