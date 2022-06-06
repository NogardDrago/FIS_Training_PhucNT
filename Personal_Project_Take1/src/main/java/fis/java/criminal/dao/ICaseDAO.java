package fis.java.criminal.dao;

import fis.java.criminal.model.CriminalCase;

public interface ICaseDAO {
    void createCase(CriminalCase criminalCase);
    void getCase (long id);
    void updateCase (long id);
    void updateCaseDetective (long id);
    void deleteCase (long id);
}
