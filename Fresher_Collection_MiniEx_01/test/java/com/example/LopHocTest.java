package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LopHocTest {

    @Test
    void inDiem() {
    }

    @Test
    void top10() {
    }

    @Test
    void sinhVienYeu() {
    }

    @Test
    void getTen() {
    }

    @Test
    void setTen() {
    }

    @Test
    void getGiaoVien() {
    }

    @Test
    void setGiaoVien() {
    }

    @Test
    void getDsLop() {
    }

    @Test
    void setDsLop() {
    }

    @Test
    void them() {
    }

    @Test
    void testInDiem() {
        LopHoc l = new LopHoc("AB","TE");
        List<SinhVien> dsLop = l.getDsLop();
        SinhVien s = new SinhVien("00","abc");
        Set<Diem> monDaHoc = s.getMonDaHoc();
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("OOP",2,1);
        Diem diem = new Diem(monHoc1, 8);
        Diem diem2 = new Diem(monHoc2, 7);
        monDaHoc.add(diem);
        monDaHoc.add(diem2);
        SinhVien s2 = new SinhVien("01","def");
        Set<Diem> monDaHoc2 = s2.getMonDaHoc();
        MonHoc monHoc3 = new MonHoc("ATTT",3,2);
        MonHoc monHoc4 = new MonHoc("QTKD",3,4);
        Diem diem3 = new Diem(monHoc3, 8);
        Diem diem4 = new Diem(monHoc4, 7);
        monDaHoc2.add(diem3);
        monDaHoc2.add(diem4);
        dsLop.add(s);
        dsLop.add(s2);
        String ketQua=l.inDiem();
        System.out.println(ketQua);
    }

    @Test
    void testTop10() {
        LopHoc l = new LopHoc("AB","TE");
        List<SinhVien> dsLop = l.getDsLop();
        SinhVien s = new SinhVien("00","abc");
        Set<Diem> monDaHoc = s.getMonDaHoc();
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("OOP",2,1);
        Diem diem = new Diem(monHoc1, 8);
        Diem diem2 = new Diem(monHoc2, 7);
        monDaHoc.add(diem);
        monDaHoc.add(diem2);
        SinhVien s2 = new SinhVien("01","def");
        Set<Diem> monDaHoc2 = s2.getMonDaHoc();
        MonHoc monHoc3 = new MonHoc("ATTT",3,2);
        MonHoc monHoc4 = new MonHoc("QTKD",3,4);
        Diem diem3 = new Diem(monHoc3, 8);
        Diem diem4 = new Diem(monHoc4, 7);
        monDaHoc2.add(diem3);
        monDaHoc2.add(diem4);
        dsLop.add(s);
        dsLop.add(s2);
        l.top10()
    }

    @Test
    void testSinhVienYeu() {
    }
}