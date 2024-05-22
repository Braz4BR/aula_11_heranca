public class Horista extends Empregado{
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public Horista(String nome, String endereco, double salario, double horas) {
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public void calcularHorista(){
        salario = horas * 50;
    }
}
