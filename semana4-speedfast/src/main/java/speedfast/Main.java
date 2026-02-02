package speedfast;

import speedfast.concurrencia.Repartidor;
import speedfast.pedidos.*;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Clase principal que ejecuta la simulación de entregas concurrentes.
 */
public class Main {

    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {

        Repartidor r1 = new Repartidor("Camila", Arrays.asList(
                new PedidoComida(101, "Av. Central 123", 5),
                new PedidoExpress(102, "Calle Norte 456", 3)
        ));

        Repartidor r2 = new Repartidor("Luis", Arrays.asList(
                new PedidoEncomienda(103, "Pasaje Sur 789", 8),
                new PedidoComida(104, "Diagonal 321", 4)
        ));

        Repartidor r3 = new Repartidor("Ana", Arrays.asList(
                new PedidoExpress(105, "Ruta 5 Km 10", 2),
                new PedidoEncomienda(106, "Camino Real 654", 6)
        ));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(r1);
        executor.execute(r2);
        executor.execute(r3);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            System.out.println("Ejecución interrumpida.");
        }

        System.out.println("Todas las entregas finalizadas.");
    }
}
