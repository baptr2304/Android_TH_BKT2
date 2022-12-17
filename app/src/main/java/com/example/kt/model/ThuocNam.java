package com.example.kt.model;

public class ThuocNam {
    private int MaThuoc;
    private String MauLa;
    private String Ten;
    private String DacTinh;
    private String CongDung;

    public ThuocNam(int maThuoc, String mauLa, String ten, String dacTinh, String congDung) {
        MaThuoc = maThuoc;
        MauLa = mauLa;
        Ten = ten;
        DacTinh = dacTinh;
        CongDung = congDung;
    }

    public ThuocNam(String mauLa, String ten, String dacTinh, String congDung) {
        MauLa = mauLa;
        Ten = ten;
        DacTinh = dacTinh;
        CongDung = congDung;
    }

    public int getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        MaThuoc = maThuoc;
    }

    public String getMauLa() {
        return MauLa;
    }

    public void setMauLa(String mauLa) {
        MauLa = mauLa;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDacTinh() {
        return DacTinh;
    }

    public void setDacTinh(String dacTinh) {
        DacTinh = dacTinh;
    }

    public String getCongDung() {
        return CongDung;
    }

    public void setCongDung(String congDung) {
        CongDung = congDung;
    }
}
