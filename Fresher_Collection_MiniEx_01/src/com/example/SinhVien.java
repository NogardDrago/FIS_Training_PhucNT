package com.example;

import java.util.*;
import java.util.function.Predicate;

public class SinhVien {
    private final String mssv;
    private final String ten;

    private final Set<Diem> monDaHoc = new HashSet<Diem>();

    public SinhVien(String mssv, String ten) {
        this.mssv = mssv;
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public Set<Diem> getMonDaHoc() {
        return monDaHoc;
    }

    public boolean themDiem(Diem diemMoi) {
        return this.monDaHoc.add(diemMoi);
    }

    //TODO Cau 1
    public double tinhDiemTrungBinh() {
        //Giong nhu cach tinh hien tai cua truong
        //...
        //public
//        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
//        Diem diem = new Diem(monHoc1, 8);
        int i=1;
        int tc=0;
        int diem1=0;
        int diemTong=0;
        int tcTong=0;
        for (Diem s :monDaHoc){
            tc= s.getMon().getTcLT()+ s.getMon().getTcTH();
            tcTong=tc+tcTong;
            diem1= s.getDiem()*(s.getMon().getTcLT()+ s.getMon().getTcTH());
            diemTong=diem1+diemTong;
        }

        return diemTong/tcTong;
    }


    //TODO Cau 2
    public String bangDiem() {
        StringBuilder tt = new StringBuilder();
        int stt=0;
        tt.append("MSSV : "+mssv+"\n");
        tt.append("Ten  : "+ten+"\n");
        tt.append("Danh Sach Diem \n");
        tt.append("STT  Ten Mon           Diem         So Tin Chi\n");
        for (Diem s :monDaHoc){
            stt++;
            tt.append(stt+"    "+s.getMon().getTen()+"               "+s.getDiem()+"             "+s.getMon().getTcTH()+s.getMon().getTcLT()+"\n");
        }
        tt.append("Diem Trung Binh  "+tinhDiemTrungBinh());
        return tt.toString();
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
        //...
        //StringBuilder
        //return null;
    }
    

    //TODO Cau 3
    public String xepLoai() {
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */
    if (tinhDiemTrungBinh()<5){
        return "YEU";
    }
    else if (tinhDiemTrungBinh()>=5&&tinhDiemTrungBinh()<6){
        return "TB";
    }
    else if (tinhDiemTrungBinh()>=6&&tinhDiemTrungBinh()<7){
        return "TB-KHA";
    }
    else if (tinhDiemTrungBinh()>=7&&tinhDiemTrungBinh()<8){
        return "KHA";
    }
    else if (tinhDiemTrungBinh()>=8){
        return "GIOI";
    }
        //...
        return "";
    }

//    public MonHoc getMonHoc1() {
//        return monHoc1;
//    }
    public List<Diem> getDiemByCondition(Predicate<Diem> predicate){
        List<Diem> dsDiem = new ArrayList<>();
        for (Diem diem:this.monDaHoc){
            if(predicate.test(diem)) {
                dsDiem.add(diem);
            }
        }
        return dsDiem;
        //Test
//        List<Diem> dsDiem = sv.getDiemByCondition
    }
    public static boolean dauPredicate(Diem diem){
        if (diem.getDiem()<5) return true;
        else return false;
        // Test: dsDiem = sv.getDiemByCondition(SinhVien::dauPredicate)
    }
}
