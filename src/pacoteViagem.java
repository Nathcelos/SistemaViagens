public class pacoteViagem {
    private final transporte transporte;
    private final hospedagem hospedagem;
    private final String destino;
    private final int dias;
    private double margemLucro;

    public pacoteViagem(transporte transporte, hospedagem hospedagem, String destino, int dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }

    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiaria() * dias;
    }

    public double margemLucro (double valor, double margemLucro) {
        return valor + (valor * (margemLucro / 100));
    }

    public double calcularTotalPacote(double margemLuro, double taxasAdicionais) {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = calcularTotalHospedagem();
        double subtotal = totalTransporte + totalHospedagem;

        double subtotalComMargem = margemLucro(subtotal, margemLucro);

        return subtotalComMargem + taxasAdicionais;
    }

    public transporte getTransporte() {
        return transporte;
    }

    public hospedagem getHospedagem() {
        return hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }
}
