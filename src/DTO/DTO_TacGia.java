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
public class DTO_TacGia {
    int MaTG;
    String TenTG;
    String GioiTinh;
    String NoiSinh;
    String DiaChi;
    String SoDienThoai;
    String GhiChu;

    public DTO_TacGia() {
    }

    public DTO_TacGia(int MaTG, String TenTG, String GioiTinh, String NoiSinh, String DiaChi, String SoDienThoai, String GhiChu) {
        this.MaTG = MaTG;
        this.TenTG = TenTG;
        this.GioiTinh = GioiTinh;
        this.NoiSinh = NoiSinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public DTO_TacGia(String TenTG, String GioiTinh, String NoiSinh, String DiaChi, String SoDienThoai, String GhiChu) {
        this.TenTG = TenTG;
        this.GioiTinh = GioiTinh;
        this.NoiSinh = NoiSinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public int getMaTG() {
        return MaTG;
    }

    public void setMaTG(int MaTG) {
        this.MaTG = MaTG;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
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
