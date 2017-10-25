/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_DaiLy;
import DTO.DTO_NhaXuatBan;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_NhaXuatBan {
    public static int ThemNhaXuatBan(DTO_NhaXuatBan item) {
        String CauTruyVan = "INSERT INTO NHAXUATBAN(TENNHAXB,DIACHI,GMAIL,SDT,CHICHU) values(N'"+item.getTenNhaXB()+"',N'"+item.getDiaChi()+"',N'"+item.getGmail()+"','"+item.getSoDienThoai()+"',N'"+item.getGhiChu()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaNhaXuatBan(int item) {
        String CauTruyVan ="delete NHAXUATBAN where MaNhaXB = "+item+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaNhaXuatBan(DTO_NhaXuatBan item) {
        String CauTruyVan ="update NHAXUATBAN set TENNHAXB=N'"+item.getTenNhaXB()+"',DIACHI='"+item.getDiaChi()+"',GMAIL='"+item.getGmail()+"',SDT='"+item.getSoDienThoai()+"',CHICHU=N'"+item.getGhiChu()+"' where MANHAXB="+item.getMaNhaXB()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_NhaXuatBan() {
        String query = "select * from NHAXUATBAN";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet Xuat_NhaXuatBan(DTO_DaiLy key) {
        String query = "select * from NHAXUATBAN where MANHAXB="+key+" or TENNHAXB like '%"+key+"%' or DIACHI like '%"+key+"%' or GMAIL like'%"+key+"%' or SDT ="+key+";";
        System.out.println("Thang cong");
        return  Assignment.connection.ExcuteQuerySelect(query);
    }
}
