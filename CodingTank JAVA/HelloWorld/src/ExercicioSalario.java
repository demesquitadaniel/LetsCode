import java.util.Scanner;

// Dado um salário, informado pelo 'system.in', deve ser calculado o total anual incluindo o terço de férias e o
// décimo-terceiro. Também deve ser descontado o valor do INSS e assim obter o salário líquido anual.


public class ExercicioSalario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário abaixo (somente números) e pressiona ENTER");
        double salario = scanner.nextDouble();
        double ferias = salario * 1.3;
        System.out.println("Em suas férias, você receberá R$ " + ferias);
        double salarioAnual = (salario * 13) + ferias;
        System.out.println("Seu salário anual, com décimo-terceiro e férias, é de R$ " + salarioAnual);
        double descontoInss = salarioAnual * 0.3;
        System.out.println("Seu desconto de INSS é de R$ " + descontoInss);
        System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - descontoInss));
    }
}
