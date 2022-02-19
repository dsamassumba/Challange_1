import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();

        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2= new Curso();

        curso2.setTitulo("Curso de java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargahoraria(4);
        Mentoria mentoria=new Mentoria();

        /*mentoria1.setTitulo("Curso js");
        mentoria1.setDescricao("Descrição js");
        mentoria1.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("BootCamp Java developer");

        bootcamp.setDescrecao("Descrição BootCamp Java developer");

        bootcamp.getConteodos().add(curso1);

        bootcamp.getConteodos().add(curso2);

        bootcamp.getConteodos().add(mentoria);

        Dev devdaniel= new Dev();
        devdaniel.InscrevarBootcamp(bootcamp);
        devdaniel.setNome("Daniel");
        System.out.printf("Coteodos inscritos Daniel:"+devdaniel.getConteodoescritos());
        System.out.printf("XP:"+devdaniel.CalcularTotalXp());
        devdaniel.Progredir();
        devdaniel.Progredir();
        System.out.printf("-");
        System.out.printf("Coteodos inscritos Daniel:"+devdaniel.getConteodoescritos());
        System.out.printf("Coteodos Concluidos Daniel:"+devdaniel.getConteodoconcluidos());
        System.out.printf("-----------------------------");
        Dev devSamassumba= new Dev();
        devSamassumba.InscrevarBootcamp(bootcamp);
        devSamassumba.setNome("Samassumba");
        System.out.printf("Coteodos inscritos Samassumba:"+devSamassumba.getConteodoescritos());
        System.out.printf("XP:"+devSamassumba.CalcularTotalXp());
        devSamassumba.Progredir();
        devSamassumba.Progredir();
        devSamassumba.Progredir();
        System.out.printf("-");
        System.out.printf("Coteodos inscritos Samassumba:"+devSamassumba.getConteodoescritos());
        System.out.printf("Coteodos Concluidos Daniel:"+devdaniel.getConteodoconcluidos());

    }
}
