/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_ChiTietPhieuNhap;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_ChiTietPhieuNhap {
    
    public static int ThemChiTietPhieuNhap(DTO_ChiTietPhieuNhap item) {
        String CauTruyVan = "insert into CHITIETPHIEUNHAP (MAPHIEUNHAP, MASACH, SOLUONG, THANHTIEN, GHICHU) "
                +"values ("+ item.getMaPhieuNhap() +", "+item.getMaSach()+", "+item.getSoLuong()+","+item.getThanhTien()+",N'"+item.getGhiChu()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaChiTietPhieuNhap(DTO_ChiTietPhieuNhap item) {
        String CauTruyVan ="delete CHITIETPHIEUNHAP where MACTPN = "+item.getMaCTPN()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaChiTietPhieuNhap(DTO_ChiTietPhieuNhap item) {
        String CauTruyVan ="update CHITIETPHIEUNHAP set MAPHIEUNHAP="+item.getMaPhieuNhap()+",MASACH="+item.getMaSach()+",SOLUONG="+item.getSoLuong()+",THANHTIEN="+item.getThanhTien()+",GHICHU=N'"+item.getGhiChu()+"' where MACTPN = "+item.getMaCTPN()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_ChiTietPhieuNhap() {
        String query = "select * from CHITIETPHIEUNHAP";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet Xuat_ChiTietPhieuNhap(DTO_ChiTietPhieuNhap key){
        String query = "select * from CHITIETPHIEUNHAP where MACTPN = "+key+" or MAPHIEUNHAP ="+key+" or MASACH ="+key+" or SOLUONG="+key+" or THANHTIEN="+key+";";
        System.out.println("Thành công!");
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
