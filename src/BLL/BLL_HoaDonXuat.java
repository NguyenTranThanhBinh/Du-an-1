/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huy Nhan
 */
public class BLL_HoaDonXuat {
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[10];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = rs.getString("MASACH");
                item[1] = rs.getString("TENSACH");
                item[2] = rs.getString("GIAXUAT");
                item[3] = rs.getString("SOLUONG");
                item[4] = rs.getString("TENTG");
                item[5] = rs.getString("TENTL");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String NgayTaoHD() {
        Date date = new Date();
        //DateFormat datefm = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dinhDang = sdf.format(date);
        //String xuatngay = datefm.format(date);
        return dinhDang ;
    }
    public static String SoHoaDon() {
        Date date = new Date();
        String datecode = new SimpleDateFormat("ddMMyyhhmmss").format(date);
        String sohoadon = "HD" + datecode;
        return sohoadon;
    }
    public static void ThemVaoCTHD(JTable tableCTHD,String MaS,int SoLuong, String GhiChu){
        //truy vấn dữ liệu sang databa
        ResultSet rs = DAL.DAL_Sach.timkiemsach(MaS);
        Object[] item = new Object[10];//Tạo mảng
        DefaultTableModel table = (DefaultTableModel)tableCTHD.getModel();
        double ThanhTien;
        if (CheckS(MaS, tableCTHD) == 0) {
            
        } else {
        }
        try {
            while(rs.next()){
                ThanhTien = SoLuong* Double.parseDouble(rs.getString("GIAXUAT"));
                item[0] = tableCTHD.getRowCount() +1;
                item[1] = rs.getString("TENSACH");
                item[2] = rs.getString("DonViTinh");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getInt("GIAXUAT"));
                item[4] = SoLuong;
                item[5] = ChuyenDoi_ThongBao.TienVietNam(ThanhTien);
                item[6] = GhiChu;
                //trả dữ liệu về table
                table.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn: " + ex.getMessage());
        }
    }
    public static String TinhTongTien(JTable tableCTHD,int cotthanhtien) {
        double tongtien = 0;
        for (int i = 0; i < tableCTHD.getRowCount(); i++) {
            tongtien += Double.parseDouble(ChuyenDoi_ThongBao.
                    TienTeVeString(tableCTHD.
                            getValueAt(i, cotthanhtien).toString()));
        }
        String rt = ChuyenDoi_ThongBao.TienVietNam(tongtien);
        return rt;
    }   
    public static String TienDu(String tien, String Tongtien) {
        double tiendu = 0;
        try {
            double tiennhan = Double.parseDouble(tien);
            tiendu = tiennhan - Double.parseDouble(ChuyenDoi_ThongBao.TienTeVeString(Tongtien));
        } catch (NumberFormatException e) {
            System.out.println(e);
            ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Tiền Phải Là Số !!!");
        }
        String trave = ChuyenDoi_ThongBao.TienVietNam(tiendu);
        return trave;
    }
    public static int CheckS(String TenS_S,JTable table_CTHD) {
        DefaultTableModel table = (DefaultTableModel)table_CTHD.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            String TenSp = table.getValueAt(i, 1).toString();
            if (TenS_S.equals(TenSp)) {
                return 0;
            }
        }
        return -1;
    }
    public static DTO.DTO_DaiLy layDLKhachHangTheoCBB(String ID) {
        DTO.DTO_DaiLy kh = DAL.DAL_DaiLy.layDLTheoMa(ID);
        return kh;
    }
}
