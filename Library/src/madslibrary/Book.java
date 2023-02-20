package madslibrary;

public class Book {
	
	String bookName;
	
    public int bookQuantity=0;
	
	int bookId;
	
	void setValues(int newId,String newBookName,int newQuantity){
		
		bookId = newId;
		
		bookName = newBookName;
		
		bookQuantity = newQuantity;
		
	}
	
	
	int getBookQuanity() {
		
	   return this.bookQuantity;	   
		
	}


	public int getBookId() {
		
		return this.bookId ;
	}


	public String getBookName() {
	
		return this.bookName;
	}


	public void decreaseBookQuantity() {
	  this.bookQuantity--;
		
	}
	
	public void increaseBookQuantity() {
		  this.bookQuantity++;
			
		}
	
	 
    
}  
    
    
    
  
	