public class Casa {
    String cep;
    int numero;
    String complemento;
    float metragem;
    String cor;
    float Largura;
    float comprimento;
    int numeroAndar;

    public float calcMetragem(){
        metragem = Largura * comprimento * numeroAndar;
        return metragem;
    };

}
