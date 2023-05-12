

    public class Curso extends Conteudo {

        private int cargaHoraria;
        //contrutor
        public  Curso(){

        }

        @Override
        public double Calcularxp() {
            return XP_PADRAO * cargaHoraria;
        }


        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        @Override
        public String toString() {
            return "Curso{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao() + '\'' +
                    ", cargaHoraria=" + cargaHoraria +
                    '}';
        }
    }


