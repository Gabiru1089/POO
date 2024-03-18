import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String cep;
    private Pessoa acompanhante;

    public Pessoa(String nome, String cpf, int idade, String sexo, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.cep = cep;
    }
    public Pessoa() {
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public String getCep() {
        return this.cep;
    }
    public Pessoa getAcompanhante() {
        return this.acompanhante;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setAcompanhante(Pessoa acompanhante) {
        this.acompanhante = acompanhante;
    }
    public void mostrarDados() {
        System.out.printf("Pessoa: %s %s %d %s %s\n",
                this.nome, this.cpf, this.idade, this.sexo, this.cep);
        if (this.acompanhante != null) {
            System.out.printf("Acompanhante: %s %s %d %s %s\n",
                    this.acompanhante.getNome(), this.acompanhante.getCpf(), this.acompanhante.getIdade(), this.acompanhante.getSexo(), this.acompanhante.getCep());
        }
    }

}