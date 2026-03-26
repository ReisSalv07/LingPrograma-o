package exemplo3;
public class Funcionario {

    private double salario;
    private double valorHora;
    private int horasTrabalhadas;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setValorHora(double valor) {
        this.valorHora = valor;
    }

    public void setHora(int hora) {
        this.horasTrabalhadas = hora;
    }
    public void calcularSalario() {
        salario = valorHora * horasTrabalhadas;

        System.out.print ("O valor da hora é R$ " + valorHora + " Trabalhando " + horasTrabalhadas + " horas ");
        System.out.println((",O Salário final é: R$ " + salario));
    }

}
