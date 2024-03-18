public class Restaurante {
    private String HeadChef;
    private String endereco;
    private String nome;
    private int QuantidadeMesas;
    private String comidaTipo;

    public String getHeadChef(){
        return this.HeadChef;
    }
    public void setHeadChef(String HeadChef){
        this.HeadChef = HeadChef;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuantidadeMesas(){
        return this.QuantidadeMesas;
    }
    public void setQuantidadeMesas(int QuantidadeMesas){
        this.QuantidadeMesas = QuantidadeMesas;
    }
    public String getComida(){
        return this.comidaTipo;
    }
    public void setComida(String comidaTipo){
        this.comidaTipo = comidaTipo;
    }

    public void ImprimeDados(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Nome do Chef: " + this.HeadChef);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de mesas: " + this.QuantidadeMesas);
        System.out.println("Tipo de comida: " + this.comidaTipo);

    }
}
