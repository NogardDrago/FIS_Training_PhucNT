package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;

import java.time.LocalDateTime;

public class Person extends AbstractEntity {
    String username;
    String firstName;
    String lastName;
    String password;
    LocalDateTime hiringDate;
}
