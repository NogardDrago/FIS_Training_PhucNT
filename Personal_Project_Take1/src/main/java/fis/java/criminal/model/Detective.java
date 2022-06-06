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

    public Detective() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Boolean getArmed() {
        return armed;
    }

    public void setArmed(Boolean armed) {
        this.armed = armed;
    }

    public EmploymentStatus getStatus() {
        return status;
    }

    public void setStatus(EmploymentStatus status) {
        this.status = status;
    }

    public Set<CriminalCase> getCriminalCases() {
        return criminalCases;
    }

    public void setCriminalCases(Set<CriminalCase> criminalCases) {
        this.criminalCases = criminalCases;
    }

    public Set<TrackEntry> getTrackEntries() {
        return trackEntries;
    }

    public void setTrackEntries(Set<TrackEntry> trackEntries) {
        this.trackEntries = trackEntries;
    }
}
