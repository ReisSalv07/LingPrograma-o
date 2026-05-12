package Aula8Exercicio;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João Silva", 10000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("Maria Souza", 2000.0, 0.005);
        ContaEmpresarial ce = new ContaEmpresarial("Tech Solutions", 50000.0, "00.000/0001-99");

        System.out.println("--- Status Inicial ---");
        System.out.println(cc);
        System.out.println(cp);

        System.out.println("\n--- Realizando Transferência ---");
        cc.transferir(cp, 1000.0);
        System.out.println(cc);
        System.out.println(cp);

        System.out.println("\n--- Processando Pagamento PIX ---");
        cc.processarPagamento(2000.0, "PIX");
        // Valor 2000 + 2% taxa (40) = 2040.0 descontado do saldo

        System.out.println(cc);
    }
}
