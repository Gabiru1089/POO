import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> nomesGatos = new ArrayList<String>();


    nomesGatos.add("Larry");
    nomesGatos.add("Erica");
    nomesGatos.add("Juan");
    nomesGatos.add("Missy");
    nomesGatos.add("Mr.Black");


    while(true) {
        System.out.println("******* Menu *******");
        System.out.println("(1) Ordenado");
        System.out.println("(2) Não Ordenado");
        System.out.println("(9) Sair\n");
        System.out.printf("Opção: ");

        int entrada = input.nextInt();

        if (entrada == 1) {

            ArrayList<String> nomesAux = new ArrayList<String>(nomesGatos);
            Collections.sort(nomesAux);
            System.out.println(nomesAux);

        }
        else if (entrada == 2) {
            System.out.println(nomesGatos);
        }
        else if (entrada == 9) {
            System.out.println("Saindo...........");
            System.exit(0);
        }
    }
    }

}
