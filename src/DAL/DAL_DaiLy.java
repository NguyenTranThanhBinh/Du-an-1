/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_DaiLy;
import GUI.Assignment;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class DAL_DaiLy {
    public static int ThemDaiLy(DTO_DaiLy item) {
        String CauTruyVan = "insert into DAILY(TENDAILY,DIACHI,SDT) values(N'"+item.getTenDaiLy()+"',N'"+item.getDiaChi()+"','"+item.getSoDienThoai()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaDaiLy(int item) {
        String CauTruyVan ="delete DAILY where MaDaiLy = "+item+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaDaiLy(DTO_DaiLy item) {
        String CauTruyVan ="update DAILY set TENDAILY=N'"+item.getTenDaiLy()+"',DIACHI=N'"+item.getDiaChi()+"',SDT='"+item.getSoDienThoai()+"' where MADAILY="+item.getMaDaiLy()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_DaiLy() {
        String query = "select * from DAILY";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet Xuat_DaiLy(DTO_DaiLy key) {
        String query = "select * from DAILY where MADAILY="+key+" or TENDAILY like '%"+key+"%'or DIACHI like'%"+key+"%'or SDT="+key+";";
        System.out.println("Thang cong");
        return  Assignment.connection.ExcuteQuerySelect(query);
    }
    public static DTO_DaiLy layDLTheoMa(String ID){
        ResultSet rs;
        String SQLSelect = "Select * from DAILY where MADAILY like '%"+ID+"%'";
        rs = Assignment.connection.ExcuteQuerySelect(SQLSelect);
        DTO_DaiLy kh = new DTO_DaiLy();
        try {
            while(rs.next()){
                kh.setMaDaiLy(rs.getInt("MADAILY"));
                kh.setTenDaiLy(rs.getString("TENDAILY"));
                kh.setDiaChi(rs.getString("DIACHI"));
                kh.setSoDienThoai(rs.getString("SDT"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi Truy Vấn : " + e.getMessage());
        }
        return kh;
    }
}
