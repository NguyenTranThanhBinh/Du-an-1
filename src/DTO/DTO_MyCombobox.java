/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Asus
 */
public class DTO_MyCombobox {
        public Object Text;//để hiển thị
    public Object Value;  // để xử lí với database
    
    public DTO_MyCombobox(Object Text, Object Value){
        this.Text = Text;
        this.Value = Value;
    }
    
    @Override
    public String toString(){
        return Text.toString();
    }
}
