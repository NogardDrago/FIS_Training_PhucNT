package fis.java.criminal.dao;

import fis.java.criminal.model.CriminalCase;
import fis.java.criminal.model.Detective;

public interface IDetectiveDAO extends IDao<Detective>{
    //Create
    //Retrieve
    //Update
    //Delete
    Detective get(long id);
}
