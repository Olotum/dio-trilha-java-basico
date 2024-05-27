import java.time.LocalTime;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LocalTime horaAtual = LocalTime.now();
        if (horaAtual.getHour() >= 20 || horaAtual.getHour() < 6) {
            System.out.print("Boa noite, pode me dizer seu nome?");
        } else if (horaAtual.getHour() >= 12) {
            System.out.print("Boa tarde, pode me dizer seu nome?");
        } else {
            System.out.print("Bom dia, pode me dizer seu nome?");
        }
        String nomeDoCliente = sc.nextLine();
        System.out.print("Olá, " + nomeDoCliente
                + ", seja bem vindo ao Agibank, vamos dar inicio ao seu login: \nQual seu numero da conta?");
        int numeroDaConta = sc.nextInt();
        System.out.println("Sua agencia? ");
        int agencia = sc.nextInt();
        System.out.println("Sua agencia? ");
        double saldo = 0;
        System.out.println("Para seu primeiro login será nescessario fazer um depósito inicial");
        saldo = deposito(saldo);
        sc.close();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    public static double deposito(double saldo) {
        System.out.print("Qual será o valor do deposito? ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        saldo += valor;
        sc.close();
        return saldo;
    }
}
