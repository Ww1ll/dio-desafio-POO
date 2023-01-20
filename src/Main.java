import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso OO");
        curso2.setDescricao("Descrição Orientação a objetos");
        curso2.setCargaHoraria(6);

        // Conteudo conteudo = new Curso();
        // Conteudo conteudo1 = new Mentoria();



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria de java");
        mentoria1.setData(LocalDate.now());



        // System.out.println(curso1);

        // System.out.println(curso2);

        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devWilliam.getConteudosInscritos());
        System.out.println("----");
        System.out.println("XP: " + devWilliam.calcularTotalXP());

        System.out.println("##########################################################");

        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos concluídos: " + devLarissa.getConteudosConcluidos());
        System.out.println("----" );
        System.out.println("XP: " + devLarissa.calcularTotalXP());
        



    }
}
