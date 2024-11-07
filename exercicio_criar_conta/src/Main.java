import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de conta bancária");
        System.out.print("Insira o nome completo do cliente: ");
        String name = sc.nextLine();
        System.out.print("Insira o numero da conta: ");
        String accountNumber = sc.nextLine();

        System.out.print("O cliente fará deposito inicial (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Insira o valor inicial: ");
            double balance = sc.nextDouble();
            c = new Client(name, accountNumber, balance);
        }else{
            c = new Client(name, accountNumber);
        }

        System.out.println("Conta cadastrada com sucesso");
        System.out.println(c.toString());

        System.out.print("Valor a ser depositado: ");
        c.deposit(sc.nextDouble());

        System.out.println();
        System.out.print(c);

        System.out.print("\nValor a ser sacado: ");
        c.withdraw(sc.nextDouble());

        System.out.println();
        System.out.print(c.toString());
    }
}