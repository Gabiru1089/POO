public class Igreja {
    private String cep;
    private int maxPessoas;
    private double preco;
    private String rua;
    private String numero;

    public Igreja(String cep, int maxPessoas, double preco, String rua, String numero) {
        this.cep = cep;
        this.maxPessoas = maxPessoas;
        this.preco = preco;
        this.rua = rua;
        this.numero = numero;
    }
    public Igreja() {
    }
    public String getCep() {
        return this.cep;
    }
    public int getMaxPessoas() {
        return this.maxPessoas;
    }
    public double getPreco() {
        return this.preco;
    }
    public String getRua() {
        return this.rua;
    }
    public String getNumero() {
        return this.numero;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setMaxPessoas(int maxPessoas) {
        this.maxPessoas = maxPessoas;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void mostrarDados() {
        System.out.printf("\nCEP: %s \nMáximo de Pessoas: %d \nPreço: %.2f \nRua: %s \nNúmero: %s",
                this.cep, this.maxPessoas, this.preco, this.rua, this.numero);
    }
}