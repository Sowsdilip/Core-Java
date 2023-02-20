package madslibrary;

import java.util.ArrayList;

public class User {
	
	String userId;
	
	String userName;
	
	ArrayList<String> books = new ArrayList<>();

	public void setValues(String id, String name) {
   
		 userId = id;
		 
		 userName = name;
		 
	}
	
	public String getUserName() {
		
		return this.userName;
		
	}
	
	public String getUserId(){
		
		return this.userId;
		
	}
	
	public ArrayList<String> getUserBooks() {	
		
		return this.books;
		
	}

	public int getUserBooksQuantity() {
		
	   return books.size();
	}

	public void addUserBook(String bname) {
		
		books.add(bname);
	}

	public void removeUserBook(String bname) {
		
		books.remove(bname);
	}
	
	
	

}
