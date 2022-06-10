package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.IDetectiveDAO;
import fis.java.criminal.model.Detective;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DetectiveDAO implements IDetectiveDAO {

    @Override
    public Detective get(long id) {
        if (!MemDataStorage.detectiveMem.containsKey(id)) {
            System.err.printf("Khong co ID: %s", id);
        }
        return MemDataStorage.detectiveMem.entrySet().stream().filter(e -> e.getKey() == id).findFirst().map(Map.Entry::getValue).orElse(null);
    }

    @Override
    public List<Detective> getAll() {
        return new ArrayList<>(MemDataStorage.detectiveMem.values());
    }

    @Override
    public void save(Detective detective) {
        MemDataStorage.detectiveMem.put(detective.getId(),detective);
    }

    @Override
    public void update(Detective detective) {
        MemDataStorage.detectiveMem.put(detective.getId(), detective);
    }

    @Override
    public void delete(long id) {
        MemDataStorage.detectiveMem.remove(id);
    }
}
