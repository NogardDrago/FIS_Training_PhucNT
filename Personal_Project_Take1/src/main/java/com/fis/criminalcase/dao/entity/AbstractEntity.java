package com.fis.criminalcase.dao.entity;
import java.time.*;

public abstract class AbstractEntity {
    long id;
    int version;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
}
