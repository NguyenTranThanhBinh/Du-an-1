/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static BLL.BLL_NhanVien.check;
import DAL.DAL_DaiLy;
import DTO.DTO_DaiLy;
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
public class BLL_DaiLy {
    
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[5];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MADAILY");
                item[2] = rs.getString("TENDAILY");
                item[3] = rs.getString("DIACHI");
                item[4] = rs.getString("SDT");
                
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean check(String Ten,String Diachi,String sdt) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Nhân Viên !!!", "Lỗi dữ liệu");
            return false;
        }else if (Diachi.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ngày Sinh !!!", "Lỗi dữ liệu");
            return false;
        }else if (sdt.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên SDT !!!", "Lỗi dữ liệu");
            return false;
        }
        return true;
    }
    public static void them(String Ten,String diachi,String sdt) {
        boolean kiemtra = check(Ten,diachi,sdt);
        if (kiemtra == true) {
            DTO_DaiLy nv = new DTO_DaiLy(Ten, diachi, sdt);
            System.out.println("thanh cong");
            DAL_DaiLy.ThemDaiLy(nv);
        }
    }
    public static void sua(int ID,String Ten,String diachi,String sdt) {
        boolean kiemtra = check(Ten,diachi,sdt);
        
                if (kiemtra == true) {
                    DTO_DaiLy nv = new DTO_DaiLy(ID,Ten, diachi, sdt);
                    System.out.println("thanh cong");
                    DAL_DaiLy.SuaDaiLy(nv);
                }
        }
        
    
    public static void xoa(int ID) {
            System.out.println("thanh cong");
            DAL_DaiLy.XoaDaiLy(ID);
    }
}
