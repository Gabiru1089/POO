public class Presentes {
    private Pessoa convidado;
    private String presenteTipo;
    private String presenteDescricao;

    public Presentes(Pessoa convidado, String presenteTipo, String presenteDescricao) {
        this.convidado = convidado;
        this.presenteTipo = presenteTipo;
        this.presenteDescricao = presenteDescricao;
    }
    public Presentes() {

    }
    public Pessoa getConvidado() {
        return convidado;
    }
    public String getPresenteTipo() {
        return presenteTipo;
    }
    public String getPresenteDescricao() {
        return presenteDescricao;
    }
    public void setConvidado(Pessoa convidado) {
        this.convidado = convidado;
    }
    public void setPresenteTipo(String presenteTipo) {
        this.presenteTipo = presenteTipo;
    }
    public void setPresenteDescricao(String presenteDescricao) {
        this.presenteDescricao = presenteDescricao;
    }
    public void mostrarDados() {
        System.out.printf("Presente: %s %s\n",
                this.presenteTipo, this.presenteDescricao);
        this.convidado.mostrarDados();
    }
}