import java.time.LocalDate;

public class Mentoria extends  Conteodo{

    private LocalDate data;

    public  double CalcularXP(){
        return XP_padrao+20d;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Conteodo{" +
                "Titulo='" + getDescricao() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                '}'+"Data=" + data +
                '}';
    }
}
