package dio.bancodigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipo = TipoConta.CONTA_POUPANCA;
    }

//    @Override
//    public void imprimirExtrato() {
//        System.out.println("=== Extrato Conta Poupança ===");
//        super.imprimirInfosComuns();
//    }


}
