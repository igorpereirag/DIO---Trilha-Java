import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() +
                " já está disponível para saque.");
    }
}
