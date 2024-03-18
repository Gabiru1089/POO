import java.util.ArrayList;

public class Casamento {
    private Pessoa noivo;
    private Pessoa noiva;
    private Pessoa padre;
    private Cozinha cozinha;
    private ArrayList<Pessoa> convidados;
    private Banda banda;
    private ArrayList<Presentes> presentes;
    private Igreja igreja;

    public Casamento(Pessoa noivo, Pessoa noiva, Pessoa padre, Cozinha cozinha, ArrayList<Pessoa> convidados, Banda banda, ArrayList<Presentes> presentes, Igreja igreja) {
        this.noivo = noivo;
        this.noiva = noiva;
        this.padre = padre;
        this.cozinha = cozinha;
        this.convidados = convidados;
        this.banda = banda;
        this.presentes = presentes;
        this.igreja = igreja;
    }
    public Casamento() {
        this.convidados = new ArrayList<>();
        this.presentes = new ArrayList<>();

    }

    public Pessoa getNoivo() {
        return noivo;
    }
    public Pessoa getNoiva() {
        return noiva;
    }
    public Pessoa getPadre() {
        return padre;
    }
    public Cozinha getCozinha() {
        return cozinha;
    }
    public ArrayList<Pessoa> getConvidados() {
        return convidados;
    }
    public Banda getBanda() {
        return banda;
    }
    public ArrayList<Presentes> getPresentes() {
        return presentes;
    }
    public Igreja getIgreja() {
        return igreja;
    }
    public void setNoivo(Pessoa noivo) {
        this.noivo = noivo;
    }
    public void setNoiva(Pessoa noiva) {
        this.noiva = noiva;
    }
    public void setPadre(Pessoa padre) {
        this.padre = padre;
    }
    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }
    public void setConvidados(ArrayList<Pessoa> convidados) {
        this.convidados = convidados;
    }
    public void setBanda(Banda banda) {
        this.banda = banda;
    }
    public void setPresentes(ArrayList<Presentes> presentes) {
        this.presentes = presentes;
    }
    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }
    public void addPresente(Presentes presente) {
        this.presentes.add(presente);
    }
    public void addConvidado(Pessoa convidado) {
        this.convidados.add(convidado);
    }
    public void mostrarDados() {
        System.out.printf("\n==================== Noivo ====================\n");
        this.noivo.mostrarDados();
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Noiva ====================\n");
        this.noiva.mostrarDados();
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Padre ====================\n");
        this.padre.mostrarDados();
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Cozinha ====================\n");
        this.cozinha.mostrarDados();
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Convidados ====================\n");
        for (int i = 0; i < convidados.size(); i++) {
            convidados.get(i).mostrarDados();
        }
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Banda ====================\n");
        this.banda.mostrarDados();
        System.out.printf("\n===============================================\n");
        System.out.printf("\n==================== Presentes ====================\n");
        for (int i = 0; i < presentes.size(); i++) {
            presentes.get(i).mostrarDados();
        }
        System.out.printf("===============================================\n");
        System.out.printf("\n==================== Igreja ====================");
        this.igreja.mostrarDados();
        System.out.printf("\n===============================================\n");
    }
}