package fis.java.criminal.dao;

import fis.java.criminal.model.Detective;

public interface IDetectiveDAO {
    //Create
    //Retrieve
    //Update
    //Delete
    void addDetective(Detective detective);
    void getDetectiveByID(long id);
    void getDetectiveByName(String username);
    void updateDetective(long id);
    void updateDetectiveStatus(long id);
    void deleteDetective(long id);
}
