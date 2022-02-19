public abstract class Conteodo {

        protected final static double XP_padrao=10d;
        private  String Titulo;
        private  String Descricao;

    public abstract double CalcularXP();

        public void setTitulo(String titulo){
            this.Titulo=titulo;
        }

        public void setDescricao(String descricao) {
            this.Descricao = descricao;
        }

        public String getDescricao() {
            return Descricao;
        }

        public String getTitulo() {
            return Titulo;
        }


}

