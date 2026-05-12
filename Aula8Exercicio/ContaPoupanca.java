package Aula8Exercicio;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxa) {
        super(titular, saldo);
        this.taxaRendimento = taxa;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Poupança");
    }
}
