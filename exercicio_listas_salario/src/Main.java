import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero de linhas: ");
        int row = sc.nextInt();

        System.out.print("Insira o numero de colunas: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.print("Matrix" + matrix.length);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual numero deseja buscar?: ");
        int target = sc.nextInt();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(target == matrix[i][j]){
                    System.out.printf("Position: %d, %d\n", i, j);
                    if(j > 0) System.out.printf("Left: %d\n", matrix[i][j-1]);
                    if(j < matrix[i].length-1) System.out.printf("Right: %d\n", matrix[i][j+1]);
                    if(i > 0) System.out.printf("Up: %d\n", matrix[i-1][j]);
                    if(i < matrix.length-1) System.out.printf("Bottom: %d\n", matrix[i+1][j]);
                    System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                }
            }
        }



        sc.close();
    }
}