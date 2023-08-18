/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapplication;

/**
 *
 * @author syrex
 */
public class Control {
    
    public static ChatBox []ar=new ChatBox[0];
    
    public void extend(){
       ChatBox []temp=new ChatBox[ar.length+1];
        
        for (int i = 0; i < ar.length; i++) {
            temp[i]=ar[i];
        }        
        ar=temp;
    }
    
    public void update(String text,String user){
        for (int i = 0; i < ar.length; i++) {
           ar[i].updateText(text, user);
        }
    }
        
}
