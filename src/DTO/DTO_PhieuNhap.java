/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Asus
 */
public class DTO_PhieuNhap {
    int MaPhieuNhap;
    String SoPhieuNhap;
    int MaVN;
    int MaNXB;
    String NgayTao;
    String TinhTrang;
    double TongTien;

    public DTO_PhieuNhap() {
    }

    public DTO_PhieuNhap(int MaPhieuNhap, String SoPhieuNhap, int MaVN, int MaNXB, String NgayTao, String TinhTrang, double TongTien) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.SoPhieuNhap = SoPhieuNhap;
        this.MaVN = MaVN;
        this.MaNXB = MaNXB;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public DTO_PhieuNhap(String SoPhieuNhap, int MaVN, int MaNXB, String NgayTao, String TinhTrang, double TongTien) {
        this.SoPhieuNhap = SoPhieuNhap;
        this.MaVN = MaVN;
        this.MaNXB = MaNXB;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getSoPhieuNhap() {
        return SoPhieuNhap;
    }

    public void setSoPhieuNhap(String SoPhieuNhap) {
        this.SoPhieuNhap = SoPhieuNhap;
    }

    public int getMaVN() {
        return MaVN;
    }

    public void setMaVN(int MaVN) {
        this.MaVN = MaVN;
    }

    public int getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(int MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }
    
    
}
