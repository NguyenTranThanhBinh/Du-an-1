/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HuyNhan
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static frmDangNhap frmdn = new frmDangNhap();
    public static Frm_dangky frmdk = new Frm_dangky();
    public static Frm_DoiMK frmdoimk = new Frm_DoiMK();
    public static Frm_Menu frmmain = new Frm_Menu();
    public static DBConnection connection = new DBConnection();
    public static void main(String[] args) {
        frmdn.show();
    }
    
}
