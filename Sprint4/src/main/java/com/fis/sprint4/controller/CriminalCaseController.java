package com.fis.sprint4.controller;

import com.fis.sprint4.repository.CriminalCaseRepo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sprint3/criminal")
public class CriminalCaseController {
    @Autowired
    private CriminalCaseRepo criminalCaseRepo;

}
