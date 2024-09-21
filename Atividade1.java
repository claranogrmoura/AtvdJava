import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // dados
            System.out.print("Digite o valor total da fatura: ");
            double valorTotal = scanner.nextDouble();
            
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            
            System.out.print("Digite o percentual de desconto por pagamento antecipado (em %): ");
            double percentualDesconto = scanner.nextDouble();
            
            System.out.print("Digite o percentual de multa por atraso (em %): ");
            double percentualMulta = scanner.nextDouble();
            
            // vt com desconto
            double desconto = (percentualDesconto / 100) * valorTotal;
            double valorTotalComDesconto = valorTotal - desconto;
            
            // valor parcela 
            double valorParcela = valorTotalComDesconto / numeroParcelas;
            
            // multa
            double multaPorParcela = (percentualMulta / 100) * valorParcela;
            
            // mensagem final 
            System.out.printf("Valor total com desconto para pagamento antecipado: %.2f\n", valorTotalComDesconto);
            System.out.printf("Valor de cada parcela com multa (R$ %.2f de multa): %.2f\n", multaPorParcela, valorParcela + multaPorParcela);
        //Fim
        
        }
    }
}
