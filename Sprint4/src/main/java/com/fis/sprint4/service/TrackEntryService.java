package com.fis.sprint4.service;

import com.fis.sprint4.model.TrackEntry;

import java.util.List;

public interface TrackEntryService {
    TrackEntry save(TrackEntry trackEntry);
    List<TrackEntry> getAll();
    TrackEntry update(TrackEntry trackEntry);
    TrackEntry findById(Long id);
    void delete(Long id);
}
