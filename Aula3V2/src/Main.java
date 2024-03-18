import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Musica e Album

    Musica m1 = new Musica();
    Album a1 = new Album();

    //Definir dados
    m1.setTitulo("Everlong");
    m1.setDuracao(3);
    a1.setGenero("Rock");
    a1.setAno(2011);
    a1.setNome("Album");
    a1.setMusica(m1);

    //Criar Pessoa
    Scanner entrada = new Scanner(System.in);

    System.out.printf("Nome da pessoa: ");
    String nome_pessoa = entrada.nextLine();

    System.out.printf("Idade da pessoa: ");
    int idade_pessoa = entrada.nextInt();

    Pessoa p1 = new Pessoa();

    p1.setNome(nome_pessoa);
    p1.setIdade(idade_pessoa);

    a1.setMusica(m1);
    a1.setArtista(p1);

    a1.mostraTodosOsDados();

    }
}