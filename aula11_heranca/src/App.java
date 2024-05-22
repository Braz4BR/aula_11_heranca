public class App {
    public static void main(String[] args) throws Exception {
    
    Mensalista men1 = new Mensalista("josé", "Rua abc", "Junior");
    men1.calcularSalario();
    men1.calcularInss();
    System.out.println("   ===   ===   ===   ===   ===");
    System.out.println("Nome: "+men1.getNome());
    System.out.println("Endereco: "+ men1.getEndereço());
    System.out.println("Salario: "+ men1.getSalario());
    System.out.println("   ===   ===   ===   ===   ===\n");

    Mensalista men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
    men2.calcularSalario();
    System.out.println("   ===   ===   ===   ===   ===");
    System.out.println("Nome: "+men2.getNome());
    System.out.println("Endereco: "+ men2.getEndereço());
    System.out.println("Salario: "+ men2.getSalario());
    System.out.println("   ===   ===   ===   ===   ===\n");

    }

    Horista hora1 = new Horista("");
}
