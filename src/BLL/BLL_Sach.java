/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

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
public class BLL_Sach {
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[20];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MASACH");
                item[2] = rs.getString("TENSACH");
                item[3] = rs.getString("MATL");
                item[4] = rs.getString("MATG");
                item[5] = rs.getString("SOLUONG");
                item[6] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GIANHAP"));
                item[7] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GIAXUAT"));
                item[8] = rs.getString("MOTA");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
