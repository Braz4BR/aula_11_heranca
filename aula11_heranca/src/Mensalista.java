public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Mensalista(String nome,String endereco, double salario, String cargo){
        super(nome, endereco, salario);
        this.cargo = cargo;
    }
    public void calculaSalario(){
        if(cargo.equals("Junior")){
            salario = 2500;
        }else if(cargo.equals("pleno")){
            salario = 3500;
        }else{
            salario = 5500;
        }
    }
}
