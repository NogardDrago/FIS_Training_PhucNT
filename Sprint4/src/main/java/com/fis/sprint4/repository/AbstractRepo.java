package com.fis.sprint4.repository;

import com.fis.sprint4.model.AbstractEntity;
import com.fis.sprint4.model.Detective;

import java.util.Set;

public interface AbstractRepo<T extends AbstractEntity> {
        void save(T obj);

        Set<Detective> getALl();

        T findById(Long id);

        T update(T obj);

        void deleteById(Long id);
    }

