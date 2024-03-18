import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Casamento c1 = new Casamento(
                new Pessoa("Noivo1", "12345", 26, "Homem", "2038122"), // noivo 1
                new Pessoa("Noiva1", "123567", 27, "Homem", "2021844"), // noiva 1
                new Pessoa("Padre1", "129344", 53, "Homem", "29418233"), // padre 1
                new Cozinha(
                        new Pessoa("Chefe1", "214241421", 69, "Homem", "294128412"), // chefe 1
                        new ArrayList<>(),
                        new ArrayList<>(),
                        212.00
                ),
                new ArrayList<>(),
                new Banda(
                        "Banda1",
                        new ArrayList<>(),
                        150.00
                ),
                new ArrayList<>(),
                new Igreja(
                        "02148144",
                        123,
                        10000.00,
                        "Rua João",
                        "123"
                )
        );
        c1.addConvidado(new Pessoa("Convidado1", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado2", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado3", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado4", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado5", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado6", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado7", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado8", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado9", "9124912", 19, "Mulher", "9241744"));
        c1.addConvidado(new Pessoa("Convidado10", "9124912", 19, "Mulher", "9241744"));

        c1.getConvidados().get(0).setAcompanhante(c1.getConvidados().get(4));
        c1.getConvidados().get(9).setAcompanhante(c1.getConvidados().get(5));
        c1.getConvidados().get(2).setAcompanhante(c1.getConvidados().get(7));
        c1.getConvidados().get(6).setAcompanhante(c1.getConvidados().get(8));

        c1.addPresente(new Presentes(c1.getConvidados().get(0), "Tipo1", "Descricao"));
        c1.addPresente(new Presentes(c1.getConvidados().get(1), "Tipo2", "Descricao"));
        c1.addPresente(new Presentes(c1.getConvidados().get(2), "Tipo3", "Descricao"));
        c1.addPresente(new Presentes(c1.getConvidados().get(3), "Tipo4", "Descricao"));
        c1.addPresente(new Presentes(c1.getConvidados().get(4), "Tipo5", "Descricao"));

        c1.getBanda().addMembrosBanda(c1.getConvidados().get(0));
        c1.getBanda().addMembrosBanda(c1.getConvidados().get(1));
        c1.getBanda().addMembrosBanda(c1.getConvidados().get(3));

        c1.getCozinha().addFuncionario(c1.getConvidados().get(4));
        c1.getCozinha().addFuncionario(c1.getConvidados().get(6));
        c1.getCozinha().addFuncionario(c1.getConvidados().get(9));

        c1.getCozinha().addComidasMenu("Carne");
        c1.getCozinha().addComidasMenu("Macarrão");
        c1.getCozinha().addComidasMenu("Peixe");

        c1.mostrarDados();

    }
}