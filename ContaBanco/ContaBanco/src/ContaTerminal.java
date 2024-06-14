import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo));
    }
}
