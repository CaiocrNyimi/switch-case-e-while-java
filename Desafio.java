import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        String nome = "Joaquim Silva Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        String menu = """
        
        Operações\n
        1- Consultar saldos
        2- Receber valor
        3- Transferir valor
        4- Sair
        """;



        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("\nTipo conta: " + tipoConta);
        System.out.println("\nSaldo do cliente: " + saldo);
        System.out.println("\n***********************");



        while (opcao != 4) {

            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Seu saldo é de " + df.format(saldo) + " reais.");
                    opcao += 4;
                    break;
                case 2:
                    System.out.println("Qual o valor do depósito?");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Seu saldo atual é de " + df.format(saldo) + " reais.");
                    opcao += 3;
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir?");
                    double transferencia = sc.nextDouble();
                        if (transferencia > saldo) {
                            System.out.println("Saldo insuficiente para transferir.");
                        } else {
                            saldo -= transferencia;
                            System.out.println("Seu saldo atual é de " + df.format(saldo) + " reais.");
                            opcao += 2;
                            break;
                        }
            }   if (opcao < 4) {
                System.out.println("Opção inválida!");
            }
        }


    }
}