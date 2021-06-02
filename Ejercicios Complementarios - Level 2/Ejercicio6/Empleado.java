package Ejercicio6;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int horasTrabajadas;
    private int valorPorHora;
    
    Empleado(int dni, String nombre, String apellido, int horasTrabajadas, int valorPorHora) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    
    public int calcularSueldo() {
        return (this.horasTrabajadas * this.valorPorHora);
    }  

    public int getdni() {
        return this.dni;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.dni) + 
            " - " + this.nombre +
            " - " + this.apellido +
            " - " + this.horasTrabajadas +
            " - " + this.valorPorHora;
    }  
}
