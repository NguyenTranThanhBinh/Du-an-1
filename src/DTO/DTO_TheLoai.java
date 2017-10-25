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
public class DTO_TheLoai {
    int MaTL;
    String TenTL;
    String MoTa;

    public DTO_TheLoai() {
    }

    public DTO_TheLoai(int MaTL, String TenTL, String MoTa) {
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.MoTa = MoTa;
    }

    public DTO_TheLoai(String TenTL, String MoTa) {
        this.TenTL = TenTL;
        this.MoTa = MoTa;
    }

    public int getMaTL() {
        return MaTL;
    }

    public void setMaTL(int MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    
}
