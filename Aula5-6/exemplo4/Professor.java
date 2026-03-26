package exemplo4;

public class Professor extends Pessoa{

    private double salario;


    public Professor() {
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void calcularSalario(){
        salario = 300 * 40;
    }

    public double salario() {
        return salario;
    }

    public void salario(double salario) {
        this.salario = salario;
    }

    public double getsalario() {
        return salario;
    }

    public void setMedia(double salario) {
        this.salario = salario;
    }
}
