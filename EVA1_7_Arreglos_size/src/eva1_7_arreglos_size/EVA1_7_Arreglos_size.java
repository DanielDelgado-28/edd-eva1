
package eva1_7_arreglos_size;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA1_7_Arreglos_size {


    public static void main(String[] args) {
        int[] original = new int[10];
        System.out.println(original);
        for (int i = 0; i < original.length; i++){
            original[i]= (int)(Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++){
            System.out.println("["+ original[i] + "]");
        }
          System.out.println("");
        int [] respaldo = original;
        original = new int[5];
        for (int i = 0; i < original.length; i++) {
        original[i] = respaldo[i];
        }

        for (int i = 0; i < original.length; i++){
        System.out.println("["+ original[i] + "]");
        }
        System.out.println("");
        
      
        
        //cambiar el tamaño
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++){
        System.out.println("["+original[i]+ "]");
        }
    }
    
}
