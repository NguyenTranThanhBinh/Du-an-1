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
public class DTO_ChiTietPhieuNhap {
    int MaCTPN;
    int MaPhieuNhap;
    int MaSach;
    String SoLuong;
    double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuNhap() {
    }

    public DTO_ChiTietPhieuNhap(int MaCTPN, int MaPhieuNhap, int MaSach, String SoLuong, double ThanhTien, String GhiChu) {
        this.MaCTPN = MaCTPN;
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuNhap(int MaPhieuNhap, int MaSach, String SoLuong, double ThanhTien, String GhiChu) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public int getMaCTPN() {
        return MaCTPN;
    }

    public void setMaCTPN(int MaCTPN) {
        this.MaCTPN = MaCTPN;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
}

