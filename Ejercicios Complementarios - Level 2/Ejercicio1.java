import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    /*  Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
    imprimir por pantalla el ranking
    Input (Entrada):
    Bariloche
    Córdoba
    Resistencia
    Output (Salida):
    #1 - Bariloche
    #2 - Córdoba
    #3 - Resistencia
    */

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }  

    public static void cargarLista(List<String> nombres, String ciudad) {
        nombres.add(ciudad);
    }

    public static void mostrarLista(List<String> ciudades) {
        int i=1;
        for (String nombre: ciudades){
            System.out.println("#" + i + " - " + nombre);
            i+=1;
        }        
    }

    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String ciudad;
        borrarConsola();
        System.out.println("Ingrese ciudades favoritas de Argentina. 0 para terminar");
        System.out.print("Ciudad: ");
        ciudad = scan.nextLine();
        
        while (!ciudad.equals("0")) {
            cargarLista(ciudades,ciudad);
            System.out.print("Ciudad: ");
            ciudad = scan.nextLine();
        }
        scan.close();
        System.out.println("Ranking de ciudades favoritas...");
        mostrarLista(ciudades);
    }    
}
