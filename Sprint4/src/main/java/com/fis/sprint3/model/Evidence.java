package com.fis.sprint3.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "evidences")
public class Evidence extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name="case_id", nullable = false)
    private CriminalCase criminalCase;
    @ManyToOne
    @JoinColumn(name = "storage_id", nullable = false)
    private Storage storage;
    @Column(name = "number", unique = true)
    private String number;
    @Column(name = "item")
    private String itemName;
    @Column(name = "notes")
    private String notes;
    @Column(name = "archived")
    private boolean archived;

    @Override
    public String toString() {
        return "Evidence{" +
                "criminalCase=" + criminalCase +
                ", storage=" + storage +
                ", number='" + number + '\'' +
                ", itemName='" + itemName + '\'' +
                ", notes='" + notes + '\'' +
                ", archived=" + archived +
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
        Evidence evidence = (Evidence) o;
        return archived == evidence.archived && criminalCase.equals(evidence.criminalCase) && storage.equals(evidence.storage) && number.equals(evidence.number) && itemName.equals(evidence.itemName) && notes.equals(evidence.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), criminalCase, storage, number, itemName, notes, archived);
    }

    public CriminalCase getCriminalCase() {
        return criminalCase;
    }

    public void setCriminalCase(CriminalCase criminalCase) {
        this.criminalCase = criminalCase;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
}
