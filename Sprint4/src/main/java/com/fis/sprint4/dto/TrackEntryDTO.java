package com.fis.sprint4.dto;

import com.fis.sprint4.model.Detective;
import com.fis.sprint4.model.Evidence;
import com.fis.sprint4.model.enums.TrackAction;

import java.time.LocalDateTime;

public class TrackEntryDTO {
    private Long id;
    private String createdDate;
    private String modifiedDate;
    private Integer version;
    private LocalDateTime date;
    private Evidence evidence;
    private Detective detective;
    private TrackAction trackAction;
    private String reason;

    public TrackEntryDTO() {
    }

    @Override
    public String toString() {
        return "TrackEntryDTO{" +
                "id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", version=" + version +
                ", date=" + date +
                ", evidence=" + evidence +
                ", detective=" + detective +
                ", trackAction=" + trackAction +
                ", reason='" + reason + '\'' +
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Evidence getEvidence() {
        return evidence;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    public Detective getDetective() {
        return detective;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public TrackAction getTrackAction() {
        return trackAction;
    }

    public void setTrackAction(TrackAction trackAction) {
        this.trackAction = trackAction;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public TrackEntryDTO(Long id, String createdDate, String modifiedDate, Integer version, LocalDateTime date, Evidence evidence, Detective detective, TrackAction trackAction, String reason) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.version = version;
        this.date = date;
        this.evidence = evidence;
        this.detective = detective;
        this.trackAction = trackAction;
        this.reason = reason;
    }
}
