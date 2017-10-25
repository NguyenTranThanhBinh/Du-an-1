/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_PhieuNhap;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_PhieuNhap {
    public static int ThemPhieuNhap(DTO_PhieuNhap item) {
        String CauTruyVan = "insert into PHIEUNHAP(SOPHIEUNHAP,MANV,MANXB,NGAYTAO,TINHTRANG,TONGTIEN)"+
                " values('"+item.getSoPhieuNhap()+"',"+item.getMaVN()+","+item.getMaNXB()+","+item.getNgayTao()+","+item.getTinhTrang()+","+item.getTongTien()+")"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaPhieuNhap(DTO_PhieuNhap item) {
        String CauTruyVan ="delete PHIEUNHAP where MaPhieuNhap = "+item.getMaPhieuNhap()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaPhieuNhap(DTO_PhieuNhap item) {
        String CauTruyVan ="update PHIEUNHAP set SOPHIEUNHAP="+item.getSoPhieuNhap()+",MANV="+item.getMaVN()+",NGAYTAO="+item.getNgayTao()+",TINHTRANG="+item.getTinhTrang()+",TONGTIEN="+item.getTongTien()+" where MAPHIEUNHAP="+item.getMaPhieuNhap()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_PhieuNhap() {
        String query = "select * from PHIEUNHAP";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
