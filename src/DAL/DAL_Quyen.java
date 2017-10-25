/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_Quyen;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_Quyen {
    public static int ThemQuyen(DTO_Quyen item) {
        String CauTruyVan = "insert into QUYEN (TENQUYEN,MOTA) values (N'"+item.getTenQuyen()+"',N'"+item.getMoTa()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaQuyen(int item) {
        String CauTruyVan ="delete QUYEN where MaQuyen = "+item+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaQuyen(DTO_Quyen item) {
        String CauTruyVan ="update QUYEN set TENQUYEN=N'"+item.getTenQuyen()+"',MOTA='"+item.getMoTa()+"' where MAQUYEN="+item.getMaQuyen()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_Quyen() {
        String query = "select * from QUYEN";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
