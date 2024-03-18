public class Fornecedor extends Pessoa{
    private String cnpj;

    public Fornecedor(String cnpj, String nome, String telefone){
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(){
        this.cnpj = cnpj;
    }

    public void mostrarDados(){
        System.out.printf("Fornecedor\n");
        System.out.printf("Nome: %s\nTelefone: %s\nCnpj: %s\n",
                this.getNome(), this.getTelefone(), this.getCnpj());
    }
}
