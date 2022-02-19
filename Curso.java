public  class Curso extends Conteodo{
    private  int cargahoraria;

    public  double CalcularXP(){
        return XP_padrao*this.cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }
    @Override
    public String toString() {
        return "Conteodo{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                '}'+"cargahoraria=" + cargahoraria +
                '}';
    }

}