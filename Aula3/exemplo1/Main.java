package exemplo1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("antiga: " + pessoa.idade);
        pessoa.idade = sc.nextInt();
        pessoa.niver();
        System.out.print("atual: " + pessoa.idade);
    }
}
