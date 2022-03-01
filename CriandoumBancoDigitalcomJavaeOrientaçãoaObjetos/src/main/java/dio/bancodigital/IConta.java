package dio.bancodigital;

public interface IConta {

    //public void sacar();  public = redundante
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
