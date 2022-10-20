import java.util.Scanner;

public class ExercicioMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas linhas e colunas haverão na matriz?");
        
        int size = scanner.nextInt();
        int line = 0;
        int column = 0;
        int[][] matrix = new int[size][size];

        for(line = 0; line < size; line++) {
            for(column = 0; column < size; column++) {
                matrix[line][column] = 0;
            }
        }
        for(line = 0; line < size; line++) {
            matrix[line][size -  line - 1] = 1;
        }
        for(line = 0;line < size; line++) {
            for(column = 0; column < size; column++) {
                System.out.print(matrix[line][column] + "\t");
            }
            System.out.println();
        }

    }
}