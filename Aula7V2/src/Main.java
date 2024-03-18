import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        ArrayList<Musica> mLista = new ArrayList<Musica>();
        Album album = new Album();
        Pessoa p1 = new Pessoa();
        Musica m1 = new Musica(); m1.setTitulo("Café"); m1.setDuracao(4.20);
        Musica m2 = new Musica(); m2.setTitulo("Drama da Humana Manada"); m2.setDuracao(5.12);
        Musica m3 = new Musica(); m3.setTitulo("Trovoada"); m3.setDuracao(8.60);
        Musica m4 = new Musica(); m4.setTitulo("Chama Negra"); m4.setDuracao(6.50);
        p1.setNome("El Efecto");
        p1.setIdade(5);
        mLista.add(m1);
        mLista.add(m2);
        mLista.add(m3);
        mLista.add(m4);
        album.setMusica(mLista);
        album.setGenero("MPB");
        album.setAno(2015);
        album.setArtista(p1);
        album.setNome("Memórias do Fogo");

        while (true)
        {
            System.out.println("\n\n*** MENU ***");
            System.out.println("(1) Definir música");
            System.out.println("(2) Mostrar músicas");
            System.out.println("(9) Exit");
            System.out.printf("\nOpção: ");

            int opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.printf("Nome da música: ");
                    String nomeMusica = sc.next();
                    System.out.printf("Duração da música: ");
                    double duracaoMusica = sc.nextDouble();
                    mLista.add(new Musica(nomeMusica, duracaoMusica));
                    break;
                case 2:
                    for (int i = 0; i < mLista.size(); i++)
                        System.out.printf("\n   > Título: %s -- Duração: %.2f",
                                mLista.get(i).getTitulo(), mLista.get(i).getDuracao());
                    break;
                case 9:
                    System.exit(0);
            }

        }



    }
}