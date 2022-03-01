package dio.bancodigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.tipo = TipoConta.CONTA_CORRENTE;
    }

//    @Override
//    public void imprimirExtrato() {
//        System.out.println("=== Extrato Conta Corrente ===");
//        super.imprimirInfosComuns();
//    }

}
