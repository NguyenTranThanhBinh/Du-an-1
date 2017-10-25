/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_NhaXuatBan;
import DTO.DTO_NhaXuatBan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huy Nhan
 */
public class BLL_NhaXuatBan {
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[12];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MANHAXB");
                item[2] = rs.getString("TENNHAXB");
                item[3] = rs.getString("DIACHI");
                item[4] = rs.getString("SDT");
                item[5] = rs.getString("GMAIL");
                item[6] = rs.getString("CHICHU");
                
                
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean check(String Ten,String diachi,String sdt,String gmail,String ghichu) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Nhân Viên !!!", "Lỗi dữ liệu");
            return false;
        }else if (diachi.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ngày Sinh !!!", "Lỗi dữ liệu");
            return false;
        }else if (sdt.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên SDT !!!", "Lỗi dữ liệu");
            return false;
        }else if (gmail.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ngày Sinh !!!", "Lỗi dữ liệu");
            return false;
        }
        return true;
    }
    public static void them(String Ten,String diachi,String sdt,String gmail,String ghichu) {
        boolean kiemtra = check(Ten,diachi,sdt,gmail,ghichu);
        if (kiemtra == true) {
            DTO_NhaXuatBan nv = new DTO_NhaXuatBan(Ten,  diachi,gmail,sdt,ghichu);
            System.out.println("thanh cong");
            DAL_NhaXuatBan.ThemNhaXuatBan(nv);
        }
    }
    public static void sua(int ID,String Ten,String diachi,String sdt,String gmail,String ghichu) {
        boolean kiemtra = check(Ten,diachi,sdt,gmail,ghichu);
        
                if (kiemtra == true) {
                    DTO_NhaXuatBan nv = new DTO_NhaXuatBan(ID,Ten, diachi,gmail, sdt,ghichu);
                    System.out.println("thanh cong");
                    DAL_NhaXuatBan.SuaNhaXuatBan(nv);
                }
        }
        
    
    public static void xoa(int ID) {
            System.out.println("thanh cong");
            DAL_NhaXuatBan.XoaNhaXuatBan(ID);
    }
}
