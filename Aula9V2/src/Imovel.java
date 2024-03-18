public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    public Imovel(){

    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
