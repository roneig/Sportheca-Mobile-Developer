package dio.bancodigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public enum TipoConta {
        CONTA_CORRENTE,
        CONTA_POUPANCA
    }

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected TipoConta tipo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //protected void imprimirInfosComuns() {
    public void imprimirExtrato() {
        if (this.tipo == TipoConta.CONTA_CORRENTE){
            System.out.println("=== Extrato Conta Corrente ===");
        } else {
            System.out.println("=== Extrato Conta Poupança ===");
        }
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        //System.out.println(this.tipo);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Agencia=" + agencia +
                ", Numero=" + numero +
                ", Saldo=" + saldo +
                ", Cliente=" + cliente.getNome() +
                ", Tipo=" + tipo +
                '}';
    }
}
