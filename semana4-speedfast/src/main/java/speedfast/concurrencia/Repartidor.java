package speedfast.concurrencia;

import speedfast.pedidos.Pedido;
import java.util.List;
import java.util.Random;

/**
 * Representa a un repartidor que ejecuta entregas de manera concurrente.
 */
public class Repartidor implements Runnable {

    // Nombre del repartidor
    private String nombre;

    // Lista de pedidos asignados
    private List<Pedido> pedidos;

    // Generador de tiempos aleatorios
    private Random random = new Random();

    /**
     * Constructor del repartidor.
     */
    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    /**
     * Método que se ejecuta cuando el hilo inicia.
     */
    @Override
    public void run() {
        for (Pedido pedido : pedidos) {
            try {
                System.out.println("[Repartidor: " + nombre + "] Entregando "
                        + pedido.getClass().getSimpleName()
                        + " #" + pedido.getIdPedido() + "...");

                Thread.sleep(1000 + random.nextInt(2000));

                System.out.println("[Repartidor: " + nombre + "] Pedido #"
                        + pedido.getIdPedido() + " entregado.");
            } catch (InterruptedException e) {
                System.out.println("[Repartidor: " + nombre + "] Entrega interrumpida.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
