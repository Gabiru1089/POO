public class ContaBancaria {
    private int nroConta;
    private String agencia;
    private Cartao cartao;
    private Pessoa cliente;

    public ContaBancaria(int nroConta, String agencia, Cartao cartao, Pessoa cliente) {
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.cartao = cartao;
        this.cliente = cliente;
    }

    public int getNroConta() {
        return this.nroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public Cartao getCartao() {
        return this.cartao;
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void mostarTodasInformacoes()
    {
        System.out.printf("E-mail: %s CPF: %s Nome: %s Idade: %d CEP: %s Rua: %s Número: %d ",
                this.cliente.getEmail(), this.cliente.getCpf(), this.cliente.getNome(), this.cliente.getIdade(), this.cliente.getEndereco().getCep(), this.cliente.getEndereco().getRua(), this.cliente.getEndereco().getNumero());
        System.out.printf("Número da Conta: %d Agência: %s Número do Cartão: %d Código do Cartão: %d Validade do Cartão: %s\n",
                this.nroConta, this.agencia, this.cartao.getNroCartao(), this.cartao.getCodigo(), this.cartao.getValidade());
    }
}

