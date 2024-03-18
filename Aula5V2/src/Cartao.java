public class Cartao
{
    private int nroCartao;
    private int codigo;
    private String validade;

    public Cartao(int nroCartao, int codigo, String validade)
    {
        this.nroCartao = nroCartao;
        this.codigo = codigo;
        this.validade = validade;
    }

    public int getNroCartao() {
        return this.nroCartao;
    }

    public int getCodigo()
    {
        return this.codigo;
    }

    public String getValidade()
    {
        return this.validade;
    }

    public void setNroCartao(int nroCartao)
    {
        this.nroCartao = nroCartao;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public void setValidade(String validade)
    {
        this.validade = validade;
    }
}