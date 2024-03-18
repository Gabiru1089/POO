public class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();

        r1.setHeadChef("Jacã");
        System.out.println(r1.getHeadChef());

        r1.setEndereco("Rua da Itália 1233");
        System.out.println(r1.getEndereco());

        r1.setNome("Restaurante Italiano");
        System.out.println(r1.getNome());

        r1.setQuantidadeMesas(25);
        System.out.println(r1.getQuantidadeMesas());

        r1.setComida("Italiana");
        System.out.println(r1.getComida());

        r1.ImprimeDados();


    }
}