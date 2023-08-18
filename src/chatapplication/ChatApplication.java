/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapplication;

/**
 *
 * @author syrex
 */
public class ChatApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Control c1=new Control();
        MainWindow m1=new MainWindow(c1);
        m1.setVisible(true);
        
    }
    
}
