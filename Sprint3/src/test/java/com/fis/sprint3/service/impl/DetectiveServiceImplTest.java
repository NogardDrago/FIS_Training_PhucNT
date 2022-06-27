package com.fis.sprint3.service.impl;

import com.fis.sprint3.model.Detective;
import com.fis.sprint3.model.Person;
import com.fis.sprint3.model.enums.EmploymentStatus;
import com.fis.sprint3.model.enums.Rank;
import com.fis.sprint3.service.DetectiveService;
import com.fis.sprint3.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DetectiveServiceImplTest {
    @Autowired
    private DetectiveService detectiveService;
    @Autowired
    private PersonService personService;
    @Test
    void save() {
        Person person = new Person();
        person.setUserName("nogard");
        person.setFirstName("Ngo Tien");
        person.setLastName("Phuc");
        person.setPassword("123456789");
        personService.save(person);
        Detective detective = new Detective();
        detective.setRank(Rank.INSPECTOR);
        detective.setEmploymentStatus(EmploymentStatus.RETIRED);
        detective.setArmed(true);
        detective.setBadgeNumber("N01");
        detective.setPerson(person);
        detectiveService.save(detective);
    }
}