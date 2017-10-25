/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_PhieuXuat;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_PhieuXuat {
    public static int ThemPhieuXuat(DTO.DTO_PhieuXuat item) {
        String CauTruyVan = "insert into PHIEUXUAT(SOPHIEUXUAT,MANV,NGAYTAO,TINHTRANG,TONGTIEN) values('"+item.getSoPhieuXuat()+"',"+item.getMaNV()+","+item.getNgayTao()+","+item.getTinhTrang()+","+item.getTongTien()+")"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaPhieuXuat(DTO_PhieuXuat item) {
        String CauTruyVan ="delete PHIEUXUAT where MaPhieuXuat = "+item.getMaPhieuXuat()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaPhieuXuat(DTO_PhieuXuat item) {
        String CauTruyVan ="update PHIEUXUAT set SOPHIEUXUAT="+item.getSoPhieuXuat()+",MANV="+item.getMaNV()+",NGAYTAO="+item.getNgayTao()+",TINHTRANG="+item.getTinhTrang()+",TONGTIEN="+item.getTongTien()+" where MAPHIEUXUAT="+item.getMaPhieuXuat()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_PhieuXuat() {
        String query = "select * from PHIEUXUAT";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
