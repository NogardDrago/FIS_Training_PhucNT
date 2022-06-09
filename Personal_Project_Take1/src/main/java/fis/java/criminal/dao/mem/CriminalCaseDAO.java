package fis.java.criminal.dao.mem;

import fis.java.criminal.dao.ICriminalCaseDAO;
import fis.java.criminal.model.CriminalCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CriminalCaseDAO implements ICriminalCaseDAO {
    @Override
    public Optional<CriminalCase> get(long id) {
        return MemDataStorage.criminalCaseMem.stream().filter(criminalCase -> criminalCase.getId()==id).findFirst();

    }

    @Override
    public List<CriminalCase> getAll() {
        return MemDataStorage.criminalCaseMem;
    }

    @Override
    public void save(CriminalCase criminalCase) {
        MemDataStorage.criminalCaseMem.add(criminalCase);
    }

    @Override
    public void update(CriminalCase newCriminalCase) {
        Optional<CriminalCase> criminalCase = get(newCriminalCase.getId());
        if (criminalCase.isPresent()){
            CriminalCase updateCriminalCase = criminalCase.get();
            criminalCase = newCriminalCase.replaceWith(newCriminalCase);
        }
    }

    @Override
    public void delete(CriminalCase criminalCase) {
        MemDataStorage.criminalCaseMem.remove(criminalCase);

    }
    @Override
    public void deleteCaseByID(long id) {
        for (CriminalCase criminalCase: MemDataStorage.criminalCaseMem){
            if(criminalCase.getId()==id){
                MemDataStorage.criminalCaseMem.remove(criminalCase);
                return;
            }
        }
    }
}
