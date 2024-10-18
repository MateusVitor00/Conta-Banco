import TipoConta.Conta;
import TipoConta.ContaCorrente;
import TipoConta.ContaPoupanca;

public class main {
    public static void main(String[]args){
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
