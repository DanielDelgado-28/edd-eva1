
package eva1_12_primos;

import java.util.Scanner;
/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA1_12_Primos {

    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Digita un numero");
        int n = guardar.nextInt();

        System.out.println(n + (esPrimoLento(n) ? " es primo" : " no es primo"));
        System.out.println(n + (esPrimoEficiente(n) ? " es numero primo" : " no es numero primo"));
    }

    // Forma lenta: revisa todos los divisores hasta n-1
    public static boolean esPrimoLento(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Forma eficiente: solo hace falta revisar hasta la raiz cuadrada de n
    public static boolean esPrimoEficiente(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}