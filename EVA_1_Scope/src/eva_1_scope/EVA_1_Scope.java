
package eva_1_scope;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA_1_Scope {
    //Las variables temporales existen hasta que termine su bloque de codigo

    public static void main(String[] args) {
        int x= 100; // Esiste dentro del main
        for (int i = 0; i< 10; i++){ //Existe dentro de el for
            System.out.println("i + "+ 1);
        }
        System.out.println("Valor final de la i ="+ i); // ya no existe
        System.out.println("Valor final de la x = "+ x); // aun existe 
    }
    
    public static void OtraFuncion(){
        System.out.println("Valor de x + "+ x);// no existe
    }
    
}
