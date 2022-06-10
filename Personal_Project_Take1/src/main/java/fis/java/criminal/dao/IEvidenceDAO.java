package fis.java.criminal.dao;

import fis.java.criminal.model.Evidence;

public interface IEvidenceDAO extends IDao<Evidence>{
    Evidence get(long id);
}
