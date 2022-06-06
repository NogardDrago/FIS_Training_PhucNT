package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;
import fis.java.criminal.model.CriminalCase;
import fis.java.criminal.model.enums.EmploymentStatus;
import fis.java.criminal.model.enums.Rank;

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
