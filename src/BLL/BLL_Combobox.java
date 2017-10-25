/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_MyCombobox;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Huy Nhan
 */
public class BLL_Combobox {
    public static void LayDuLieuCombobox(ResultSet rs, JComboBox TenCBB, String TenCotHienThi, String TenCotMa) {
        DefaultComboBoxModel Combobox = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                DTO.DTO_MyCombobox item = new DTO_MyCombobox(rs.getString(TenCotHienThi), rs.getString(TenCotMa));
                Combobox.addElement(item);
                TenCBB.setModel(Combobox);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static void setSelectedCombobox(JComboBox tenCBB, String tenLoai){
        for(int i = 0; i < tenCBB.getItemCount();i++){
            
            // Lấy item obj ở trên về Mycombobox
            Object obj = tenCBB.getItemAt(i);
            
            // Ép kiểu của obj ở trên về Mycombobox
            DTO_MyCombobox cbb = (DTO_MyCombobox)obj;
            
            
            // Kiểm tra tên của cái cbb có bằng vs cái set lại hay k?
            if(cbb.Value.equals(tenLoai)){
                tenCBB.setSelectedIndex(i);
            }
            
        }
    }
    public static String getSelectedItemID(JComboBox cbb) {
        String result;
        Object[] obj = cbb.getSelectedObjects();
        DTO_MyCombobox item = (DTO_MyCombobox) obj[0];
        result = item.Value.toString();
        return result;
    }
}
