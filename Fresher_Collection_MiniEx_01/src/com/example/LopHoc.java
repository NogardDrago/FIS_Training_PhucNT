package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class LopHoc {
    private String ten;
    private String giaoVien;
    private List<SinhVien> dsLop = new ArrayList<SinhVien>();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public List<SinhVien> getDsLop() {
        return dsLop;
    }

    public void setDsLop(List<SinhVien> dsLop) {
        this.dsLop = dsLop;
    }

    public LopHoc(String ten, String giaoVien) {
        this.ten = ten;
        this.giaoVien = giaoVien;
    }

    public boolean them(SinhVien svMoi) {
        return dsLop.add(svMoi);
    }

    //TODO Cau 4
    public String inDiem() {
        StringBuilder lop = new StringBuilder();
        int stt=0;
        lop.append("Danh Sach Diem Lop:  "+ten+"\n");
        lop.append("Giao Vien Chu Nhiem:  "+giaoVien+"\n");
        lop.append("STT   MSSV     Ten        Diem TB   Xep Loai\n");
        for (SinhVien s :dsLop) {
            stt++;
            lop.append(stt+"    "+s.getMssv()+"    "+s.getTen()+"     "+s.tinhDiemTrungBinh()+"     "+s.xepLoai()+"\n");
        }
        return lop.toString();
    /*
    Danh Sach Diem Lop : ten
    Giao Vien Chu Nhiem : giaoVien
    STT      MSSV        Ten              Diem TB   XepLoai
    1        123456      Nguyen Van A     8.4       GIOI
    2        678919      Nguyen Van B     6         TB-KHA
    3        112456      Nguyen Van C     7         KHA
    */
        //...

       // return null;
    }

    //TODO Cau 5
    public List<SinhVien> top10() {
        List<SinhVien> top10 = dsLop.stream()
                .sorted(Comparator<SinhVien>.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
//    return top10;
        //Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
        //...
        return null;
    }

    //TODO Cau 6
    public List<SinhVien> sinhVienYeu() {
        //Tra ve danh sach vien vien xep loai YEU
        //...

        return null;
    }
}
