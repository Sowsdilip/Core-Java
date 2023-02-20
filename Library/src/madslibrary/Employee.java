package madslibrary;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee {

	Map<String,Object> book = new HashMap<>();
	
	Map<String,Object> user = new HashMap<>();
	
	LibraryDao dao = new LibraryDao();
	
	
		
    int id=1001;
    
	void addBook(String name,int quantity) {
		
		
		
		Book b1 = new Book();
			
	    b1.setValues(id,name,quantity);
    	
	    book.put(name,b1);
	    
	    id++;
	    
	    System.out.println("Book  "+ name + "  Added");
	    
	 }   
	
    void showBooks() {    	
    	
    	    System.out.println("Id"+'\t'+"BookName"+'\t'+"Quantity");
    	 
    	    for(String name : book.keySet()) {
    		
    		    Book b1 = (Book)book.get(name);
    		
    	     	System.out.print(b1.getBookId());
    	   	
    	     	System.out.print('\t'+b1.getBookName()+'\t'+'\t'+b1.getBookQuanity()+'\n');
    	 	
    	    }  
  	}	
	
    public void addUser(String name) {
    	
             User u1 = new User();
    	
    	    String uid = name+id;
    	
    	    u1.setValues(uid,name);  
    	
    	    user.put(name, u1);
		
	}

	public void issueBook(String bname,String uname) {
		
		Book b2 = (Book)book.get(bname);
		
		User u = (User)user.get(uname);
		
		//ArrayList<String> books = u.getBooks();
		
		try {
		
		   if(b2.getBookQuanity()>0)
			b2.decreaseBookQuantity();
		   
		   else throw new Exception();
		
		    }catch(Exception e) {
		      System.out.println("!!! Requested Book Not Available....");
		     }
		
		try {
			
			   if((u.getUserBooksQuantity())>3)
				   throw new Exception();
				
			   else 
				  u.addUserBook(bname); 
				 
			
			 }catch(Exception e) {
			    System.out.println("!!!Only 4 Books can be issued....");
			  }
		
	}

	public void returnBook(String uname,String bname) {
		
        Book b2 = (Book)book.get(bname);
        
        b2.increaseBookQuantity();
		
		User u = (User)user.get(uname);
		
		u.removeUserBook(bname);
		
	}

	public boolean bookExists(String name) {
		
		return book.containsKey(name);
		

		
	}

	public void showUserBooks(String uname) {
		
		ArrayList<String> books = new ArrayList<>();
		
		User u = (User)user.get(uname);
		
		books = u.getUserBooks();
		
		for(String b:books) {
			 System.out.print(b+'\n');
		}
	}

	public void loadBooks() {
		// TODO Auto-generated method stub
		this.book = dao.loadBookFromFile();
		
	}

	public void loadUsers() {
		// TODO Auto-generated method stub
		this.user = dao.loadUserFromFile();
		
	}

	public void loadUserBooks() {
		
	//	dao.loadUserBookFromFile(user);
	}

	public void updateBooksFile() {
		dao.updateBooksToFile(book);
		
	}

	public void updateUsersFile() {
		dao.updateUsersToFile(user);
		
	}

	public void UpdateUserBooksFile() {
		dao.updateUserBooksToFile(user);
		
	}
	
 
}


	 
