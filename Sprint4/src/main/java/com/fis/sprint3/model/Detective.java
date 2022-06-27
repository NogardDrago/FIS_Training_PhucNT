package com.fis.sprint3.model;

import com.fis.sprint3.model.enums.EmploymentStatus;
import com.fis.sprint3.model.enums.Rank;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "detectives")
public class Detective extends AbstractEntity{
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @Column(name = "badge_number", unique = true)
    private String badgeNumber;
    @Column(name = "`rank`")
    @Enumerated(EnumType.STRING)
    private Rank rank;
    @Column(name = "armed")
    private boolean armed;
    @Enumerated(EnumType.STRING)
    private EmploymentStatus employmentStatus;
    @ManyToMany(mappedBy = "assigned")
    @Transient
    private Set<CriminalCase> criminalCaseSet;

    @Override
    public String toString() {
        return "Detective{" +
                "person=" + person +
                ", badgeNumber='" + badgeNumber + '\'' +
                ", rank=" + rank +
                ", armed=" + armed +
                ", employmentStatus=" + employmentStatus +
                ", criminalCaseSet=" + criminalCaseSet +
                ", id=" + id +
                ", version=" + version +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Detective detective = (Detective) o;
        return armed == detective.armed && person.equals(detective.person) && badgeNumber.equals(detective.badgeNumber) && rank == detective.rank && employmentStatus == detective.employmentStatus && criminalCaseSet.equals(detective.criminalCaseSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), person, badgeNumber, rank, armed, employmentStatus, criminalCaseSet);
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

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Set<CriminalCase> getCriminalCaseSet() {
        return criminalCaseSet;
    }

    public void setCriminalCaseSet(Set<CriminalCase> criminalCaseSet) {
        this.criminalCaseSet = criminalCaseSet;
    }
}
