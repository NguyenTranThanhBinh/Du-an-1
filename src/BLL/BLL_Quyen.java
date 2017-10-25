/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_Quyen;
import DAL.DAL_Quyen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Huy Nhan
 */
public class BLL_Quyen {
    public static boolean check(String Ten,String MoTa) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Quyền !!!", "Lỗi Quyền");
            return false;
        }
        return true;
    }
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[4];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MAQUYEN");
                item[2] = rs.getString("TENQUYEN");
                item[3] = rs.getString("MOTA");
                
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String Ten,String MoTa) {
        boolean kiemtra = check(Ten, MoTa);
        if (kiemtra == true) {
            DTO_Quyen Q = new DTO_Quyen(Ten, MoTa);
            System.out.println("thanh cong");
            DAL_Quyen.ThemQuyen(Q);
        }
    }
    public static void sua(String ID,String Ten,String MoTa) {
        boolean kiemtra = check(Ten, MoTa);
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã Quyền !!!", "Lỗi Dữ Liệu");
        }else{
            try {
                Integer.parseInt(ID);
                if (kiemtra == true) {
                    DTO_Quyen Q = new DTO_Quyen(Integer.parseInt(ID), Ten, MoTa);
                    System.out.println("thanh cong");
                    DAL_Quyen.SuaQuyen(Q);
                }
            } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
        
    }
    public static void xoa(String ID) {
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã Quyền !!!", "Lỗi Dữ Liệu");
        }else{
            try {
            DAL_Quyen.XoaQuyen(Integer.parseInt(ID));
            System.out.println("thanh cong");
        } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
    }
}
