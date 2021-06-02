import java.util.Scanner;
public class Ejercicio4 {
    /* Realizar un programa que calcule el factorial de un número:
    n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
    Sin hacer uso de librerías.
    Input (Entrada):
    5
    Output (Salida):
    El factorial de 5 es: 120
    */
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  

    public static int factorial(int numero) {
        if (numero > 1) {
            return numero * factorial(numero - 1);
        } else {
            return 1;
        }        
    }
    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int num = scan.nextInt();
        System.out.println("El factorial de " + num + " es: "  + factorial(num));
        scan.close();
    }
}
