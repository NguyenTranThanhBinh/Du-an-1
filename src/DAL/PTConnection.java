/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class PTConnection {
    //Tạo chuỗi kết nối
    String connectionString = "jdbc:sqlserver://DESKTOP-VKO6F9A;"
            + "databaseName=PHATHANHPHANPHOISACH; user=sa; password=123456;";
    //Tạo biến kết nối
    Connection conn;
    
    public PTConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            if(conn != null){
                System.out.println("Kết nối CSDL thành công");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi JDBC: " + ex.getMessage() );
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối CSDL: " + ex.getMessage());
        }                     
    }

    public ResultSet ExcuteQuerySelect(String query){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query); // Thực thi truy vấn SELECT
            return rs;  //Trả về ResultSet
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn. " + ex.getMessage());
        }
        return null; //Trả về null nếu lỗi
    }
    //Hàm thực thi câu INSERT, DELETE, UDPATE
    public int ExcuteNonQuery(String query){
        try {
            Statement stmt = conn.createStatement();
            int kq = stmt.executeUpdate(query); //Thực thi câu truy vấn và trả về kết quả
            return kq; 
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn: " + ex.getMessage());
        }
        return -1;
    }
    
}
