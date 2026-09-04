/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_stackoverlow;

/**
 *
 * @author LENOVO
 */
public class EVA1_3_STACKOVERLOW {

    public static void main(String[] args) {
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        int i = 5;
        double d = 5.5;
        A();
    }
    
}
