package speedfast.pedidos;

/**
 * Representa un pedido express.
 */
public class PedidoExpress extends Pedido {

    /**
     * Constructor del pedido express.
     */
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo de entrega del pedido express.
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) (distanciaKm * 1.5);
    }

    /**
     * Muestra el resumen del pedido.
     */
    @Override
    public void mostrarResumen() {
        System.out.println("PedidoExpress #" + idPedido + " - " + direccionEntrega);
    }

    /**
     * Despacha el pedido express.
     */
    @Override
    public void despachar() {
        System.out.println("Despachando PedidoExpress #" + idPedido);
    }
}
