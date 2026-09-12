
package eva1_8_arreglosobjetos;

/**
 *
 * @author LENOVO
 */
public class EVA1_8_ArreglosObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = null; 
        //System.out.println("Arreglo = " + arreglo);
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = " + arreglo);
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        
        System.out.println("arreglo[0].i = " + arreglo[0].i);
        System.out.println("arreglo[1].i = " + arreglo[1].i); 
    }
    
}
class Ejemplo{
    int i = 5;
}