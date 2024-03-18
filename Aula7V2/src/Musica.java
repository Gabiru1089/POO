public class Musica {
    private String titulo;
    private double duracao;
    public Musica(String titulo, double duracao)
    {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    public Musica() {}
    public String getTitulo()
    {
        return this.titulo;
    }
    public double getDuracao()
    {
        return this.duracao;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public void setDuracao(double duracao)
    {
        this.duracao = duracao;
    }
}