
package eva1_practica2_stack;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA1_Practica2_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("TerminaA");
    }
    public static void B(){
        System.out.println("Inicia B");
        int i = 5;
        double d = 5.5;
        System.out.println("Termina B");
    }
    
}
