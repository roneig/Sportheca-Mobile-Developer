/*
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores,
porém temos apenas a quantidade de horas trabalhadas e o valor hora.
Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse colaborador.
Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

Entrada
Você receverá 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo,
com um espaço em branco antes e depois da igualdade. No caso do salário,
também deve haver um espaço em branco após o $.

Exemplos de Entrada	Exemplos de Saída
25
100                 NUMBER = 25
5.50                SALARY = U$ 550.00

1
200                 NUMBER = 1
20.50               SALARY = U$ 4100.00

6
145                 NUMBER = 6
15.55               SALARY = U$ 2254.75

 */

package dio.java.desafio.FolhaDePagamento;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

public class FolhaDePagamento {

    public static void main(String[] args) throws IOException {

        final var localeAmericano = new Locale("en", "US");
        Locale.setDefault(localeAmericano);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        double salario = valor2 * valor3;
        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
