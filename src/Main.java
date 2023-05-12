import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descriçao java");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso(); // polimorfismo

        List<String> palvras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriçao java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BooteCamp booteCamp = new BooteCamp();
        booteCamp.setNome("bootecamp java dev");
        booteCamp.setDescricao("descriçao Bootecamp");
        booteCamp.getConteudos().add(curso1);
        booteCamp.getConteudos().add(curso2);
        booteCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCamila.inscreverBootecamp(booteCamp);
        System.out.println("conteudos inscritos: camila " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("*----*");
        System.out.println("conteudos inscritos : joao" + devCamila.getConteudosInscritos());
        System.out.println("conteudos concluidos: camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.CalcularTotalXp());
        System.out.println("*----*");

        Dev devjoao = new Dev();
        devjoao.setNome("joao");
        devjoao.inscreverBootecamp(booteCamp);
        System.out.println("conteudos inscritos : joao" + devjoao.getConteudosInscritos());



        devjoao.progredir();
        System.out.println("*----*");
        System.out.println("Conteudos incritos: joao " + devjoao.getConteudosInscritos());
        System.out.println("conteudos concluidos: joao " + devjoao.getConteudosConcluidos());
        System.out.println("XP: " + devjoao.CalcularTotalXp());

        System.out.println("*----*");


        System.out.println();


    }
}