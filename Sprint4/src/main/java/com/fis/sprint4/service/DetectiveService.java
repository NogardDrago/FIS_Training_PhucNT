package com.fis.sprint4.service;

import com.fis.sprint4.model.Detective;

import java.util.Set;

public interface DetectiveService {
    void save(Detective detective);
    Set<Detective> getALl();
    Detective findById(Long id);
    Detective update(Detective detective);
    void deleteById(Long id);
}
