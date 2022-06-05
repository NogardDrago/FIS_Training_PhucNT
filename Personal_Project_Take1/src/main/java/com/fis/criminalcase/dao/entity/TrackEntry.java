package com.fis.criminalcase.dao.entity;

import com.fis.criminalcase.dao.Detective;
import com.fis.criminalcase.dao.Evidence;
import com.fis.criminalcase.dao.TrackAction;
import com.fis.criminalcase.dao.entity.AbstractEntity;

import java.time.LocalDateTime;

public class TrackEntry extends AbstractEntity {
    LocalDateTime date;
    Evidence evidence;
    Detective detective;
    TrackAction action;
    String reason;
}
