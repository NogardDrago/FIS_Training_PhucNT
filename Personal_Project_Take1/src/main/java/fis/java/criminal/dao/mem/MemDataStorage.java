package fis.java.criminal.dao.mem;

import fis.java.criminal.model.CriminalCase;
import fis.java.criminal.model.Detective;
import fis.java.criminal.model.Evidence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemDataStorage {
    public static final Map<Long,CriminalCase> criminalCaseMem = new HashMap();
    public static final Map<Long,Detective> detectiveMem = new HashMap();
    public static final Map<Long, Evidence> evidenceMem = new HashMap();
}
