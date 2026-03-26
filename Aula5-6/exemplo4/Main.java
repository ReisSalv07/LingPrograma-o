package exemplo4;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno afixo = new Aluno ("Pedro",17,2026101,10,10,10,10);
        Disciplina d2 = new Disciplina("BDD");
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor p2 = new Professor("Maria");
        Professor p = new Professor();
        Disciplina d = new Disciplina();

        //--------------------   CADASTRO ALUNO  -------------------- //
        System.out.print("Aluno, digite seu nome: ");
        aluno.setNome(sc.next());

        System.out.print("Aluno, digite sua idade : ");
        aluno.setIdade(sc.nextInt());

        System.out.print("Aluno, digite sua matricula: ");
        aluno.setMatricula(sc.nextInt());

        System.out.print("Digite a nota 1: ");
        aluno.setNota1(sc.nextDouble());

        System.out.print("Digite a nota 2: ");
        aluno.setNota2(sc.nextDouble());

        System.out.print("Digite a nota 3: ");
        aluno.setNota3(sc.nextDouble());

        aluno.calcularmedia();

        System.out.println("Seu nome é: " + aluno.nome);
        System.out.println("Sua idade é: " + aluno.idade);
        System.out.println("Sua Matricula é: " + aluno.getMatricula());
        System.out.println("Sua média é: " + aluno.getMedia());


        System.out.println("Seu nome é: " + afixo.nome);
        System.out.println("Sua idade é: " + afixo.idade);
        System.out.println("Sua Matricula é: " + afixo.getMatricula());
        System.out.println("Sua média é: " + afixo.getMedia());

        //--------------------   CADASTRO PROFESSOR  -------------------- //
        System.out.print("Digite seu nome professor(a): ");
        p.setNome(sc.next());

        System.out.print("Sua idade professor(a): ");
        p.setIdade(sc.nextInt());

        p.calcularSalario();
        System.out.println("Seu nome Professor(a) é: " + p.nome);
        System.out.println("Sua idade Professor(a) é: " + p.idade);
        System.out.println("Seu salario é: " + p.getsalario());


        //--------------------   CADASTRO DISCIPLINA  -------------------- //

        System.out.println("Digite a Disciplina: ");
        d.setNomed(sc.next());
        d.associar(p);
        d.mostrarDisciplina();
        System.out.println("Professor(a) " + p2.getNome() + " da aula de " + d2.getNomed());

    }
}