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
public class DTO_PhieuXuat {
    int MaPhieuXuat;
    String SoPhieuXuat;
    int MaNV;
    String NgayTao;
    String TinhTrang;
    double TongTien;

    public DTO_PhieuXuat() {
    }

    public DTO_PhieuXuat(int MaPhieuXuat, String SoPhieuXuat, int MaNV, String NgayTao, String TinhTrang, double TongTien) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.SoPhieuXuat = SoPhieuXuat;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public DTO_PhieuXuat(String SoPhieuXuat, int MaNV, String NgayTao, String TinhTrang, double TongTien) {
        this.SoPhieuXuat = SoPhieuXuat;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
    }

    public int getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(int MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public String getSoPhieuXuat() {
        return SoPhieuXuat;
    }

    public void setSoPhieuXuat(String SoPhieuXuat) {
        this.SoPhieuXuat = SoPhieuXuat;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
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

