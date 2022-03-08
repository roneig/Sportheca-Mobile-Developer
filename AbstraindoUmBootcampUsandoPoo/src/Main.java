import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAluno1 = new Dev();
        devAluno1.setNome("Aluno1");
        devAluno1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aluno1:" + devAluno1.getConteudosInscritos());
        devAluno1.progredir();
        devAluno1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aluno1:" + devAluno1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Aluno1:" + devAluno1.getConteudosConcluidos());
        System.out.println("XP:" + devAluno1.calcularTotalXp());

        System.out.println("-------");

        Dev devAluno2 = new Dev();
        devAluno2.setNome("Aluno2");
        devAluno2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aluno2:" + devAluno2.getConteudosInscritos());
        devAluno2.progredir();
        devAluno2.progredir();
        devAluno2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aluno2:" + devAluno2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Aluno2:" + devAluno2.getConteudosConcluidos());
        System.out.println("XP:" + devAluno2.calcularTotalXp());

    }
}
