import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BooteCamp {
    private String nome;
    private String Descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private  Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooteCamp booteCamp = (BooteCamp) o;
        return Objects.equals(nome, booteCamp.nome) && Objects.equals(Descricao, booteCamp.Descricao) && Objects.equals(dataInicial, booteCamp.dataInicial) && Objects.equals(dataFinal, booteCamp.dataFinal) && Objects.equals(devsIncritos, booteCamp.devsIncritos) && Objects.equals(conteudos, booteCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Descricao, dataInicial, dataFinal, devsIncritos, conteudos);
    }
}
