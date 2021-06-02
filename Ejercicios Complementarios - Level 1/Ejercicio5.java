import java.util.Scanner;
public class Ejercicio5 {
    /* Se desea una aplicación que solicite 2 números enteros y realice la operación
    de multiplicación por sumas sucesivas (sin uso de librerías).
    Input (Entrada):
    2
    3
    Output (Salida):
    2 x 3 = 6
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  

    public static int multiplicar(int numero1, int numero2) {
        int result = 0;
        for(int i = 1; i <= numero2; i++){
            result += numero1;
        }
        return result;
    }

    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número entero:   ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int num2 = scan.nextInt();

        System.out.print("Resultado: ");
        System.out.println(num1 + " x " + num2 + " = "  + multiplicar(num1,num2));
        scan.close();
    }
}
