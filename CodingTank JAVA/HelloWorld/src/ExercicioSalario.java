import java.util.Scanner;

// Dado um salário, informado pelo 'system.in', deve ser calculado o total anual incluindo o terço de férias e o
// décimo-terceiro. Também deve ser descontado o valor do INSS e assim obter o salário líquido anual.


public class ExercicioSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário abaixo (somente números) e pressiona ENTER");
        double salario = scanner.nextDouble();
        double ferias = salario * 1.33;
        System.out.println("Em suas férias, você receberá R$ " + ferias);
        double salarioAnual = (salario * 12) + ferias;
        System.out.println("Seu salário anual, com décimo-terceiro e férias, é de R$ " + salarioAnual);
        double descontoInss = 0;
        if (salario > 0 && salario <= 1212.0) {
            descontoInss = 0.075;
            System.out.println("Seu desconto de INSS é de R$ " + (salarioAnual * descontoInss));
            System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - (salarioAnual * descontoInss)));
        } else if (salario >= 1212.01 && salario <= 2427.35) {
            descontoInss = 0.09;
            System.out.println("Seu desconto de INSS é de R$ " + (salarioAnual * descontoInss));
            System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - (salarioAnual * descontoInss)));
        } else if (salario >= 2427.34 && salario <= 3641.03) {
            descontoInss = 0.12;
            System.out.println("Seu desconto de INSS é de R$ " + (salarioAnual * descontoInss));
            System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - (salarioAnual * descontoInss)));
        } else if (salario >= 3641.04 && salario <= 7087.22) {
            descontoInss = 0.14;
            System.out.println("Seu desconto de INSS é de R$ " + (salarioAnual * descontoInss));
            System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - (salarioAnual * descontoInss)));
        } else if (salario > 7087.22) {
            descontoInss = ((salario - 900) * 13);
            System.out.println("Seu desconto de INSS é de R$ " + descontoInss);
            System.out.println("Portanto, você terá recebido, em todo o ano, a quantia líquida de R$ " + (salarioAnual - descontoInss));
        }
    }
}
