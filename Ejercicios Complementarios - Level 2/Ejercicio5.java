import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
/*  Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
*/
    static Scanner scan = new Scanner(System.in);

    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void cargarLista(List<Integer> lista,int cantidad) {
        for(int i = 0 ; i < cantidad ; i++){
            System.out.print(" Ingrese valor " + (i+1) + ": ");
            if(scan.hasNext()){
                lista.add(scan.nextInt());
            }
        }
    }

    public static void mostrarLista(List<Integer> lista) {
        System.out.println(lista);
    }   

    public static int calcularTotales(List<Integer> totales,List<Integer> horas,List<Integer> valor) {
        int total=0;
        for (int i=0; i<horas.size(); i++){
            totales.add(horas.get(i) * valor.get(i));
            total +=totales.get(i);
        } 
        return total;
    }   

    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();
        borrarConsola();
        System.out.println("Cargar Horas");
        cargarLista(horasTrabajadas,5);

        System.out.println("Cargar Valor por Hora");
        cargarLista(valorPorHora,5);
        scan.close();

        System.out.print("Horas cargadas por día:    ");
        mostrarLista(horasTrabajadas);
        System.out.print("Valores cargados por Hora: ");
        mostrarLista(valorPorHora);

        System.out.print("Totales por día:           ");
        int total = calcularTotales(totales,horasTrabajadas,valorPorHora);
        mostrarLista(totales);
        System.out.println("Total Final:            $ " + total);
   }    
}
