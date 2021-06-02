package Ejercicio6;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
/*  Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
*/
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void cargarEmpleados(Set<Empleado> empleados) {

        int continuar=1;
        int dni;
        String apellido;
        String nombre;
        int horasTrabajadas;
        int valorPorHora;

        while (continuar==1){
            System.out.print(" Ingrese DNI:              ");
            dni = scan.nextInt();
            scan.nextLine();
            System.out.print(" Ingrese Nombre:           ");
            nombre = scan.nextLine();
            System.out.print(" Ingrese Apellido:         ");
            apellido = scan.nextLine();
            System.out.print(" Ingrese Horas Trabajadas: ");
            horasTrabajadas = scan.nextInt();
            System.out.print(" Ingrese Valor por Hora:   ");
            valorPorHora = scan.nextInt();

            //Creo el objeto
            Empleado emp = new Empleado(dni,nombre,apellido,horasTrabajadas,valorPorHora);
              
            //Lo agrego al hashSet
            empleados.add(emp);
            
            System.out.print(" Ingresar otro empleado? [1:SI, 0:NO]: ");
            continuar = scan.nextInt();
        }
        
    }

    public static void mostrarEmpleados(Set<Empleado> empleados) {
        for (Empleado empleado: empleados){
            System.out.println(" " + empleado);
        }
    }   

    public static void calcularSueldo(Set<Empleado> empleados) {
        int clave;
        int valor;
        for (Empleado empleado: empleados){
            clave=empleado.getdni();
            valor=empleado.calcularSueldo();
            //System.out.println(" Clave: " + clave + " Valor: " + valor);
            sueldos.put(clave, valor);
        }
    } 

    public static void mostrarSueldo(Map<Integer, Integer> mapSueldos) {
        for (Map.Entry<Integer,Integer> registro: sueldos.entrySet()){
            System.out.println(" DNI: " + registro.getKey() + " Sueldo: " + registro.getValue());
        }
    }            

    static Scanner scan = new Scanner(System.in);
    static Map<Integer, Integer> sueldos = new HashMap<>();

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        
        borrarConsola();
        //Scanner scan = new Scanner(System.in);
        System.out.println("Cargar Empleados...");
       
        Scanner scan = new Scanner(System.in);
        cargarEmpleados(empleados);
        scan.close();

        System.out.println("Empleados Cargados...");
        mostrarEmpleados(empleados);

        //Calcular y sueldo
        calcularSueldo(empleados);

        System.out.println("Mostrar Sueldos...");    
        mostrarSueldo(sueldos);
    }
}
