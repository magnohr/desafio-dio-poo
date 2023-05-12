import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private int cargaHoraria;
    private LocalDate data;


    @Override
    public double Calcularxp(){
        return XP_PADRAO + 20;
    }
    //contrutor
    public  Mentoria(){

   }




    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", data=" + data +
                '}';
    }
}
