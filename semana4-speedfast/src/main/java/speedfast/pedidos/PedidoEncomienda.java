package speedfast.pedidos;

/**
 * Representa un pedido de encomienda.
 */
public class PedidoEncomienda extends Pedido {

    /**
     * Constructor del pedido de encomienda.
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo de entrega del pedido de encomienda.
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) (distanciaKm * 3);
    }

    /**
     * Muestra el resumen del pedido.
     */
    @Override
    public void mostrarResumen() {
        System.out.println("PedidoEncomienda #" + idPedido + " - " + direccionEntrega);
    }

    /**
     * Despacha el pedido de encomienda.
     */
    @Override
    public void despachar() {
        System.out.println("Despachando PedidoEncomienda #" + idPedido);
    }
}
