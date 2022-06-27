package com.fis.sprint4.dto;

import java.util.Set;

public class StorageDTO {
    private Long id;
    private String createdDate;
    private String modifiedDate;
    private Integer version;
    private String storageName;
    private String location;
    private Set<EvidenceDTO> evidenceSet;

    @Override
    public String toString() {
        return "StorageDTO{" +
                "id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", version=" + version +
                ", storageName='" + storageName + '\'' +
                ", location='" + location + '\'' +
                ", evidenceSet=" + evidenceSet +
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

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<EvidenceDTO> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<EvidenceDTO> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }

    public StorageDTO() {
    }

    public StorageDTO(Long id, String createdDate, String modifiedDate, Integer version, String storageName, String location, Set<EvidenceDTO> evidenceSet) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.version = version;
        this.storageName = storageName;
        this.location = location;
        this.evidenceSet = evidenceSet;
    }
}
