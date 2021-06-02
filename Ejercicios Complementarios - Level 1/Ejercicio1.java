import java.util.Scanner;
public class Ejercicio1 {

    /*Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
    mensaje “HOLA {USUARIO}!!!”
    Input (Entrada):    Obi Wan Kenobi
    Output (Salida):    HOLA Obi Wan Kenobi
    */
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }

    public static void saludar(String nombre) {
        System.out.println("HOLA " + nombre);
    }
    
    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();        

        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = scan.nextLine();
        
        saludar(nombre);
        scan.close();
    }
}

