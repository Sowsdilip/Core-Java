package madslibrary;

import java.util.Scanner;

public class Display {
	
	Scanner in = new Scanner(System.in);
	
	Employee emp = new Employee();
	
	int i;
	
	String bname;
	
	String uname;
	
	int quantity;
	
	Display(){
	    emp.loadBooks();
	    emp.loadUsers();
	    emp.loadUserBooks();
	}
	
	public int displaySelection() throws NumberFormatException {
		
	  System.out.println("Press 1 to show all books");
 	   
  	  System.out.println("Press 2 to add a new book");
  	  
  	  System.out.println("Press 3 to add a new User");
  	  
  	  System.out.println("Press 4 to issue a book");
  	  
  	  System.out.println("Press 5 to return a book");
  	  
  	  System.out.println("Press 6 to books issued to user");
  	  
  	  System.out.println("Press 0 to exit...");
  	
  	  i=Integer.parseInt(in.nextLine());
	
  	  return i;
	}

	public void selectOne() {
		
		System.out.println("Books Available...");	    	  
	       
	       emp.showBooks();
		
	}

	public void selectTwo() {
		
		   System.out.println("Add Book Details...");
	       
	       System.out.println("Enter Book Name..  ");
	            
	       bname = in.nextLine();
	       
	       try {
	       
	           if(!(emp.bookExists(bname))){
	    	   
	    	       System.out.println("Enter Book Quantity..  ");
	 	           quantity = Integer.parseInt(in.nextLine());	
                   emp.addBook(bname,quantity);
                }
	           else throw new Exception();
	      }	catch(Exception e){
	    	  System.out.println("!!! Book  "+bname+"  already Exists");
	      }       
	       	       
	}
	
	public void selectThree() {
		
		   System.out.println("Enter User Name..  ");
	            			       
	       uname=in.nextLine();
	  
	       emp.addUser(uname);	       
		
	}

	public void selectFour() {
		
		System.out.println("Enter User Name..  "); 
	          
        uname = in.nextLine();
        
        System.out.println("Enter Book Name..  ");    			       
        
        bname = in.nextLine();
        
	    emp.issueBook(bname,uname);
		
	}

	public void selectFive() {

		System.out.println("Enter User Name..  ");
     
	    uname = in.nextLine();
	       
	    System.out.println("Enter Book Name..  ");
	       	               
        bname = in.nextLine();
        
	    emp.returnBook(uname,bname);
		
	}

	public void selectSix() {
		
		System.out.println("Enter User Name..  ");
		
		uname = in.nextLine();
		
	    System.out.print("The books issued to user  "+uname+"  ...");
	
		emp.showUserBooks(uname);
		
		System.out.println();
	}

	public void updateFile() {
		// TODO Auto-generated method stub
		emp.updateBooksFile();
		emp.updateUsersFile();
		emp.UpdateUserBooksFile();
	}
	

}
