package dio.bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setContas(Conta conta) {
        contas.add(conta);
    }

    public void listContas() {
        System.out.println(String.format("Lista de contas do banco %s", this.nome));
        for (Conta conta: contas) {
            System.out.println(conta);
        }

    }
}
