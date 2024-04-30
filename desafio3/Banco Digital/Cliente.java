public class Cliente {
    private int idCliente;
    private String nome;
    private double saldo;
    private String tipoConta; 

    public Cliente(int idCliente, String nome, String tipoConta) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.saldo = 0.0; 
        this.tipoConta = tipoConta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void depositar(double valor) {
        saldo += valor; // Adiciona o valor ao saldo
        System.out.println("Depósito de " + valor + " realizado com sucesso para o cliente " + nome);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor; // Deduz o valor do saldo
            System.out.println("Saque de " + valor + " realizado com sucesso para o cliente " + nome);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(Cliente destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor; 
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso de " + nome + " para " + destino.getNome());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
