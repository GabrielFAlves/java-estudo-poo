import java.util.Scanner;

public class Desafioo {
    public static void main(String[] args) {
        String nome = "Eduardo França";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitor = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao > 4) {
                System.out.println("Opção invalida!");
            }
        }
    }
}
