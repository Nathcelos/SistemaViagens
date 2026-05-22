public class venda {
    private final String nomeCliente;
    private final String formaPagamento;
    private final pacoteViagem pacote;

    public venda(String nomeCliente, String formaPagamento, pacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public pacoteViagem getPacote() {
        return pacote;
    }
}
