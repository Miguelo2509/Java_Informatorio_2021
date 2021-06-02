import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
/*  Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
Input (Entrada):
fizzBuzzFuncion(1,6) // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, 5, “FizzBuzz”, 7]
*/
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void fizzBuzz(List<String> lista,int num1, int num2) {
        //System.out.println(num1 + " " + num2);
        
        for(int i = num1; i < num2; i++ ){
             if (i%2 == 0 && i%3 != 0){
                 lista.add("\""+"Fizz"+"\"");
             } else if(i%2 != 0 && i%3 == 0){
                 lista.add("\""+"Buzz"+"\"");    
             } else if(i%2 == 0 && i%3 == 0){
                 lista.add("\"FizzBuzz\"");    
             } else {
                 lista.add("\"" + String.valueOf(i) + "\"");    
             }
         }            
     }   
 
     public static void mostrarArreglo(List<String> lista) {
         System.out.println(lista);
      }   
 
    public static void main(String[] args) {
        List<String> fizzBuzz = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        borrarConsola();
        System.out.println("Ingrese dos numeros enteros, el primero menor que el segundo.");
        System.out.print("Ingrese primer valor:  ");
        num1 = scan.nextInt();
        System.out.print("Ingrese segundo valor: ");
        num2 = scan.nextInt();
        while(num1>=num2){
            borrarConsola();
            System.out.println("El primero debe ser menor que el segundo:");
            System.out.println("Ingrese dos numeros enteros, el primero menor que el segundo:");
            System.out.print("Ingrese primer valor:  ");
            num1 = scan.nextInt();
            System.out.print("Ingrese segundo valor: ");
            num2 = scan.nextInt();
        }

        fizzBuzz(fizzBuzz,num1,num2);
        scan.close();

        mostrarArreglo(fizzBuzz);
    }
}
