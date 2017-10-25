/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_NhanVien;
import DTO.DTO_NhanVien;
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
public class BLL_NhanVien {
    public static boolean check(String Ten,String ngaysinh,String sdt,String diachi
    ,String taikhoan,String matkhau,String ngayvaolam,String ghichu) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Nhân Viên !!!", "Lỗi dữ liệu");
            return false;
        }else if (ngaysinh.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ngày Sinh !!!", "Lỗi dữ liệu");
            return false;
        }else if (sdt.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên SDT !!!", "Lỗi dữ liệu");
            return false;
        }else if (diachi.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Địa Chỉ !!!", "Lỗi dữ liệu");
            return false;
        }else if (taikhoan.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Tài Khoản !!!", "Lỗi dữ liệu");
            return false;
        }else if (matkhau.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Mật Khẩu !!!", "Lỗi dữ liệu");
            return false;
        }else if (ngayvaolam.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ngày Vào Làm !!!", "Lỗi dữ liệu");
            return false;
        }else if (ghichu.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Ghi Chú !!!", "Lỗi dữ liệu");
            return false;
        }else if (Ten.length() < 0 || Ten.length() > 50) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Lỗi Độ Dài Kí Tự Tên Nhân Viên !!!", "Lỗi dữ liệu");
            return false;
        }
        return true;
    }
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[12];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MANV");
                item[2] = rs.getString("TENNV");
                item[3] = rs.getString("GIOITINH");
                item[4] = rs.getString("NGAYSINH");
                item[5] = rs.getString("SDT");
                item[6] = rs.getString("DIACHI");
                item[7] = rs.getString("TENDANGNHAP");
                item[8] = rs.getString("MATKHAU");
                item[9] = rs.getString("NGAYVAOLAM");
                item[10] = rs.getString("MAQUYEN");
                item[11] = rs.getString("GHICHU");
                
                
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String Ten,int gt,String ngaysinh,String sdt,String diachi
    ,String taikhoan,String matkhau,String ngayvaolam,int quyen,String ghichu) {
        boolean kiemtra = check(Ten,ngaysinh,sdt,diachi,taikhoan,matkhau,ngayvaolam,ghichu);
        if (kiemtra == true) {
            DTO_NhanVien nv = new DTO_NhanVien(Ten, diachi, gt, ngaysinh, ngayvaolam, sdt, taikhoan, matkhau, quyen, ghichu);
            System.out.println("thanh cong");
            DAL_NhanVien.ThemNhanVien(nv);
        }
    }
    public static void sua(int ID,String Ten,int gt,String ngaysinh,String sdt,String diachi
    ,String taikhoan,String matkhau,String ngayvaolam,int quyen,String ghichu) {
        boolean kiemtra = check(Ten,ngaysinh,sdt,diachi,taikhoan,matkhau,ngayvaolam,ghichu);
        
                if (kiemtra == true) {
                    DTO_NhanVien nv = new DTO_NhanVien(ID,Ten, diachi, gt, ngaysinh, ngayvaolam, sdt, taikhoan, matkhau, quyen, ghichu);
                    System.out.println("thanh cong");
                    DAL_NhanVien.SuaNhanVien(nv);
                }
        }
        
    
    public static void xoa(int ID) {
            System.out.println("thanh cong");
            DAL_NhanVien.XoaNhanVien(ID);
    }
}
