
import java.util.Scanner;
public class Ejercicio8 {
    /* Crear una aplicación que solicite de entrada los datos de una persona en este
    orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
    Input (Entrada):
    Homero Simpson
    48
    Calle Falsa 1234
    Springfield
    Output (Salida):
    Springfield - Calle Falsa 1234 - 48 - Homero Simpson
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
        System.out.print("Ingrese Nombre y Apellido: ");
        String apeNom = scan.nextLine();
        System.out.print("Ingrese Edad:              ");
        int edad = scan.nextInt();
        scan.nextLine();    //Para limpiar el buffer
        System.out.print("Ingrese Direccion:         ");
        String direccion = scan.nextLine();
        System.out.print("Ingrese Ciudad:            ");
        String ciudad = scan.nextLine();

        System.out.println("Resultado");
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + apeNom);
        scan.close();
    }
}
