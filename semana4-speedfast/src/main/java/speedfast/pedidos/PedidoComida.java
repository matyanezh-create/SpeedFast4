package speedfast.pedidos;

/**
 * Representa un pedido de comida.
 */
public class PedidoComida extends Pedido {

    /**
     * Constructor del pedido de comida.
     */
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo de entrega del pedido de comida.
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) (distanciaKm * 2);
    }

    /**
     * Muestra el resumen del pedido.
     */
    @Override
    public void mostrarResumen() {
        System.out.println("PedidoComida #" + idPedido + " - " + direccionEntrega);
    }

    /**
     * Despacha el pedido de comida.
     */
    @Override
    public void despachar() {
        System.out.println("Despachando PedidoComida #" + idPedido);
    }
}
