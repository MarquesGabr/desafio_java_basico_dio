import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int agencia, conta;
        double saldo;
        System.out.println("Por favor, informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Por favor, informe o número da sua agência: ");
        agencia = sc.nextInt();
        System.out.println("Por favor, informe o número da sua conta: ");
        conta = sc.nextInt();
        System.out.println("Por favor, informe o seu saldo: ");
        saldo = sc.nextDouble();
        sc.close();
        System.out.printf(
                """
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo R$%.2f já está disponível para saque.
                """, nome, agencia, conta, saldo);
    }
}
