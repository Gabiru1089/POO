public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(double salario, String nome, String telefone){
        super(nome, telefone);
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(){
        this.salario = salario;
    }

    public void mostrarDados(){
        System.out.printf("Fornecedor\n");
        System.out.printf("Nome: %s\nTelefone: %s\nSalario: %s\n",
                this.getNome(), this.getTelefone(), this.getSalario());
    }

}
