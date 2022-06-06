package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;
import fis.java.criminal.model.CriminalCase;

import java.util.Set;

public class Evidence extends AbstractEntity {
    CriminalCase criminalCase;
    Storage storage;
    String number;
    String itemName;
    String notes;
    Boolean archived;
    Set<TrackEntry> trackEntries;
}
