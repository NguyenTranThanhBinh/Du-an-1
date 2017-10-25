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
public class DTO_PhieuThanhToan {
    int MaPhieu;
    int MaPhieuXuat;
    int MaDaiLy;
    String NgayTao;
    String TinhTrang;
    double TongTien;

    public DTO_PhieuThanhToan() {
    }

    public DTO_PhieuThanhToan(int MaPhieu, int MaPhieuXuat, int MaDaiLy, String NgayTao, String TinhTrang, double TongTien) {
        this.MaPhieu = MaPhieu;
        this.MaPhieuXuat = MaPhieuXuat;
        this.MaDaiLy = MaDaiLy;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public DTO_PhieuThanhToan(int MaPhieuXuat, int MaDaiLy, String NgayTao, String TinhTrang, double TongTien) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.MaDaiLy = MaDaiLy;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public int getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(int MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public int getMaDaiLy() {
        return MaDaiLy;
    }

    public void setMaDaiLy(int MaDaiLy) {
        this.MaDaiLy = MaDaiLy;
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
