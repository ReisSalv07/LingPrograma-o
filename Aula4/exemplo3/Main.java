package exemplo3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o valor da hora trabalhada: R$");
        f.setValorHora(sc.nextDouble());

        System.out.println(("Digite quantidade de horas trabalhadas:"));
        f.setHora(sc.nextInt());

        f.calcularSalario();

    }
}