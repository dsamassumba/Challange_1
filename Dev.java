import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
public class Dev {
    private String Nome;
    private Set<Conteodo> conteodoescritos = new LinkedHashSet<>();
    private Set<Conteodo> conteodoconcluidos = new LinkedHashSet<>();
    public void InscrevarBootcamp(Bootcamp bootcamp){
        this.conteodoescritos.addAll(bootcamp.getConteodos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void Progredir(){
        Optional<Conteodo> conteodo= this.conteodoescritos.stream().findFirst();
        if(conteodo.isPresent()){
            this.conteodoconcluidos.add(conteodo.get());
            this.conteodoescritos.remove(conteodo.get());
        }else{
            System.err.println("Você não está Matriculado em nem um conteodo");
        }
    }
    public double CalcularTotalXp(){
        return this.conteodoescritos.stream()
                .mapToDouble(conteodo -> conteodo.CalcularXP())
                .sum();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<Conteodo> getConteodoescritos() {
        return conteodoescritos;
    }

    public void setConteodoescritos(Set<Conteodo> conteodoescritos) {
        this.conteodoescritos = conteodoescritos;
    }

    public Set<Conteodo> getConteodoconcluidos() {
        return conteodoconcluidos;
    }

    public void setConteodoconcluidos(Set<Conteodo> conteodoconcluidos) {
        this.conteodoconcluidos = conteodoconcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(Nome, dev.Nome) &&
                Objects.equals(conteodoescritos, dev.conteodoescritos) &&
                Objects.equals(conteodoconcluidos, dev.conteodoconcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, conteodoescritos, conteodoconcluidos);
    }
}
