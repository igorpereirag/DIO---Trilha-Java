public class Transacao {
    private Cliente cliente;
    private TipoTransacao tipo;
    private double valor;

    public Transacao(Cliente cliente, TipoTransacao tipo, double valor) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "cliente=" + cliente.getNome() +
                ", tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}