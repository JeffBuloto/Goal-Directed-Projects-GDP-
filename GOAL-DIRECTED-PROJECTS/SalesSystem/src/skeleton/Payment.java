import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.util.Map;

    public class Payment {

     
      public Payment() {
         //Definiçóes da tela de pagamento//
         Jframe frame = new Jframe("Minha janela de pagamentos");
         frame.setSize(400, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null); //
         frame.setVisible(true);
        }
    }

       public class Catalog() {
          //Exibição dos notebooks da loja
          Jframe frame = new Jframe("Produtos a venda: 
                                        MacBook, 10000.0
                                        GalaxyBook, 4000.0
                                        AcerNitro, 2500.0                 
                                        AlienWare, 9000.0  
                                        Vivobook, 2000.0
                                        Lenovo, 1500.0 ")
          );
          frame.setSize(600, 500);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLocationRelativeTo(null); //
          frame.setVisible(true);
    
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            @Override
            public void() {
                new Payment
            }
     
                
             //CATALOG.put("MacBook", 10000.0);
             //CATALOG.put("GalaxyBook", 4000.0);
             //CATALOG.put("AcerNitro", 2500.0);
             //CATALOG.put("AlienWare", 9000.0);
             //CATALOG.put("Vivobook", 2000.0);
             //CATALOG.put("Lenovo", 1500.0);//
    }
	     
            
            

       // double cartTotal = buildCart(scanner) {
	//	String paymenMethod = choosePaymentMethod(scanner);

		
		//double discount = calculateDiscount(cartTotal);
       // double finalTotal = cartTotal - (cartTotal * discount);
 
        System.out.println("\n=====Seu carrinho=====");
        System.out.printf("Subtotal: R$ %.2f%n", cartTotal);
        System.out.printf("Desconto aplicado: %.0f%%%n", discount * 100);
        System.out.printf("Forma de pagamento: %s%n", paymentMethod);
        System.out.printf("Total a pagar: R$ %.2f%n", finalTotal);
 
        scanner.close();
    }
 //SELECAO E VERIFICACAO DE PRODUTO(S)//
    private static double buildCart() {
        int items = readPositiveInt();
 
        double total = 0;
        int i = 1;
        while (i <= items) {
           String productName = JOptionPane.showInputDialog(
            null,
                   
            "Item" + i + " de " + items
                       + "\nProdutos disponíveis: " +  CATALOG.keySet(),
            "Seleção de produtos",
            JOptionPane.QUESTION_MESSAGE);
        
        //Caso o usuário cancele a operação de criar o carrinho ou feche a janela
            if (price == null) {
                JOptionPane.showMessageDialog(null, "Compra cancelada. ");
                return total;
        
           }
 
           productName = productName.trim();
           Double price = CATALOG.get(productName);
        
           if (price == null) {
               JOptionPane.showMessageDialog(
               null,
               "Produto inexistente. Por favor, tente novamente",
               "Erro na busca",
               JOptionPane.ERROR_MESSAGE);
            continue;
        
        }
            total += price;
            i++;
        }
        return total;
}


//LISTA CLICAVEL PARA ESCOLHA DO METODO DE PAGAMENTO//
   
	 
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
			JOptSionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			labels
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
 
    
    
  




	
