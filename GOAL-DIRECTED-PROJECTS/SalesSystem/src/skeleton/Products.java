package skeleton;

import java.util.Scanner;

public class Products {
    
	public static void main(String[] args) {
                    
               
                       
      Scanner scanner = new Scanner(System.in);
    
      
      System.out.println("Are you interested into laptops for games?  ");
      boolean games = scanner.nextBoolean();
      
      System.out.println("Are you interested into laptops for work?  ");
      boolean work = scanner.nextBoolean();
 //====================================================================================================//
      
             if (games) {
                System.out.println("We highly recommend you either the Alienware or the  Predator Series");
    	        System.out.println("For games that a modest hardware is enough, we highly recommend you the Nitro series");
             } else {
                 System.out.println("Check the laptops we have for labor activities");
            
            }	
     
             if (work) {
            	 System.out.println("We highly recommend you the" + "Macbook" + "series for design, editing and programming professionals");
            	 System.out.println("For jobs that require less creative skills, we suggest the" +  "GalaxyBook"  +  "Inspiron15"  + "and the Vivobook15 series");
                 System.out.println("Our store has a discount system based on the amount of items in your cart, the brand, and your membership status");
            
        }
//====================================================================================================//             
             System.out.println("Our store has a discount system that is based on the ammount of items on your cart, the correspoding brand and if you are a member of your subscription club");
             
             }
    		 }
	 


  
}

	}

}

