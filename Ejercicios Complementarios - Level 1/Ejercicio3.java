import java.util.Scanner;
public class Ejercicio3 {
    /*Confeccionar un programa que dado un número entero como dato de
    entrada imprima la secuencia de números (incrementos de 1) de la siguiente
    forma:
    Input (Entrada):
    5
    Output (Salida):
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 
    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Numero ingresado: " + num);
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
