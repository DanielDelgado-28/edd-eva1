/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva._9_matrices;


public class EVA_9_Matrices {


    public static void main(String[] args) {
        int [] [] matriz = new int [5][3];
        System.out.println("matriz"+ matriz);
        System.out.println("matriz.lenght = "+ matriz.length);
        System.out.println("matriz[0]"+ matriz);
        System.out.println("matriz [0] = "+ matriz[0].length);
        //---------------------
        for (int i = 0; i < matriz.length; i++) {//primer dimension ---> filas
            for (int j = 0; j < matriz[i].length; j++) {//segunda dimension -----> columnas 
                matriz[i][j]=(int)(Math.random()* 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {//primer dimension ---> filas
            for (int j = 0; j < matriz[i].length; j++) {//segunda dimension -----> columnas 
                System.out.println("["+ matriz[i][j]+ "]");
            }
                    System.out.println("");
        }
    }
    
}
