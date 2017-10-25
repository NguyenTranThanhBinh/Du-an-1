/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_TheLoai;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_TheLoai {
    public static int ThemTheLoai(DTO_TheLoai item) {
        String CauTruyVan = "insert into THELOAI (TENTL,MOTA) values (N'"+item.getTenTL()+"',N'"+item.getMoTa()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaTheLoai(DTO_TheLoai item) {
        String CauTruyVan ="delete THELOAI where MaTL = "+item.getMaTL()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaTheLoai(DTO_TheLoai item) {
        String CauTruyVan ="update THELOAI set TENTL=N'"+item.getTenTL()+"',MOTA=N'"+item.getMoTa()+"' where MATL="+item.getMaTL()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_TheLoai() {
        String query = "select * from THELOAI";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
