
import java.util.Scanner;
public class Ejercicio9 {
    /* Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
    aparece una letra dada.
    Input (Entrada):
    Hola Informatorio Java 2020.
    a
    Output (Salida):
    4
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  

    public static int contarCaracter(String cadena, String caracter) {
        int contar=0;
        for (int i=0; i < cadena.length(); i++){
            if ((char)cadena.charAt(i) == (char)caracter.charAt(0)){
                contar +=1;
            }
        }
        return contar;
    } 

    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scan.nextLine();
        System.out.print("Ingrese un caracter:              ");
        String caracter = scan.nextLine();
                
        System.out.println("Cantidad de veces que aparece el caracater en la cadena = " + contarCaracter(cadena,caracter) );
        scan.close();
    }
}
