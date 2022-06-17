package com.pluralsight.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
class RideRepositoryImplTest {

    @Autowired
    private RideRepository rideRepository;

    @Test
    void getRides() {
        System.out.println(rideRepository.getRides());
    }
}