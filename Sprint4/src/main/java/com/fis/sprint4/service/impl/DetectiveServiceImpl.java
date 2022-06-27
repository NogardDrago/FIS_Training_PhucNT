package com.fis.sprint4.service.impl;

import com.fis.sprint4.model.Detective;
import com.fis.sprint4.repository.DetectiveRepo;
import com.fis.sprint4.service.DetectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DetectiveServiceImpl implements DetectiveService {
    @Autowired
    private DetectiveRepo detectiveRepo;

    @Override
    public void save(Detective detective) {
        detectiveRepo.save(detective);
    }

    @Override
    public Set<Detective> getALl() {
        return detectiveRepo.findAll();
    }

    @Override
    public Detective findById(Long id) {
        return detectiveRepo.findById(id);
    }

    @Override
    public Detective update(Detective detective) {
        return detectiveRepo.save(detective);
    }

    @Override
    public void deleteById(Long id) {
        detectiveRepo.deleteById(id);
    }
}
