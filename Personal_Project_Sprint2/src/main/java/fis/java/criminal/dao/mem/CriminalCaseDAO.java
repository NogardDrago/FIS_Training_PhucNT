package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.ICriminalCaseDAO;
import fis.java.criminal.model.CriminalCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CriminalCaseDAO implements ICriminalCaseDAO {
    @Override
    public CriminalCase get(long id) {
        if (!MemDataStorage.criminalCaseMem.containsKey(id)) {
            System.err.printf("Khong co ID: %s", id);
        }
        return MemDataStorage.criminalCaseMem.entrySet().stream().filter(e -> e.getKey() == id).findFirst().map(Map.Entry::getValue).orElse(null);
    }

    @Override
    public List<CriminalCase> getAll() {
        return new ArrayList<>(MemDataStorage.criminalCaseMem.values());
    }

    @Override
    public void save(CriminalCase criminalCase) {
        MemDataStorage.criminalCaseMem.put(criminalCase.getId(),criminalCase);
    }

    @Override
    public void update(CriminalCase criminalCase) {
        MemDataStorage.criminalCaseMem.put(criminalCase.getId(), criminalCase);
    }

    @Override
    public void delete(long id) {
        MemDataStorage.criminalCaseMem.remove(id);
    }
}
