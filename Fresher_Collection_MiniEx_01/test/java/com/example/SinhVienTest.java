package com.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SinhVienTest {

    @Test
    void themDiem() {
    }

    @Test
    void tinhDiemTrungBinh() {
        SinhVien s = new SinhVien("00","abc");
        Set<Diem> monDaHoc = s.getMonDaHoc();
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("OOP",2,1);
        Diem diem = new Diem(monHoc1, 8);
        Diem diem2 = new Diem(monHoc2, 7);
        monDaHoc.add(diem);
        monDaHoc.add(diem2);
        double diem3=s.tinhDiemTrungBinh();
        assertEquals(7,diem3);
        //return 0;
    }

    @Test
    void bangDiem() {
        SinhVien s = new SinhVien("00","abc");
        Set<Diem> monDaHoc = s.getMonDaHoc();
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("OOP",2,1);
        Diem diem = new Diem(monHoc1, 8);
        Diem diem2 = new Diem(monHoc2, 7);
        monDaHoc.add(diem);
        monDaHoc.add(diem2);
        String bangD=s.bangDiem();
        System.out.println(bangD);
    }

    @Test
    void xepLoai() {
        SinhVien s = new SinhVien("00","abc");
        Set<Diem> monDaHoc = s.getMonDaHoc();
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("OOP",2,1);
        Diem diem = new Diem(monHoc1, 8);
        Diem diem2 = new Diem(monHoc2, 7);
        monDaHoc.add(diem);
        monDaHoc.add(diem2);
        String xepLoaiSV=s.xepLoai();
        System.out.println(xepLoaiSV);
    }
}