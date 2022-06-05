package com.fis.criminalcase.dao;

import com.fis.criminalcase.dao.entity.AbstractEntity;
import com.fis.criminalcase.dao.entity.CriminalCase;
import com.fis.criminalcase.dao.entity.Storage;
import com.fis.criminalcase.dao.entity.TrackEntry;

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
