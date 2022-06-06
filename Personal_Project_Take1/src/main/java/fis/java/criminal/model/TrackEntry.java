package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;
import fis.java.criminal.model.Detective;
import fis.java.criminal.model.Evidence;
import fis.java.criminal.model.enums.TrackAction;

import java.time.LocalDateTime;

public class TrackEntry extends AbstractEntity {
    LocalDateTime date;
    Evidence evidence;
    Detective detective;
    TrackAction action;
    String reason;
}
