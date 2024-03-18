public class Main {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("80730-92",
                "Francisco Rocha",
                1233);
        Pessoa p1 = new Pessoa("eduardo.lino@pucpr.br",
                "999999999999",
                "Eduardo Lino",
                99,
                e1
        );

        p1.mostrarInformacoes();
        // Conta

        Cartao cartao1 = new Cartao(120381283, 123, "12/05");

        // Conta Bancária:

        ContaBancaria conta1 = new ContaBancaria(1, "nubank", cartao1, p1);

        System.out.printf("Conta Bancária 1: "); conta1.mostarTodasInformacoes();




    }
}