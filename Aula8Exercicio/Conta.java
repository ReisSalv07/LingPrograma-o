package Aula8Exercicio;

public abstract class Conta {
    protected String titular;
    protected double saldo;
    protected StatusConta status;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.status = StatusConta.ATIVA;
    }

    public void depositar(double valor) {
        if (status == StatusConta.ATIVA) {
            this.saldo += valor;
        } else {
            System.out.println("Operação negada: Conta não está ativa.");
        }
    }

    public void sacar(double valor) {
        if (status == StatusConta.ATIVA && saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Operação negada: Saldo insuficiente ou conta inativa.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (this.status == StatusConta.ATIVA && destino.status == StatusConta.ATIVA) {
            if (this.saldo >= valor) {
                this.sacar(valor);
                destino.depositar(valor);
                System.out.println("Transferência de R$ " + valor + " realizada para " + destino.titular);
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else {
            System.out.println("Transferência impossibilitada pelo status das contas.");
        }
    }

    public abstract void exibirTipoConta();

    @Override
    public String toString() {
        return String.format("Titular: %s | Saldo: R$ %.2f | Status: %s", titular, saldo, status);
    }
}

