public class Main {
    public static void main(String[] args) {

        ImovelNovo i1 = new ImovelNovo("Rua Joçoares de Alcantra 1233", 1000);
        ImovelVelho i2 = new ImovelVelho("Rua Joçoares de Alcantra 12453,", 1000);

        i1.mostrarDados();
        i2.mostrarDados();
    }
}