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
public class DTO_NhanVien {
    int MaVN;
    String TenNV;
    String DiaChi;
    int GioiTinh;
    String NgaySinh;
    String NgayVaoLam;
    String SoDienThoai;
    String TenDangNhap;
    String MatKhau;
    int MaQuyen;
    String GhiChu;

    public DTO_NhanVien() {
    }

    public DTO_NhanVien(int MaVN, String TenNV, String DiaChi, int GioiTinh, String NgaySinh, String NgayVaoLam, String SoDienThoai, String TenDangNhap, String MatKhau, int MaQuyen, String GhiChu) {
        this.MaVN = MaVN;
        this.TenNV = TenNV;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NgayVaoLam = NgayVaoLam;
        this.SoDienThoai = SoDienThoai;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaQuyen = MaQuyen;
        this.GhiChu = GhiChu;
    }

    public DTO_NhanVien(String TenNV, String DiaChi, int GioiTinh, String NgaySinh, String NgayVaoLam, String SoDienThoai, String TenDangNhap, String MatKhau, int MaQuyen, String GhiChu) {
        this.TenNV = TenNV;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NgayVaoLam = NgayVaoLam;
        this.SoDienThoai = SoDienThoai;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaQuyen = MaQuyen;
        this.GhiChu = GhiChu;
    }

    public int getMaVN() {
        return MaVN;
    }

    public void setMaVN(int MaVN) {
        this.MaVN = MaVN;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(String NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
}
