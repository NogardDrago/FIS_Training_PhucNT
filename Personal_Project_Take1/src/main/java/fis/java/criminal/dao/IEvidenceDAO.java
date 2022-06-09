package fis.java.criminal.dao;

import fis.java.criminal.model.Evidence;

public interface IEvidenceDAO {
    void addEvidence(Evidence evidence);
    void getEvidence(long id);
    void updateEvidence(long id);
    void updateEvidenceStatus(long id);
    void deleteEvidence(long id);

}
