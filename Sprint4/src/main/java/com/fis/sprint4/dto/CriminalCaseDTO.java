package com.fis.sprint4.dto;

public class CriminalCaseDTO {
    private Long id;
    private String createdDate;
    private String modifiedDate;
    private Integer version;
    private String caseNumber;
    private String caseType;
    private String caseStatus;
    private String notes;
    private String shortDescription;
    private String detailDescription;
    private Set<EvidenceDTO> evidenceSet;
    private DetectiveDTO leadInvestigator;
    private Set<DetectiveDTO> detectiveSet;

    public CriminalCaseDTO() {
    }

    @Override
    public String toString() {
        return "CriminalCaseDTO{" +
                "id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", version=" + version +
                ", caseNumber='" + caseNumber + '\'' +
                ", caseType='" + caseType + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                ", notes='" + notes + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", detailDescription='" + detailDescription + '\'' +
                ", evidenceSet=" + evidenceSet +
                ", leadInvestigator=" + leadInvestigator +
                ", detectiveSet=" + detectiveSet +
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

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public Set<EvidenceDTO> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<EvidenceDTO> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }

    public DetectiveDTO getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(DetectiveDTO leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<DetectiveDTO> getDetectiveSet() {
        return detectiveSet;
    }

    public void setDetectiveSet(Set<DetectiveDTO> detectiveSet) {
        this.detectiveSet = detectiveSet;
    }

    public CriminalCaseDTO(Long id, String createdDate, String modifiedDate, Integer version, String caseNumber, String caseType, String caseStatus, String notes, String shortDescription, String detailDescription, Set<EvidenceDTO> evidenceSet, DetectiveDTO leadInvestigator, Set<DetectiveDTO> detectiveSet) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.version = version;
        this.caseNumber = caseNumber;
        this.caseType = caseType;
        this.caseStatus = caseStatus;
        this.notes = notes;
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
        this.evidenceSet = evidenceSet;
        this.leadInvestigator = leadInvestigator;
        this.detectiveSet = detectiveSet;
    }
}
