package com.fis.criminalcase.dao.entity;

import com.fis.criminalcase.dao.CaseStatus;
import com.fis.criminalcase.dao.CaseType;
import com.fis.criminalcase.dao.Detective;
import com.fis.criminalcase.dao.Evidence;
import com.fis.criminalcase.dao.entity.AbstractEntity;

import java.util.Set;

public class CriminalCase extends AbstractEntity {
    String number;
    CaseType type;
    String shortDescription;
    String detailedDescription;
    CaseStatus status;
    String notes;
    Set<Evidence> evidenceSet;
    Detective leadInvestigator;
    Set<Detective> assigned;
}
