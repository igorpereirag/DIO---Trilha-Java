public interface Conta {
        void depositar(double valor);
        void sacar(double valor);
        void transferir(Conta destino, double valor);
        double getSaldo();
    }
    