import java.util.HashMao;
import java.util.Map;
import javax.swing.*;

 public class Payment {


            private static final Map<String, Double> CATALOG = new HashMap<>();
            static{
		    CATALOG.put("MacBook", 10000.0);
            CATALOG.put("GalaxyBook", 4000.0);
            CATALOG.put("AcerNitro", 2500.0);
            CATALOG.put("AlienWare", 9000.0);
            CATALOG.put("Vivobook", 2000.0);
            CATALOG.put("Lenovo", 1500.0);
    }
 
	      
	//IMPRESSÃO DOS DADOS FISCAIS DA COMPRA REALIZADA ONLINE//
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        double cartTotal = buildCart(scanner) {
		String paymenMethod = choosePaymentMethod(scanner);

		
		double discount = calculateDiscount(cartTotal);
        double finalTotal = cartTotal - (cartTotal * discount);
 
        System.out.println("\n=====Seu carrinho=====");
        System.out.printf("Subtotal: R$ %.2f%n", cartTotal);
        System.out.printf("Desconto aplicado: %.0f%%%n", discount * 100);
        System.out.printf("Forma de pagamento: %s%n", paymentMethod);
        System.out.printf("Total a pagar: R$ %.2f%n", finalTotal);
 
        scanner.close();
    }
 //SELECAO E VERIFICACAO DE PRODUTO(S)//
    private static double buildCart(Scanner scanner) {
        System.out.println("Quais produtos você deseja comprar? ");
        int items = readPositiveInt(scanner);
 
        double total = 0;
        int i = 1;
        while (i <= items) {
            System.out.println("Item " + i + " de " + items
                    + " - Produtos disponíveis: " + CATALOG.keySet());
            String productName = scanner.next();
            Double price = CATALOG.get(productName);
 
            if (price == null) {
                System.out.println("Produto não encontrado. Tente novamente.");
                continue; 
            }
 
            total += price;
            i++;
        }
        return total;
    }

//LISTA CLICAVEL PARA ESCOLHA DO METODO DE PAGAMENTO//

	 JList<PaymentMethod> list = new JList<>(PaymentMethod.values());
	 list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     list.setSelectedIndex(0);

  int result = JOptionPane.showConfirmDialog(
	  null, new JScrollPane(list), "Forma de Pagamento",
	  JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

  if (result == JOptionPane.OK_OPTION) (
	  PaymentMethod chosen = list.getSelectedValue();

	 
    //INTERFACE GRAFICA PARA ESCOLHA DE FORMA DE PAGAMENTO PELO USUARIO//
    private static PaymentMethod choosePaymentMethod{
		PaymentMethod[] methods = PaymentMethod.values[].
		String[] labels = java.util.Arrays.stream(methods)
		         .map(PaymentMethod::getDisplayName)
			     .toArray(String::new);

		int choice = JOptionPane.showOptionDialog(
			null,
			"Escolha a forma de pagamento",
			"Pagamento",
			JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			labels,
			labels[0]);

		return choice == JOptionPane.CLOSED_OPTION ? null : methods[choice];

	}

// EXIBICAO DAS OPCOES DE PAGEMENTO
		while (true) {
			System.out.println("\n=== Forma de pagamento ===");
			for(int i= 0; i < methods.length; i++) {
				System.out.printf("%d) %s%n", i + 1, methods[i].getDisplayName());

			}
			System.out.println("Selecione uma opção: Cartão de crédito, ApplePay, GooglePay, Bitcoin, Ethereum.")
 
		//TROCA DE METODO EM CASO DE ERRO NO PAGAMENTO VIA BITCOIN//
				boolean aceitaBitcoin= true;

			  if (aceitaBitcoin) = true;
				    System.out.println("SUA COMPRA FOI REALIZADA! Seu pedido chegará em até 15 dias"
									   
					} else {				   
                System.out.println("TRANSAÇÃO NÃO ACEITA: Por questões de segurança, solicitamos que selecione cartão de crédito como forma de pagamento..");
                return "CreditCard";
				
				
				
        }
    }
 
   //CALCULAR O VALOR DA COMPRA COM A APLICACAO DO DESCONTO//
    private static double calculateDiscount(double total) {
        if (total >= 16000) return 0.60;
        if (total >= 12000) return 0.50;
        if (total >= 8000)  return 0.40;
        if (total >= 5000)  return 0.30;
		default:
			System.out.println("Você adquiriu um desconto de"  + 0.0)
        return 0.0;
    }

	 
//PRA QUE SERVE ISSO?????????????????// 
    private static int readPositiveInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Digite um número válido:   ");
             scanner.next();
        }
        return scanner.nextInt();
    }
}
