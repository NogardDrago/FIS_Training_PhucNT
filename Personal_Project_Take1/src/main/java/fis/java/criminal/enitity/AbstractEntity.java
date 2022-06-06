package fis.java.criminal.enitity;

import java.time.*;

public abstract class AbstractEntity {
    long id;
    int version;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
}
