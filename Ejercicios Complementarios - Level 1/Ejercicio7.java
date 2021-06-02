
import java.util.Scanner;
public class Ejercicio7 {
    /* Realizar un Programa que dado un String de entrada en minúsculas lo
    convierta por completo a mayúsculas. Sin uso de métodos o librerías que
    realicen toUppercase().
    Input (Entrada):
    informatorio
    Output (Salida):
    INFORMATORIO
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  
    public static String aMayusculas(String cadena) {
        String result="";
        for (int i=0; i < cadena.length(); i++){

            //Falta considerar caracteres especiales y letras con acentos

            //a=65 ..A=97
            //z=122
            //if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122) {

            if ((char)cadena.charAt(i) >= 'a' && (char)cadena.charAt(i) <= 'z') {
                //Si está en minusculas le sumo la diferencia para pasar a mayusculas
                result = result + (char) (cadena.charAt(i) - 'a' + 'A'); 
            }
            else{
                //Si esta en mayusculas no hago nada, paso como está
                result = result + (char) (cadena.charAt(i)); 
            }
        }
        return result;
    } 

    public static void main(String[] args) {
        //Borrar consola
        borrarConsola();  
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scan.nextLine();
                
        System.out.println("Resultado:                        " + aMayusculas(cadena));
        scan.close();
    }
}
