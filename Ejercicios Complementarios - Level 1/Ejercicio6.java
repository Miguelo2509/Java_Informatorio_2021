
import java.util.Scanner;
public class Ejercicio6 {
    /* Se desea una aplicación que solicite 2 números enteros y realice la operación
    de potencia (sin uso de librerías).
    Input (Entrada):
    3
    3
    Output (Salida):
    3 elevado a 3 = 27
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  
    public static int potencia(int numero1, int numero2) {
        int result = 1;
        for(int i = 1; i <= numero2; i++){
            result *= numero1;
        }
        return result;
    }

    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese base:      ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese exponente: ");
        int num2 = scan.nextInt();

        int resultado = potencia(num1,num2);

        System.out.println(num1 + " elevado a " + num2 + " = "  + resultado);
        scan.close();
    }
}
