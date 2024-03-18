public class Cliente extends Pessoa{

    private String cpf;

    public Cliente(String cpf, String nome, String telefone){
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }

    public void mostrarDados(){
        System.out.printf("Fornecedor\n");
        System.out.printf("Nome: %s\nTelefone: %s\nCpf: %s\n",
                this.getNome(), this.getTelefone(), this.getCpf());
    }
}
