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
public class MyCombobox {
    public Object Text;//để hiển thị
    public Object Value;  // để xử lí với database
    
    public MyCombobox(Object Text, Object Value){
        this.Text = Text;
        this.Value = Value;
    }

    MyCombobox(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return Text.toString();
    }
}
