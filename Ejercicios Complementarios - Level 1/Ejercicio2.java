import java.util.Scanner;

public class Ejercicio2 {
    /*
    Realizar un programa que solicite por consola 2 números enteros. Para luego
    imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
    de la división) de ambos números.
    Input (Entrada):
    5
    4
    Output (Salida):
    5 + 4 = 9
    5 - 4 = 1
    5 * 4 = 20
    5 / 4 = 1
    5 % 4 = 1
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  
    
    public static int suma(int num1, int num2){
        return num1+num2;
    }  

    public static int resta(int num1, int num2){
        return num1-num2;
    }  

    public static int multiplicacion(int num1, int num2){
        return num1*num2;
    }  

    public static float division(int num1, int num2){
        return (float)num1/(float)num2;
    }  

    public static float restoDivision(int num1, int num2){
        return (float)num1%(float)num2;
    }  

    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();        
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        int continuar=1;
        while (continuar==1) {
            System.out.print("Ingrese un número entero:      ");
            num1 = scan.nextInt();
            System.out.print("Ingrese un otro número entero: ");
            num2 = scan.nextInt();
            System.out.println("");
            System.out.println("Operaciones:");
            System.out.println(num1 + " + " + num2 + " = " + suma(num1,num2));
            System.out.println(num1 + " - " + num2 + " = " + resta(num1,num2));
            System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1,num2));
            System.out.println(num1 + " / " + num2 + " = " + division(num1,num2));
            System.out.println(num1 + " % " + num2 + " = " + restoDivision(num1,num2));
            do{
                System.out.print("Desea realizar las operaciones con otros números? [1:Si,0:No]: ");
                continuar = scan.nextInt();        
            } while(continuar !=0 && continuar !=1);
        }    
        scan.close();
    }
}
