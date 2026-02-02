package speedfast.pedidos;

import speedfast.interfaces.Despachable;
import speedfast.interfaces.Cancelable;
import speedfast.interfaces.Rastreable;

/**
 * Clase abstracta que representa un pedido genérico en SpeedFast.
 * Implementa interfaces comunes a todos los pedidos.
 */
public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    // Identificador único del pedido
    protected int idPedido;

    // Dirección donde se debe entregar el pedido
    protected String direccionEntrega;

    // Distancia de entrega en kilómetros
    protected double distanciaKm;

    /**
     * Constructor de la clase Pedido.
     */
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Obtiene el ID del pedido.
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Calcula el tiempo estimado de entrega.
     */
    public abstract int calcularTiempoEntrega();

    /**
     * Muestra un resumen del pedido.
     */
    public abstract void mostrarResumen();

    /**
     * Cancela el pedido.
     */
    @Override
    public void cancelar() {
        System.out.println("Pedido #" + idPedido + " cancelado.");
    }

    /**
     * Rastrea el pedido.
     */
    @Override
    public void rastrear() {
        System.out.println("Rastreando pedido #" + idPedido);
    }
}
