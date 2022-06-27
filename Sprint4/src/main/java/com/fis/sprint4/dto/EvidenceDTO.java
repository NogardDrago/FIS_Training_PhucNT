package com.fis.sprint4.dto;

import java.util.Set;

public class EvidenceDTO {
    private Long id;
    private String createdDate;
    private String modifiedDate;
    private Long caseId;
    private Long storageId;
    private Integer version;
    private String number;
    private String itemName;
    private String notes;
    private Boolean archived;
    private Set<TrackEntryDTO> trackEntrySet;

    @Override
    public String toString() {
        return "EvidenceDTO{" +
                "id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", caseId=" + caseId +
                ", storageId=" + storageId +
                ", version=" + version +
                ", number='" + number + '\'' +
                ", itemName='" + itemName + '\'' +
                ", notes='" + notes + '\'' +
                ", archived=" + archived +
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

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getStorageId() {
        return storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Set<TrackEntryDTO> getTrackEntrySet() {
        return trackEntrySet;
    }

    public void setTrackEntrySet(Set<TrackEntryDTO> trackEntrySet) {
        this.trackEntrySet = trackEntrySet;
    }

    public EvidenceDTO() {
    }

    public EvidenceDTO(Long id, String createdDate, String modifiedDate, Long caseId, Long storageId, Integer version, String number, String itemName, String notes, Boolean archived, Set<TrackEntryDTO> trackEntrySet) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.caseId = caseId;
        this.storageId = storageId;
        this.version = version;
        this.number = number;
        this.itemName = itemName;
        this.notes = notes;
        this.archived = archived;
        this.trackEntrySet = trackEntrySet;
    }
}
