package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.IDetectiveDAO;
import fis.java.criminal.model.Detective;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DetectiveDAO implements IDetectiveDAO {

    @Override
    public Optional<Detective> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Detective> getAll() {
        return null;
    }

    @Override
    public void save(Detective detective) {

    }

    @Override
    public void update(Detective detective) {

    }

    @Override
    public void delete(Detective detective) {

    }
}
