import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
/*  Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso
*/
    public static void borrarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    } 

    public static void cargarBaraja(List<Integer> baraja) {
        for(int i = 1 ; i <= 13 ; i++){
            baraja.add(i);
        }    
    }

    public static void mostrarValoresBaraja(List<Integer> valores,int orden) {
        
        switch (orden) {
            case 0:
                System.out.println(valores);    
                break;
            case 1:
                Collections.sort(valores,Collections.reverseOrder());
                System.out.println(valores);                    
                break;
            case 2:
                Collections.shuffle(valores);
                System.out.println(valores);    
                break;
            default:
                break;
        } 
    }

    public static void main(String[] args) {
        List<Integer> valoresBaraja = new ArrayList<>();
        borrarConsola();
        System.out.println("Valores de baraja francesa de 1..13");
        cargarBaraja(valoresBaraja);

        //Utiliza 0 para orden ascendente, 1 descendente y 2 mesclado aleatorio.

        System.out.print("Valores baraja francesa orden ascendente:  ");
        mostrarValoresBaraja(valoresBaraja,0);
        System.out.print("Valores baraja francesa orden descendente: ");
        mostrarValoresBaraja(valoresBaraja,1);
        System.out.print("Valores baraja francesa mezclado:          ");
        mostrarValoresBaraja(valoresBaraja,2);

    }    
}
