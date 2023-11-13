import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class CalculaMedia {

    private static final int UMBRAL = 1000;



    public static void main(String[] args) {

        int[] l_ArrayNumeros = new int[UMBRAL]; // Tamaño del array, ajusta según sea necesario

        for (int l_Contador = 0; l_Contador < l_ArrayNumeros.length; l_Contador++) {
            l_ArrayNumeros[l_Contador] = l_Contador; // Rellenar el array con los índices
        }

//        System.out.println("La media de la primera mitad es: " + l_PrimeraMedia);
//        System.out.println("La media de la segunda mitad es: " + l_SegundaMedia);

    }
}