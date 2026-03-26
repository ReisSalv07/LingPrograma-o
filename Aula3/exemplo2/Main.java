package exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        c.n1 = sc.nextInt();
        System.out.print("Número 2: ");
        c.n2 = sc.nextInt();
        c.adicao();
        System.out.println("Adição = " + c.total);
        c.subtracao();
        System.out.println("Subtração = "+ c.total);
        c.multiplicacao();
        System.out.println("Multiplicação = "+ c.total);
        c.divisao();
        System.out.println("Divisão = "+ c.total);
    }
}
