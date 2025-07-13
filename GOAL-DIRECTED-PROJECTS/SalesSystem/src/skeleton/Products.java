package skeleton;

public class Products {

	public static void main(String[] args) {

	        String Macbook;
		String GalaxyBook;
		String Inspiron15;
		String VivoBook16;
		String Alienware;
                String Predator;
        
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.println("Are you interested into laptops for gaming?");
      Scanner gaming = scanner.reset();
      
      System.out.println("Are you interested into laptops for work?");
      Scanner work = scanner.reset();
 //====================================================================================================//
      
     boolean Gaming = true;
    		 if (Gaming) {
    			 System.out.println("We highly recommend you either the" + Alienware + "or the" +  Predator  + "Series");
    	} else {
    		System.out.println("Please select another laptop cathegory option");
    		
     boolean Work = true;
             if (Work) {
            	 System.out.println("We highly recommend you the" + Macbook + "series for design, editing and programming professionals");
            	 System.out.println("For jobs that require less creative skills, we suggest the" +  GalaxyBook  +  Inspiron15  + "and the Vivobook15 series");
    
//====================================================================================================//             
             System.out.println("Our store has a discount system that is based on the ammount of items on your cart, the correspoding brand and if you are a member of your subscription club");
             
             }
    		 }
	}

}

	}

}
