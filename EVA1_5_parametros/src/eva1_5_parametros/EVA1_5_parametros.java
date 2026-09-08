/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_parametros;

/**
 *
 * @author LENOVO
 */
public class EVA1_5_parametros {


    public static void main(String[] args) {
        //paso por valor
        int i = 5;
        System.out.println("valor de i = "+i);
        incrementar (i);
        System.out.println("Valor de i (despuesd e llamar a la funcion implementar = "+ i);
        //ahora por referencia
        Prueba prueba = new Prueba();
        System.out.println("valor de prueba y= "+prueba.y);
        incrementarobj(prueba);
        System.out.println("valor de prueba.y desoes de pasar por incrementarobg"+prueba.y);
        
    }
    public static void incrementar(int valor){//paso por valor, se crea una copia de lo que mandas(i) modifica la copia, al terminar su funcion la copia se elimina
        valor++;
    }
    public static void incrementarobj(Prueba objeto){
        objeto.y++;
    }
    
}

class Prueba{
    int y = 5;
    
}
