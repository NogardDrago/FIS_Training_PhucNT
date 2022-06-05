package com.fis.criminalcase.dao.entity;

import com.fis.criminalcase.dao.entity.AbstractEntity;

import java.time.LocalDateTime;

public class Person extends AbstractEntity {
    String username;
    String firstName;
    String lastName;
    String password;
    LocalDateTime hiringDate;
}
