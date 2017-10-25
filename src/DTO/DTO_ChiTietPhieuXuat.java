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
public class DTO_ChiTietPhieuXuat {
    int MaCTPX;
    int MaPhieuXuat;
    int MaSach;
    String SoLuong;
    double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuXuat() {
    }

    public DTO_ChiTietPhieuXuat(int MaCTPX, int MaPhieuXuat, int MaSach, String SoLuong, double ThanhTien, String GhiChu) {
        this.MaCTPX = MaCTPX;
        this.MaPhieuXuat = MaPhieuXuat;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuXuat(int MaPhieuXuat, int MaSach, String SoLuong, double ThanhTien, String GhiChu) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public int getMaCTPX() {
        return MaCTPX;
    }

    public void setMaCTPX(int MaCTPX) {
        this.MaCTPX = MaCTPX;
    }

    public int getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(int MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
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
