package com.fis.sprint3.service.impl;

import com.fis.sprint3.model.Person;
import com.fis.sprint3.repository.PersonRepo;
import com.fis.sprint3.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepo personRepo;
    @Override
    public void save(Person person){
        personRepo.save(person);
    }
}
