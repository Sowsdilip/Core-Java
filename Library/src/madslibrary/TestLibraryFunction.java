package madslibrary;

public class TestLibraryFunction {
	
   public static void main(String args[]) {
	 
         Display d = new Display();
       
         int i=10;
      
         while(i!=0){
    	             try {
    	            	 
    	                   i = d.displaySelection();
    	              
    	             
    	             switch(i){
    	    	                case 1 :
    	    	                         d.selectOne();
    	    	         	    	     break;
    		  
    		                    case 2 :
    			                          d.selectTwo();
    			 	      			      break;
    			       
    		                    case 3 :
    			          			     d.selectThree();
                                         break;
    			       
    		                    case 4 :
    			           			      d.selectFour();
    			                          break;
    			       
    		                    case 5 :
    			           			      d.selectFive();
    		     			              break;
    		     			              
    		                    case 6 :
    		                    	      d.selectSix();
    			       
    		                    case 0 :
      			                          d.updateFile();
    		                    	      break;
    		  
    		                    default :
                                         System.out.println(" !!! Please enter valid number ");
                                         break;
    			                
    	                 }	
    	             }catch (NumberFormatException e) {
    	            	 System.out.println(" !!! Please enter valid input ");
   	                }
 	  	  
    	         }
   	     }

}


