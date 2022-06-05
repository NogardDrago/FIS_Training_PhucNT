package com.fis.criminalcase.dao;

import com.fis.criminalcase.dao.entity.AbstractEntity;
import com.fis.criminalcase.dao.entity.CriminalCase;
import com.fis.criminalcase.dao.entity.Person;
import com.fis.criminalcase.dao.entity.TrackEntry;

import java.util.Set;

public class Detective extends AbstractEntity {
    Person person;
    String badgeNumber;
    Rank rank;
    Boolean armed;
    EmploymentStatus status;
    Set<CriminalCase> criminalCases;
    Set<TrackEntry> trackEntries;
}
