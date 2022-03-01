package dio.bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco bancoDio = new Banco("DIO - Banco de conhecimento");
        bancoDio.contas = new ArrayList<>();
        //System.out.println(bancoDio.getNome());

        Cliente tstCli = new Cliente();
        tstCli.setNome("nometst");

        Conta cc = new ContaCorrente(tstCli);
        cc.depositar(100.00);

        Conta cp = new ContaPoupanca(tstCli);

        cc.transferir(20.00, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        bancoDio.setContas(cc);
        bancoDio.setContas(cp);

        bancoDio.listContas();


    }
}
