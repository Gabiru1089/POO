import java.util.ArrayList;
public class Cozinha {
    private Pessoa chefe;
    private ArrayList<Pessoa> funcionarios;
    private ArrayList<String> comidasMenu;
    private double custo;

    public Cozinha(Pessoa chefe, ArrayList<Pessoa> funcionarios, ArrayList<String> comidasMenu, double custo) {
        this.chefe = chefe;
        this.funcionarios = new ArrayList<>();
        this.comidasMenu = new ArrayList<>();
        this.custo = custo;
    }
    public Cozinha() {
        this.funcionarios = new ArrayList<>();
        this.comidasMenu = new ArrayList<>();
    }
    public Pessoa getChefe() {
        return chefe;
    }
    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }
    public ArrayList<Pessoa> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(ArrayList<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public ArrayList<String> getComidasMenu() {
        return comidasMenu;
    }
    public void setComidasMenu(ArrayList<String> comidasMenu) {
        this.comidasMenu = comidasMenu;
    }
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public void addFuncionario(Pessoa funcionario) {
        this.funcionarios.add(funcionario);
    }
    public void addComidasMenu(String comida) {
        this.comidasMenu.add(comida);
    }
    public void mostrarDados() {
        chefe.mostrarDados();
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).mostrarDados();
        }
        for (int i = 0; i < comidasMenu.size(); i++) {
            System.out.printf("Comida: %s\n", comidasMenu.get(i));
        }
        System.out.printf("Custo Cozinha: %.2f\n", this.custo);
    }
}
