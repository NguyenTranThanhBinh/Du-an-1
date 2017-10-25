/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_PhieuThanhToan;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_PhieuThanhToan {
    public static int ThemPhieuThanhToan(DTO_PhieuThanhToan item) {
        String CauTruyVan = "insert into PHIEUTHANHTOAN(MAPHIEUXUAT,MADAILY,NGAYTAO,TINHTRANG,TONGTIEN) values("+item.getMaPhieuXuat()+","+item.getMaDaiLy()+","+item.getNgayTao()+",N'"+item.getTinhTrang()+"',"+item.getTongTien()+")"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaPhieuThanhToan(DTO_PhieuThanhToan item) {
        String CauTruyVan ="delete PHIEUTHANHTOAN where MaPhieu = "+item.getMaPhieu()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaPhieuThanhToan(DTO_PhieuThanhToan item) {
        String CauTruyVan ="update PHIEUTHANHTOAN set MAPHIEUXUAT="+item.getMaPhieuXuat()+",MADAILY="+item.getMaDaiLy()+",NGAYTAO="+item.getNgayTao()+",TINHTRANG=N'"+item.getTinhTrang()+"',TONGTIEN="+item.getTongTien()+" where MAPHIEU="+item.getMaPhieu()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_PhieuThanhToan() {
        String query = "select * from PHIEUTHANHTOAN";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
}
