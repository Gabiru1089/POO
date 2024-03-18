public class Main {
    public static void main(String[] args) {

    Pessoa p1 = new Pessoa();
    Endereco e1 = new Endereco();

    p1.setEmail("luccafabricio@gmail.com");
    p1.setCpf("111.111.111-32");
    p1.setNome("Luccca");
    p1.setIdade(18);
    e1.setCep("80730-92");
    e1.setRua("Francisco Rocha");
    e1.setNumero(1233);
    p1.setEndereco(e1);

    p1.mostrarInformacoes();

    }
}