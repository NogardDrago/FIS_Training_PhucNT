package fis.java.criminal.model;

import fis.java.criminal.enitity.AbstractEntity;
import fis.java.criminal.model.enums.CaseStatus;
import fis.java.criminal.model.enums.CaseType;

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
