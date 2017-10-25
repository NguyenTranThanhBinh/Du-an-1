/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_TacGia;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_TacGia {
    public static int ThemTacGia(DTO_TacGia item) {
        String CauTruyVan = "insert into TACGIA(TENTG,GIOITINH,NOISINH,DIACHI,SDT,CHICHU) values(N'"+item.getTenTG()+"',"+item.getGioiTinh()+",N'"+item.getNoiSinh()+"',N'"+item.getDiaChi()+"','"+item.getSoDienThoai()+"',N'"+item.getGhiChu()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaTacGia(DTO_TacGia item) {
        String CauTruyVan ="delete TACGIA where MaTG = "+item.getMaTG()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaTacGia(DTO_TacGia item) {
        String CauTruyVan ="update TACGIA set TENTG=N'"+item.getTenTG()+"',GIOITINH="+item.getGioiTinh()+",NOISINH=N'"+item.getNoiSinh()+"',DIACHI=N'"+item.getDiaChi()+"',SDT='"+item.getSoDienThoai()+"',CHICHU=N'"+item.getGhiChu()+"' where MATG="+item.getMaTG()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_TacGia() {
        String query = "select * from TACGIA";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
