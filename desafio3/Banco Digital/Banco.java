import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", Saldo: " + cliente.getSaldo() + ", Tipo de Conta: " + cliente.getTipoConta());
        }
    }

    public void realizarTransacao(Cliente cliente, TipoTransacao tipo, double valor, int idDestinatario) {
        if (tipo == TipoTransacao.DEPOSITO) {
            depositar(cliente, valor);
        } else if (tipo == TipoTransacao.SAQUE) {
            sacar(cliente, valor);
        } else if (tipo == TipoTransacao.TRANSFERENCIA) {
            Cliente destino = obterDestinatario(idDestinatario);
            if (destino != null) {
                transferir(cliente, destino, valor);
            } else {
                System.out.println("Destinatário inválido.");
            }
        }
    }

    private Cliente obterDestinatario(int idDestinatario) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idDestinatario) {
                return cliente;
            }
        }
        return null;
    }

    private void sacar(Cliente cliente, double valor) {
        if (cliente.getSaldo() >= valor) {
            cliente.setSaldo(cliente.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    private void depositar(Cliente cliente, double valor) {
        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    private void transferir(Cliente origem, Cliente destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + destino.getNome());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
