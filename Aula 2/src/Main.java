public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.Largura = 10;
        casa1.comprimento = 20;
        casa1.numeroAndar = 2;
        float valor = casa1.calcMetragem();

        System.out.println("O valor da metragem é " + valor);

    }
}