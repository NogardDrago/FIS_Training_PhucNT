package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.IEvidenceDAO;
import fis.java.criminal.model.Detective;
import fis.java.criminal.model.Evidence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EvidenceDAO implements IEvidenceDAO {
    @Override
    public Evidence get(long id) {
        if (!MemDataStorage.evidenceMem.containsKey(id)) {
            System.err.printf("Khong co ID: %s", id);
        }
        return MemDataStorage.evidenceMem.entrySet().stream().filter(e -> e.getKey() == id).findFirst().map(Map.Entry::getValue).orElse(null);
    }

    @Override
    public List<Evidence> getAll() {
        return new ArrayList<>(MemDataStorage.evidenceMem.values());
    }

    @Override
    public void save(Evidence evidence) {
        MemDataStorage.evidenceMem.put(evidence.getId(),evidence);
    }

    @Override
    public void update(Evidence evidence) {
        MemDataStorage.evidenceMem.put(evidence.getId(), evidence);
    }

    @Override
    public void delete(long id) {
        MemDataStorage.evidenceMem.remove(id);
    }
}
