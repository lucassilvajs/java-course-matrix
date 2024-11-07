import java.util.Scanner;

public class PrintAndScan {
    public static void main(String[] args) {
        String nome = "Lucas";
        System.out.println("Olá " + nome); // println tem quebra de linha

        double salario = 10097.9846;
        System.out.printf("%.1f%n", salario); // printf tem formatação
        //Locale.setDefault(Locale.US);

        int idade = 27;
        String nomeCompleto = "";
        /*
         * Marcadores de variavel
         * %d int
         * %f ponto flutuante
         * %s string
         * %n quebra de linha
         * */
        System.out.printf("%s tem %d anos e ganha R$%.2f %n", nome, idade, salario);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.next(); // Separa a entrada por espaços ex: Lucas Silva pegaria apenas Lucas
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite seu salario: ");
        salario = sc.nextDouble();
        System.out.print("Nome completo: ");
        sc.nextLine();
        nomeCompleto = sc.nextLine();
        System.out.printf("%s também conhecido por %s tem %d anos e ganha R$%.2f %n", nomeCompleto, nome, idade, salario);

        sc.close();
    }
}
