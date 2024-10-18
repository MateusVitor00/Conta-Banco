package TipoConta;

public abstract class Conta implements Iconta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public int getAgencia() {return agencia;}
    public int getNumeroConta() {return numeroConta;}
    public double getSaldo() {return saldo;}

    @Override
    public void sacar(double valor) {
        if(saldo > valor){
            System.out.println("Saldo insuficiente");
        }else {this.saldo = saldo - valor;}
        }
    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
    }

    protected void imprimirInformacao(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero Conta %d", this.numeroConta));
        System.out.println(String.format("Saldo %2f", this.saldo));
    }
}
