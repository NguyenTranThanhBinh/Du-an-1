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
public class DTO_NhaXuatBan {
    int MaNhaXB;
    String TenNhaXB;
    String DiaChi;
    String Gmail;
    String SoDienThoai;
    String GhiChu;

    public DTO_NhaXuatBan() {
    }

    public DTO_NhaXuatBan(int MaNhaXB, String TenNhaXB, String DiaChi, String Gmail, String SoDienThoai, String GhiChu) {
        this.MaNhaXB = MaNhaXB;
        this.TenNhaXB = TenNhaXB;
        this.DiaChi = DiaChi;
        this.Gmail = Gmail;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public DTO_NhaXuatBan(String TenNhaXB, String DiaChi, String Gmail, String SoDienThoai, String GhiChu) {
        this.TenNhaXB = TenNhaXB;
        this.DiaChi = DiaChi;
        this.Gmail = Gmail;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public int getMaNhaXB() {
        return MaNhaXB;
    }

    public void setMaNhaXB(int MaNhaXB) {
        this.MaNhaXB = MaNhaXB;
    }

    public String getTenNhaXB() {
        return TenNhaXB;
    }

    public void setTenNhaXB(String TenNhaXB) {
        this.TenNhaXB = TenNhaXB;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
