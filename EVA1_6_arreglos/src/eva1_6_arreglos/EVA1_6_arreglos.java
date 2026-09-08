
package eva1_6_arreglos;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA1_6_arreglos {


    public static void main(String[] args) {
        int [] datos = new int[100000];
        System.out.println(datos);
        for (int i =0; i< datos.length; i++){
            datos[i]= (int)(Math.random()*100);
        }
    }
    
}
