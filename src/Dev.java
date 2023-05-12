import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void  inscreverBootecamp(BooteCamp booteCamp){
        this.conteudosInscritos.addAll(booteCamp.getConteudos());
        booteCamp.getDevsIncritos().add(this);
    }

        public void progredir() {
            Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            if (conteudo.isPresent()) {
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            } else {
                System.out.println("você não esta matriculado em nenhum conteúdo!"); //conteudo = conteudo.calcularxp()).sum
            }
        }

        public double calcularTotalxp() {
            return this.conteudosConcluidos
                    .stream()
                    .mapToDouble(conteudo -> conteudo.calcularxp()).sum();


            }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    public int CalcularTotalXp() {
        return 120;
    }
}
