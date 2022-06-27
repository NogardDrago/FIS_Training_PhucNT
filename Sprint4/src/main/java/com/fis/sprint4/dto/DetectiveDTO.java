package com.fis.sprint4.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class DetectiveDTO {
    private Long id;
    private String createdDate;
    private String modifiedDate;
    private Integer version;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDateTime hiringDate;
    private String password;
    private String badgeNumber;
    private Boolean armed;
    private String rank;
    private String employmentStatus;
    private Set<CriminalCaseDTO> criminalCaseSet;
    private Set<TrackEntryDTO> trackEntrySet;

    @Override
    public String toString() {
        return "DetectiveDTO{" +
                "id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", version=" + version +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hiringDate=" + hiringDate +
                ", password='" + password + '\'' +
                ", badgeNumber='" + badgeNumber + '\'' +
                ", armed=" + armed +
                ", rank='" + rank + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", criminalCaseSet=" + criminalCaseSet +
                ", trackEntrySet=" + trackEntrySet +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDateTime hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public Boolean getArmed() {
        return armed;
    }

    public void setArmed(Boolean armed) {
        this.armed = armed;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Set<CriminalCaseDTO> getCriminalCaseSet() {
        return criminalCaseSet;
    }

    public void setCriminalCaseSet(Set<CriminalCaseDTO> criminalCaseSet) {
        this.criminalCaseSet = criminalCaseSet;
    }

    public Set<TrackEntryDTO> getTrackEntrySet() {
        return trackEntrySet;
    }

    public void setTrackEntrySet(Set<TrackEntryDTO> trackEntrySet) {
        this.trackEntrySet = trackEntrySet;
    }

    public DetectiveDTO() {
    }

    public DetectiveDTO(Long id, String createdDate, String modifiedDate, Integer version, String userName, String firstName, String lastName, LocalDateTime hiringDate, String password, String badgeNumber, Boolean armed, String rank, String employmentStatus, Set<CriminalCaseDTO> criminalCaseSet, Set<TrackEntryDTO> trackEntrySet) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.version = version;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringDate = hiringDate;
        this.password = password;
        this.badgeNumber = badgeNumber;
        this.armed = armed;
        this.rank = rank;
        this.employmentStatus = employmentStatus;
        this.criminalCaseSet = criminalCaseSet;
        this.trackEntrySet = trackEntrySet;
    }
}
