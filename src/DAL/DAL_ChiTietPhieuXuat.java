/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_ChiTietPhieuXuat;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_ChiTietPhieuXuat {
    public static int ThemChiTietPhieuXuat(DTO_ChiTietPhieuXuat item) {
        String CauTruyVan="insert into CHITIETPHIEUXUAT(MAPHIEUXUAT,MASACH,SOLUONG,THANHTIEN,GHICHU) values("+item.getMaPhieuXuat()+","+item.getMaSach()+","+item.getSoLuong()+","+item.getThanhTien()+",N'"+item.getGhiChu()+"')";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static int XoaChiTietPhieuXuat(DTO_ChiTietPhieuXuat item) {
        String CauTruyVan ="delete CHITIETPHIEUSUAT where MACTPX = "+item.getMaCTPX()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
}
    public static int SuaChiTietPhieuXuat(DTO_ChiTietPhieuXuat item) {
        String CauTruyVan ="update CHITIETPHIEUXUAT set MAPHIEUXUAT="+item.getMaPhieuXuat()+",MASACH="+item.getMaSach()+",SOLUONG="+item.getSoLuong()+",THANHTIEN="+item.getThanhTien()+", GHICHU=N'"+item.getGhiChu()+"' where MACTPX="+item.getGhiChu()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_ChiTietPhieuXuat() {
        String query = "select * from CHITIETPHIEUXUAT";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet Xuat_ChiTietPhieuXuat(DTO_ChiTietPhieuXuat key) {
        String query = "select * from CHITIETPHIEUXUAT where MACTPX = "+key+" or MAPHIEUXUAT = "+key+" or MASACH = "+key+" or SOLUONG="+key+" or THANHTIEN = "+key+"; ";
        System.out.println("Thành công!");
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
