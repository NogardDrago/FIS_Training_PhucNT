package fis.java.criminal.dao.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fis.java.criminal.connectpool.DataSource;
import fis.java.criminal.dao.ICriminalCaseDAO;
import fis.java.criminal.model.CriminalCase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class CriminalCaseJDBC implements ICriminalCaseDAO {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseJDBC.class);
    @Override
    public CriminalCase get(long id) {
        return null;
    }

    @Override
    public List<CriminalCase> getAll() {
        return null;
    }

    @Override
    public void save(CriminalCase criminalCase) {
        Connection con = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO sprint_2.criminal_case_list\n" +
                "VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            con = DataSource.getConnection();
            assert con != null;
            ps = con.prepareStatement(query);
            ps.setLong(1, criminalCase.getId());
            ps.setString(2, localDateTimeToString(criminalCase.getCreatedAt()));
            ps.setString(3, localDateTimeToString(criminalCase.getModifiedAt()));
            ps.setString(4, criminalCase.getNumber());
            ps.setString(5, String.valueOf(criminalCase.getType()));
            ps.setString(6, criminalCase.getShortDescription());
            ps.setString(7, String.valueOf(criminalCase.getStatus()));
            ps.setString(8, criminalCase.getNotes());
            ps.setString(9, criminalCase.getLeadInvestigator().getBadgeNumber());
            if (ps.executeUpdate() > 0) {
                log.info("Them case " + criminalCase.getNumber() + " thanh cong");
            } else {
                log.error("Them case " + criminalCase.getNumber() + " khong thanh cong");
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }

    @Override
    public void update(CriminalCase criminalCase) {
        String query = "update criminal_case_list\n" +
                "set\n" +
                "    id = ?,\n" +
                "    modified_date = ?,\n" +
                "    case_type = ?,\n" +
                "    description = ?,\n" +
                "    status = ?,\n" +
                "    notes = ?,\n" +
                "    lead_investigator = ?\n" +
                "where number = ?";
        try (Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, criminalCase.getId());
            ps.setString(2, localDateTimeToString(LocalDateTime.now()));
            ps.setString(3, String.valueOf(criminalCase.getType()));
            ps.setString(4, criminalCase.getShortDescription());
            ps.setString(5, String.valueOf(criminalCase.getStatus()));
            ps.setString(6, criminalCase.getNotes());
            ps.setString(7, criminalCase.getLeadInvestigator().getBadgeNumber());
            ps.setString(8, criminalCase.getNumber());
            if (ps.executeUpdate() > 0) {
                log.info("Update thanh cong");
            } else {
                log.error("Update that bai");
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }

    @Override
    public void delete(long id) {
        String query = "delete from criminal_case_list where number = ?;";
        try (Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,  String.valueOf(id));

            if (ps.executeUpdate() < 0) {
                log.error("Xoa " + id + " khong thanh cong!");
            } else {
                log.info("Xoa " + id + " thanh cong!");
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }
}
