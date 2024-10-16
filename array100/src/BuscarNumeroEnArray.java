import java.util.Random;
import java.util.Scanner;

public class BuscarNumeroEnArray {
    public static void main(String[] args) {
        // Definir array de 100 enteros
        int[] array = new int[100];
        Random random = new Random();

        // Llenar el array con números aleatorios entre 1 y 1000
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) + 1; // Generar números entre 1 y 1000
        }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        boolean encontrado = false;

        // Bucle que sigue pidiendo el número hasta que i llegue a 100
        while (i < array.length) {
            // Leer número x a buscar
            System.out.print("Introduce el número que deseas buscar: ");
            int x = scanner.nextInt();

            // Buscar el número en el array
            encontrado = false; // Reiniciar el estado de encontrado para cada nueva búsqueda
            for (int j = 0; j < array.length; j++) {
                if (array[j] == x) {
                    // Si el número se encuentra, mostrar la posición
                    System.out.println("El número " + x + " está en la posición " + j);
                    encontrado = true;
                    break;
                }
            }

            // Si no se encuentra el número, incrementar i
            if (!encontrado) {
                i++;
                System.out.println("El número no está en el vector. Intentos restantes: " + (100 - i));
            }

            // Si se llegó a 100 intentos y no se encontró
            if (i == 100 && !encontrado) {
                System.out.println("No existe en el vector el número buscado. Se alcanzaron los 100 intentos.");
                break;
            }
        }
    }
}