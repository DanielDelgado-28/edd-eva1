
package eva1_10_4dimenciones;

/**
 *
 * @author Daniel Adrian Delgado GOnzalez
 */
public class EVA1_10_4Dimenciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][][][] arreglo = new int [2][2][2][2];//almacena 16 enteros
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        arreglo[i][j][k][l]= (int)(Math.random()*100);
                        
                        
                        
                    }
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        System.out.println("[" + arreglo[i][j][k][l] + "]");
                        
                        
                    }
                }
            }
        }
        System.out.println("");
    }
    
    
}
