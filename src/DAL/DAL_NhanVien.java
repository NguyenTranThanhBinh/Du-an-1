/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_DaiLy;
import DTO.DTO_NhanVien;
import GUI.Assignment;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class DAL_NhanVien {
    public static int ThemNhanVien(DTO_NhanVien item) {
        String CauTruyVan = "insert into NHANVIEN(TENNV,DIACHI,GIOITINH,NGAYSINH,NGAYVAOLAM,SDT,TENDANGNHAP,MATKHAU,MAQUYEN,GHICHU)"+
                " values(N'"+item.getTenNV()+"',N'"+item.getDiaChi()+"',"+item.getGioiTinh()+","+item.getNgaySinh()+","+item.getNgayVaoLam()+",'"+item.getSoDienThoai()+"',N'"+item.getTenDangNhap()+"',N'"+item.getMatKhau()+"',"+item.getMaQuyen()+",N'"+item.getGhiChu()+"')"; 
     int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        
        return result;
    }
    public static int XoaNhanVien(int item) {
        String CauTruyVan ="delete NHANVIEN where MaNV = "+item+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
        
    }
    public static int SuaNhanVien(DTO_NhanVien item) {
        String CauTruyVan ="UPDATE NHANVIEN set TENNV=N'"+item.getTenNV()+"',DIACHI=N'"+item.getDiaChi()+"',GIOITINH="+item.getGioiTinh()+",NGAYSINH="+item.getNgaySinh()+",NGAYVAOLAM="+item.getNgayVaoLam()+",SDT='"+item.getSoDienThoai()+"',TENDANGNHAP=N'"+item.getTenDangNhap()+"',MATKHAU=N'"+item.getMatKhau()+"',MAQUYEN="+item.getMaQuyen()+",GHICHU=N'"+item.getGhiChu()+"' where MANV="+item.getMaVN()+"";
        int result = Assignment.connection.ExcuteNonQuery(CauTruyVan);
        return result;
    }
    public static ResultSet GetALL_NhanVien() {
        String query = "select * from NHANVIEN";
        return Assignment.connection.ExcuteQuerySelect(query);
    }
    public static ResultSet Xuat_NhanVien(DTO_DaiLy key) {
        String query = "select * from NHAXUATBAN where MANHAXB="+key+" or TENNHAXB like '%"+key+"%' or DIACHI like '%"+key+"%' or GMAIL like'%"+key+"%' or SDT ="+key+";";
        System.out.println("Thang cong");
        return  Assignment.connection.ExcuteQuerySelect(query);
    }
}
