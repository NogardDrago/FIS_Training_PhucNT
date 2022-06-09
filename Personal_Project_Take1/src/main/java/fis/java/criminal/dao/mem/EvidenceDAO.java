package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.IEvidenceDAO;
import fis.java.criminal.model.Evidence;

import java.util.List;
import java.util.Optional;

public class EvidenceDAO implements IEvidenceDAO {

    @Override
    public Optional<Evidence> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Evidence> getAll() {
        return null;
    }

    @Override
    public void save(Evidence evidence) {

    }

    @Override
    public void update(Evidence evidence) {

    }

    @Override
    public void delete(Evidence evidence) {

    }
}
