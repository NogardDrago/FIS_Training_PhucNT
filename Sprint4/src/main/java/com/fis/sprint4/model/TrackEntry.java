package com.fis.sprint4.model;

import com.fis.sprint4.model.enums.TrackAction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "track_entries")
public class TrackEntry extends AbstractEntity{
    @Column(name = "date")
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "evidence_id")
    private Evidence evidence;
    @ManyToOne
    @JoinColumn(name = "detective_id")
    private Detective detective;
    @Column(name = "track_action")
    @Enumerated(EnumType.STRING)
    private TrackAction trackAction;
    @Column(name = "reason")
    private String reason;
    public TrackEntry() {
        date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "TrackEntry{" +
                "date=" + date +
                ", evidence=" + evidence +
                ", detective=" + detective +
                ", trackAction=" + trackAction +
                ", reason='" + reason + '\'' +
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
        TrackEntry that = (TrackEntry) o;
        return date.equals(that.date) && evidence.equals(that.evidence) && detective.equals(that.detective) && trackAction == that.trackAction && reason.equals(that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), date, evidence, detective, trackAction, reason);
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
}
