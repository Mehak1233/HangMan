
public class HangmanGraph {
	        
	     private int chances;
          public HangmanGraph(int chances)//1
          {   this.chances = chances;//1
          
          switch(chances) 
          {
               case 9: 
                  {     System.out.println("*************");
                		                             
        	            
        	            break;
                  }
               case 8:
               {
            	        System.out.println("          |\n"
                                          +"          |\n"
                                          +"          |\n"
                                          +"          |\n"
                                          +"          |\n"
                                          +"*************");  
            	        break;
               }
               case 7:
               {
            	   System.out.println("     +****+\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"*************");  
            	   break;
               }
               case 6:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"*************");  
            	   break;
               }
               case 5:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"*************");  
            	   break;
               }
               case 4:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"     |    |\n"
                                     +"          |\n"
                                     +"          |\n"
                                     +"*************");  
            	   break;
               }
               case 3:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"     |    |\n"
                                     +"    /     |\n"
                                     +"          |\n"
                                     +"*************");  
            	    break;
               }
               case 2:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"     |    |\n"
                                     +"    / \\   |\n"
                                     +"          |\n"
                                     +"*************"); 
            	   break;
               }
               case 1:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"    /|    |\n"
                                     +"    / \\   |\n"
                                     +"          |\n"
                                     +"*************");
            	   break;
               }
               case 0:
               {
            	   System.out.println("     +****+\n"
                                     +"     |    |\n"
                                     +"     O    |\n"
                                     +"    /|\\   |\n"
                                     +"    / \\   |\n"
                                     +"          |\n"
                                     +"*************");
            	   break;
               }
          }
          
     }
    }    	  