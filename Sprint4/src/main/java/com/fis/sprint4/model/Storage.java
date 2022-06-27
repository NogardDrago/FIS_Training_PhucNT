package com.fis.sprint4.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "storages")
public class Storage extends AbstractEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @OneToMany(mappedBy = "storage")
    private Set<Evidence> evidenceSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Storage storage = (Storage) o;
        return name.equals(storage.name) && location.equals(storage.location) && evidenceSet.equals(storage.evidenceSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, location, evidenceSet);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", evidenceSet=" + evidenceSet +
                ", id=" + id +
                ", version=" + version +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Evidence> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<Evidence> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }
}
