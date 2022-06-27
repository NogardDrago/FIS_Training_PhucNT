package com.fis.sprint4.repository;

import com.fis.sprint4.model.Storage;
import com.fis.sprint4.model.TrackEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackEntryRepo extends JpaRepository<TrackEntry,Long> {
}
