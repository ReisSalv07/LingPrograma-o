package Aula8Exercicio;

public class ContaEmpresarial extends Conta implements Pagamento {
    private String cnpj;
    private double limiteCredito;

    public ContaEmpresarial(String titular, double saldo, String cnpj) {
        super(titular, saldo);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Empresarial (CNPJ: " + cnpj + ")");
    }

    @Override
    public void processarPagamento(double valor, String modalidade) {
        if (valor > 0) {
            double taxa = valor * 0.05; // Juros de 5%
            this.sacar(valor + taxa);
            System.out.println("Pagamento Empresarial via " + modalidade + " processado.");
        }
    }
}
