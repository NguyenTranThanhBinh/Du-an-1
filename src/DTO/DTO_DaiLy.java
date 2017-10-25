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
public class DTO_DaiLy {
    int MaDaiLy;
    String TenDaiLy;
    String DiaChi;
    String SoDienThoai;

    public DTO_DaiLy() {
    }

    public DTO_DaiLy(int MaDaiLy, String TenDaiLy, String DiaChi, String SoDienThoai) {
        this.MaDaiLy = MaDaiLy;
        this.TenDaiLy = TenDaiLy;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
    }

    public DTO_DaiLy(String TenDaiLy, String DiaChi, String SoDienThoai) {
        this.TenDaiLy = TenDaiLy;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
    }

    public int getMaDaiLy() {
        return MaDaiLy;
    }

    public void setMaDaiLy(int MaDaiLy) {
        this.MaDaiLy = MaDaiLy;
    }

    public String getTenDaiLy() {
        return TenDaiLy;
    }

    public void setTenDaiLy(String TenDaiLy) {
        this.TenDaiLy = TenDaiLy;
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
    
    
}
