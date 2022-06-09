package fis.java.criminal.dao;

import fis.java.criminal.model.CriminalCase;

public interface ICriminalCaseDAO extends IDao<CriminalCase>{
    void deleteCaseByID (long id);
}
