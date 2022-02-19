import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String Nome;
    private String descrecao;
    private final LocalDate dataInicio= LocalDate.now();
    private final LocalDate dataFinal= dataInicio.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteodo> conteodos= new LinkedHashSet<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescrecao() {
        return descrecao;
    }

    public void setDescrecao(String descrecao) {
        this.descrecao = descrecao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteodo> getConteodos() {
        return conteodos;
    }

    public void setConteodos(Set<Conteodo> conteodos) {
        this.conteodos = conteodos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(Nome, bootcamp.Nome) &&
                Objects.equals(descrecao, bootcamp.descrecao) &&
                Objects.equals(dataInicio, bootcamp.dataInicio) &&
                Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
                Objects.equals(conteodos, bootcamp.conteodos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, descrecao, dataInicio, dataFinal, devsInscritos, conteodos);
    }
}
