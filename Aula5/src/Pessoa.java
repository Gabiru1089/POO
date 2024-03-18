public class Pessoa {

    private String email;
    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;


    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){

        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void mostrarInformacoes(){
        System.out.println("Email: " + this.email);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco.getCep() + " " + this.endereco.getRua() + " " + this.endereco.getNumero()
        );

    }
}
