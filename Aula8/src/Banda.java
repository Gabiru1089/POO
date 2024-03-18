import java.util.ArrayList;
public class Banda {
    private String nomeBanda;
    private ArrayList<Pessoa> membrosBanda;
    private double custoBanda;
    public Banda(String nomeBanda, ArrayList<Pessoa> membrosBanda, double custoBanda) {
        this.nomeBanda = nomeBanda;
        this.membrosBanda = membrosBanda;
        this.custoBanda = custoBanda;
    }
    public Banda() {
        this.membrosBanda = new ArrayList<>();
    }

    public String getNomeBanda() {
        return this.nomeBanda;
    }
    public ArrayList<Pessoa> getMembrosBanda() {
        return this.membrosBanda;
    }
    public double getCustoBanda() {
        return this.custoBanda;
    }
    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }
    public void setMembrosBanda(ArrayList<Pessoa> membrosBanda) {
        this.membrosBanda = membrosBanda;
    }
    public void setCustoBanda(double custoBanda) {
        this.custoBanda = custoBanda;
    }
    public void addMembrosBanda(Pessoa membro) {
        this.membrosBanda.add(membro);
    }
    public void mostrarDados() {
        System.out.printf("Nome banda: %s \nCusto da banda: %.2f\n",
                this.nomeBanda, this.custoBanda);
        for (int i = 0; i < membrosBanda.size(); i++) {
            System.out.printf("Membro %d: ", i);
            this.membrosBanda.get(i).mostrarDados();
        }
    }

}