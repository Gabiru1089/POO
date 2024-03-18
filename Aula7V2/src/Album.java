import java.sql.Array;
import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private ArrayList<Musica> musica;

    public Album()
    {
        this.musica = new ArrayList<Musica>();
    }
    public Album(String genero, int ano, String nome, Pessoa artista, ArrayList<Musica> musica)
    {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musica = musica;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setArtista(Pessoa artista)
    {
        this.artista = artista;
    }
    public void setMusica(ArrayList<Musica> musica)
    {
        this.musica = musica;
    }
    public String getGenero()
    {
        return this.genero;
    }
    public int getAno()
    {
        return this.ano;
    }
    public String getNome()
    {
        return this.nome;
    }
    public Pessoa getArtista()
    {
        return this.artista;
    }
    public ArrayList<Musica> getMusica()
    {
        return this.musica;
    }
    public void mostrarTodosOsDados()
    {
        System.out.printf("Gênero: %s Ano: %d Nome: %s Artista/Banda: %s Idade do Artista: %d",
                this.genero, this.ano, this.nome, this.artista.getNome(), this.artista.getIdade());
        for (int i = 0; i < musica.size(); i++)
            System.out.printf("\n   > Título: %s -- Duração: %.2f",
                    this.musica.get(i).getTitulo(), this.musica.get(i).getDuracao());
    }

}
