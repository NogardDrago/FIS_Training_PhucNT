package fis.java.criminal.dao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {

        List<T> getAll();

        void save(T t);

        void update(T t);

        void delete(long id);
    }

