import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição do curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Java Script");
    curso2.setDescricao("Descrição do curso Java Script");
    curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição mentoria Java");
    mentoria1.setData(LocalDate.now());

    // System.out.println(mentoria1);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Bootcamp de Java para Developers");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devDinah = new Dev();
    devDinah.setNome("Dinah");
    devDinah.increverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos" + devDinah.getConteudosInscritos());
    devDinah.progredir();
    devDinah.progredir();
    System.out.println("-----" );
    System.out.println("Conteúdos inscritos" + devDinah.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos" + devDinah.getConteudosConcluidos());
    System.out.println("XP: " + devDinah.calcularTotalXP());    

    System.out.println("======================================");

    Dev devJonas = new Dev();
     devJonas.setNome("Jonas");
     devJonas.increverBootcamp(bootcamp);
     System.out.println("Conteúdos inscritos" + devJonas.getConteudosInscritos());
     devJonas.progredir();
     devJonas.progredir();
     devJonas.progredir();
     System.out.println("-----" );
     System.out.println("Conteúdos inscritos" + devJonas.getConteudosInscritos());
     System.out.println("Conteúdos Concluídos" + devDinah.getConteudosConcluidos());    
     System.out.println("XP: " + devJonas.calcularTotalXP());   

    }
}   