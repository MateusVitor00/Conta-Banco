package TipoConta;

public class ContaCorrente extends Conta{
    public void imprimirExtrato() {
        System.out.println("Extrato conta Corrente");
        super.imprimirInformacao();
    }
}
