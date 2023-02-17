package MadsLibrary;

public class User {
	
	String userId;
	
	String userName;
	
	String[] books = new String[4];

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
	
	public String[] getBooks() {
		
		return this.books;
		
	}
	
	
	

}
