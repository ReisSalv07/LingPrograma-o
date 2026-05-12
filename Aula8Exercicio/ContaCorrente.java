package Aula8Exercicio;

public class ContaCorrente extends Conta implements Pagamento {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limiteChequeEspecial = limite;
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Tipo: Conta Corrente");
    }

    @Override
    public void processarPagamento(double valor, String modalidade) {
        if (validarRegras(valor, modalidade)) {
            double taxa = valor * 0.02; // Juros de 2%
            this.sacar(valor + taxa);
            System.out.println("Pagamento via " + modalidade + " realizado com taxa de R$ " + taxa);
        }
    }

    private boolean validarRegras(double valor, String modalidade) {
        return switch (modalidade.toUpperCase()) {
            case "PIX" -> valor <= 5000;
            case "CARTAO" -> valor <= 20000;
            case "BOLETO" -> valor > 0;
            default -> false;
        };
    }
}