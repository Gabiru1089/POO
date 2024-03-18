public class ImovelVelho extends Imovel{
    private double precoDesconto;

    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
        this.precoDesconto = preco * 0.90;

    }

    public double getPrecoDesconto(){
        return this.precoDesconto;
    }

    public void setPrecoDesconto(double preco) {
        this.precoDesconto = precoDesconto;
    }

    public void mostrarDados(){
        System.out.print("\nImóvel Velho\n");
        System.out.printf("Endereço: %s\nPreço: %f",
                this.getEndereco(), this.precoDesconto);

    }
}
