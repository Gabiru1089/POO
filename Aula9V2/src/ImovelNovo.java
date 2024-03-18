public class ImovelNovo extends Imovel{
    private double precoNovo;

    public ImovelNovo(String endereco, double preco){
        super(endereco, preco);
        this.precoNovo = preco * 1.10;

    }

    public double getPrecoNovo(){
        return this.precoNovo;
    }

    public void setPrecoNovo(double preco) {
        this.precoNovo = precoNovo;
    }

    public void mostrarDados(){
        System.out.printf("Imóvel Novo\n");
        System.out.printf("Endereço: %s\nPreço: %f\n",
                this.getEndereco(), this.precoNovo);

    }

}
