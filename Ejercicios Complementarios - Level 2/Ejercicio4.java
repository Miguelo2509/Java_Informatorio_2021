import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
/*  Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
*/
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void cargarAlumnos(List<String> alumnos,int cantidad) {
        String alumno;
        Scanner scan = new Scanner(System.in);

        for(int i = 1 ; i <= cantidad ; i++){
            System.out.print(" Ingrese alumno " + i + ": ");
            alumno=scan.nextLine();
            alumnos.add(alumno);
        }
        scan.close();
    }

    public static void mostrarAlumnos(List<String> alumnos) {
        int i = 1;
        for (String alumno: alumnos){
            System.out.println(" Alumno " + i + " - " + alumno);
            i+=1;
        } 
    } 
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();
        List<String> curso1 = new ArrayList<>();
        List<String> curso2 = new ArrayList<>();
        List<String> curso3 = new ArrayList<>();
        borrarConsola();
        System.out.println("Cargar los 12 Alumnos...");
        cargarAlumnos(alumnos,12);

        System.out.println("Mostrar Alumnos...");
        mostrarAlumnos(alumnos);

        System.out.println("Separar Alumnos en tres cursos...");
        //separarEnCursos(alumnos);

        System.out.println("Alumnos curso 1: ");
        curso1 = alumnos.subList(0,4);
        mostrarAlumnos(curso1);
        
        System.out.println("Alumnos curso 2:");
        curso2 = alumnos.subList(4, 8);
        mostrarAlumnos(curso2);
        
        System.out.println("Alumnos curso 3:");
        curso3 = alumnos.subList(8, 12);
        mostrarAlumnos(curso3);
   }    
}
