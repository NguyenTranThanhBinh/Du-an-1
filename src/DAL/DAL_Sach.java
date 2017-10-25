/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_Sach;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_Sach {
    public static int ThemSach(DTO_Sach item) {
        String CauTruyVan = "insert into SACH(TENSACH,MATL,MATG,SOLUONG,GIANHAP,GIAXUAT,MOTA) values(N'"+item.getTenSach()+"',"+item.getMaTL()+","+item.getMaTG()+","+item.getSoLuong()+","+item.getGiaNhap()+","+item.getGiaXuat()+",N'"+item.getMoTa()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaSach(DTO_Sach item) {
        String CauTruyVan ="delete SACH where MaSach = "+item.getMaSach()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaSach(DTO_Sach item) {
        String CauTruyVan ="update SACH set TENSACH=N'"+item.getTenSach()+"',MATL="+item.getMaTL()+",MATG="+item.getMaTG()+",SOLUONG="+item.getSoLuong()+",GIANHAP="+item.getGiaNhap()+",GIAXUAT="+item.getGiaXuat()+",MOTA=N'"+item.getMoTa()+"' where MASACH="+item.getMaSach()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_Sach() {
        String query = "select * from SACH";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet GetALL_Sach_TG_TL() {
        String query = "select * from TACGIA,THELOAI,SACH where SACH.MATG = TACGIA.MATG and SACH.MATL = THELOAI.MATL";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet timkiemsach(String key) {
        String query = "select * from SACH where MASACH like '"+key+"'";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
