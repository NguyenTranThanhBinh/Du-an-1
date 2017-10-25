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
public class DTO_Sach {
    int MaSach;
    String TenSach;
    int MaTL;
    int MaTG;
    String SoLuong;
    double GiaNhap;
    double GiaXuat;
    String MoTa;

    public DTO_Sach() {
    }

    public DTO_Sach(int MaSach, String TenSach, int MaTL, int MaTG, String SoLuong, double GiaNhap, double GiaXuat, String MoTa) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaTL = MaTL;
        this.MaTG = MaTG;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.GiaXuat = GiaXuat;
        this.MoTa = MoTa;
    }

    public DTO_Sach(String TenSach, int MaTL, int MaTG, String SoLuong, double GiaNhap, double GiaXuat, String MoTa) {
        this.TenSach = TenSach;
        this.MaTL = MaTL;
        this.MaTG = MaTG;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.GiaXuat = GiaXuat;
        this.MoTa = MoTa;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getMaTL() {
        return MaTL;
    }

    public void setMaTL(int MaTL) {
        this.MaTL = MaTL;
    }

    public int getMaTG() {
        return MaTG;
    }

    public void setMaTG(int MaTG) {
        this.MaTG = MaTG;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public double getGiaXuat() {
        return GiaXuat;
    }

    public void setGiaXuat(double GiaXuat) {
        this.GiaXuat = GiaXuat;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    
}
