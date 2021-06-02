/*  Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void cargarLista(List<Integer> enteros, int numero) {
        enteros.add(numero);
    }

    public static void agregarAlPrincipio(List<Integer> enteros, int numero) {
        enteros.add(0,numero);
    }
   
    public static void agregarAlFinal(List<Integer> enteros, int numero) {
        enteros.add(numero);
    }

    public static void mostrarLista(List<Integer> enteros) {
        int i=1;
        for (int numero: enteros){
            System.out.println("#" + i + " - " + numero);
            i+=1;
        }        
    }

    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numero;
        int elementos = 5;
        borrarConsola();
        System.out.println("Ingresar 5 numeros enteros");
        
        for(int i = 0 ; i < elementos ; i++){
            System.out.print("Ingrese numero entero " + i + ": ");
            numero=scan.nextInt();
            cargarLista(enteros,numero);
        }

        System.out.println("Tamaño antes de agregar entero al principio: " + enteros.size());

        //Agregar al principio
        System.out.print("Ingrese numero entero para agregar al principio: ");
        numero=scan.nextInt();
        agregarAlPrincipio(enteros,numero);

        System.out.println("Tamaño despues de agregar entero al principio: " + enteros.size());
        System.out.println("Tamaño antes de agregar entero al final: " + enteros.size());

        //Agregar al final
        System.out.print("Ingrese numero entero para agregar al final: ");
        numero=scan.nextInt();
        agregarAlFinal(enteros,numero);
        System.out.println("Tamaño despues de agregar entero al final: " + enteros.size());
        
        scan.close();
        System.out.println("Lista final de enteros...");
        mostrarLista(enteros);
    }    
}
