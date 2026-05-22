import java.util.Scanner;

public class sistemasViagens {

    public static void main(String[] args) {
        // === TRANSPORTE ===
        try (Scanner sc = new Scanner(System.in)) {
            // === TRANSPORTE ===
            System.out.println("=== Cadastro do Pacote de Viagem ===");
            
            System.out.print("Tipo de transporte (aéreo, rodoviário, marítimo, outro): ");
            String tipoTransporte = sc.nextLine();
            
            System.out.print("Valor do transporte (em dólar): ");
            double valorTransporte = sc.nextDouble();
            sc.nextLine();
            
            transporte transporte = new transporte(tipoTransporte, valorTransporte);
            
            // === HOSPEDAGEM ===
            System.out.print("Descrição da hospedagem: ");
            String descHospedagem = sc.nextLine();
            
            System.out.print("Valor da diária da hospedagem (em dólar): ");
            double valorDiaria = sc.nextDouble();
            
            hospedagem hospedagem = new hospedagem(descHospedagem, valorDiaria);
            
            // === PACOTE ===
            sc.nextLine();
            System.out.print("Destino da viagem: ");
            String destino = sc.nextLine();
            
            System.out.print("Quantidade de dias: ");
            int dias = sc.nextInt();
            
            pacoteViagem pacote = new pacoteViagem(transporte, hospedagem, destino, dias);
            
            System.out.print("Margem de lucro (%): ");
            double margem = sc.nextDouble();
            
            System.out.print("Taxas adicionais (em dólar): ");
            double taxas = sc.nextDouble();
            
            double totalDolar = pacote.calcularTotalPacote(margem, taxas);
            
            System.out.println("\n=== Pacote Criado ===");
            System.out.println("Destino: " + pacote.getDestino());
            System.out.println("Transporte: " + transporte.getTipo() + " - $" + transporte.getValor());
            System.out.println("Hospedagem: " + hospedagem.getDescricao() + " - $" + hospedagem.getValorDiaria() + "/dia");
            System.out.println("Total Hospedagem: $" + pacote.calcularTotalHospedagem());
            System.out.println("Total do Pacote (dólar): $" + totalDolar);
            
            // === VENDA ===
            sc.nextLine();
            System.out.println("\n=== Cadastro da Venda ===");
            System.out.print("Nome do cliente: ");
            String nomeCliente = sc.nextLine();
            
            System.out.print("Forma de pagamento: ");
            String formaPagamento = sc.nextLine();
            
            venda venda = new venda(nomeCliente, formaPagamento, pacote);
            
            System.out.print("Cotação do dólar (R$): ");
            double cotacao = sc.nextDouble();
            
            double totalReais = venda.converterParaReais(totalDolar, cotacao);
            
            System.out.println("\n=== Dados da Venda ===");
            System.out.println("Cliente: " + venda.getNomeCliente());
            System.out.println("Forma de Pagamento: " + venda.getFormaPagamento());
            System.out.println("Total do Pacote em dólar: $" + totalDolar);
            System.out.println("Total do Pacote em reais: R$" + totalReais);
        }
    }
}
