package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;
import fis.java.criminal.model.enums.CaseStatus;
import fis.java.criminal.model.enums.CaseType;

import java.util.Objects;
import java.util.Set;

public class CriminalCase extends AbstractEntity {
    String number;
    CaseType type;
    String shortDescription;
    String detailedDescription;
    CaseStatus status;
    String notes;
    Set<Evidence> evidenceSet;
    Detective leadInvestigator;
    Set<Detective> assigned;

    public CriminalCase() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CaseType getType() {
        return type;
    }

    public void setType(CaseType type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public CaseStatus getStatus() {
        return status;
    }

    public void setStatus(CaseStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Evidence> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<Evidence> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }

    public Detective getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(Detective leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<Detective> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<Detective> assigned) {
        this.assigned = assigned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalCase that = (CriminalCase) o;
        return number.equals(that.number) && type == that.type && shortDescription.equals(that.shortDescription) && detailedDescription.equals(that.detailedDescription) && status == that.status && notes.equals(that.notes) && evidenceSet.equals(that.evidenceSet) && leadInvestigator.equals(that.leadInvestigator) && assigned.equals(that.assigned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, shortDescription, detailedDescription, status, notes, evidenceSet, leadInvestigator, assigned);
    }

    public void replaceWith(CriminalCase criminalCase){
        this.notes = criminalCase.notes;

    }
}
