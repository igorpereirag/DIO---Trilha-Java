public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente(1, "João", "Corrente");     
        banco.adicionarCliente(cliente1);        
        banco.realizarTransacao(cliente1, TipoTransacao.DEPOSITO, 500.0,0);
        
        
        banco.listarClientes();
       
    }
}
