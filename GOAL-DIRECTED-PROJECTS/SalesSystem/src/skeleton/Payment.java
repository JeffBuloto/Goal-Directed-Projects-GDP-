import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		
		int MacBook = 10000;
                int GalaxyBook = 4000;
                int AcerNitro = 2500;
                int AlienWare = 9000;
                int Vivobook = 2000;
                int Lenovo = 1500;
               
                String Paypal;
                String BitCoin;
                String ApplePay;
                String GooglePay;  
                String CreditCard;
                
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many tech items would you like to buy?  ");
        int items = scanner.nextInt();
        
        System.out.println("Which tech items would like to buy");
        boolean options = scanner.nextBoolean();
        
        System.out.println("Which payment method would you like to use?  ");
        String payment = scanner.nextStr();
       
//=============================================================================//
        System.out.println("Type 1 for PayPal: ");
        System.out.println("Type 2 for  BitCoin: ");
        System.out.println("Type 3 for  ApplePay: ");
        System.out.println("Type 4 for  GooglePay: ");
        System.out.println("Type 5 for CreditCard: ");
        
        if (MacBook + GalaxyBook >= 16000) {
            System.out.println("Congratulations! You got 60% off on your purchase");
           } else {
            System.out.println("Add more itens to your cart to get 60% on your purchase");
            
        if (AcerNitro + AlienWare >= 12000) {
            System.out.println("Congratulations! You got 50% off on your purchase");
            } else {
            System.out.println("Add more itens to your cart to get 50% on your purchase");
        
        if (Vivobook + Lenovo >= 5000 ) { 
            System.out.println("Congratulations! You got 30% off on your purchase");
            } else {
            System.out.println("Add more itens to your cart to get 30% on your purchase");
            
        if (GalaxyBook + Vivobook >= 8000) {
            System.out.println("Congratulations! You got 40% off on your purchase");
            } else {
            System.out.println("Add more itens to your cart to get 30% on your purchase");   
        }
        }
        }
        }
        
//=============================================================================//

        System.out.println("The total is: ");
       
		

	}

}

