/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Frame;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Huy Nhan
 */
public class ChuyenDoi_ThongBao {
    public static void ThongBao_Loi (String NoiDung, String TieuDe){
        JOptionPane.showMessageDialog(new Frame(), NoiDung, TieuDe, JOptionPane.ERROR_MESSAGE);
    }
    public static void ThongBao_ThanhCong (String NoiDung, String TieuDe){
        JOptionPane.showMessageDialog(new Frame(), NoiDung, TieuDe, JOptionPane.OK_OPTION);
    }
    public static String TienVietNam(double chuoi) {
        String chuyenDoi = "";
        //chuyển đổi sang tiền tệ việt nam
        Locale lc_vn = new Locale("vi", "VN");
        //khai báo chuyển đổi từ double sang tiền tệ
        NumberFormat nf_cur_vn = NumberFormat.getCurrencyInstance(lc_vn);
        //format chuỗi nhập vào thành tiền tệ
        chuyenDoi = nf_cur_vn.format(chuoi);
        //trả về tiền tệ (Việt Nam)
        return chuyenDoi;
    }
    public static String TienTeVeString(String chuoi) {
        String ChuyenDoi = chuoi;
        if (chuoi != null) {
            ChuyenDoi = chuoi.substring(0, chuoi.indexOf(' '))//trả về giá trị từ đầu đên đấu cách đầu tiên trong tiền tệ
                    .replace('.', ' ')//thay thế đấu chấm trong tiền tệ thành đấu cách
                    .replaceAll("\\s+", "");//loại bỏ tất cẩ các khoảng trống trong chuỗi
        }
        //trả về giá trị sau khi chuyển đổi
        return ChuyenDoi;
    }
}
