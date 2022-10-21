import java.util.Scanner;

public class ExercicioTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int numeroLinhas = scanner.nextInt();
//
//        for (int i = numeroLinhas; i > 0 ; i--){
//            String caracter = "";
//            for (int k = i; k > 0; k--) {
//                caracter = caracter + "*";
//            }
//            System.out.println(caracter);
//        }

        System.out.println("Digite abaixo a quantidade de linhas da parte superior do triângulo e pressione ENTER: ");
        int i = scanner.nextInt();
        String asterisco = "*";

        while (i >= 1) {
            String linha = asterisco.repeat(i);
            System.out.println(linha);
            i--;
        }
    }
}
