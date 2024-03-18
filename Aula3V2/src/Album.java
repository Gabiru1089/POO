public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private Musica musica;


    public String getGenero(){

        return this.genero;
    }
    public void setGenero(String genero){

        this.genero = genero;
    }
    public int getAno(){

        return this.ano;
    }
    public void setAno(int ano){

        this.ano = ano;
    }

    public String getNome(){

        return this.nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public Pessoa getArtista(){

        return this.artista;
    }
    public void setArtista(Pessoa artista){

        this.artista = artista;
    }
    public Musica getMusica(){

        return this.musica;
    }
    public void setMusica(Musica musica){

        this.musica = musica;
    }

    public void mostraTodosOsDados(){
        System.out.printf("%s, %d, %s, %s, %s", this.genero, this.ano, this.nome, this.artista.getNome(), this.musica.getTitulo());

        System.out.println("\nNome artista: " + this.artista.getNome());
        System.out.println("Idade artista: " + this.artista.getIdade());
        System.out.println("Titulo musica: " + this.musica.getTitulo());
        System.out.println("Duração musica: " + this.musica.getDuracao());
    }
}
