package MadsLibrary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Employee implements Serializable{
	
	static final long serialVersionUID = -8594647420719863894L;

	Map<String,Object> book = new HashMap<>();
	
	Map<String,Object> user = new HashMap<>();
	
	
    int id=1000;
    
	void addBook(String name,int quantity) {
		
		Book b1 = new Book();
		  	
    	b1.setValues(id,name,quantity);
    	
	    book.put(name,b1);
	    
	    id++;
	    
	 }   
	
    void showBooks() {    	
    	
    	System.out.println("Id"+'\t'+"BookName"+'\t'+"Quantity");
    	
    	for(String name : book.keySet()) {
    		
    		Book b1 = (Book)book.get(name);
    		
    	 	System.out.print(b1.getId());
    	 	System.out.print('\t'+b1.getName()+'\t'+'\t'+b1.getBookQuanity()+'\n');
    	 	
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
		
		String[]books = u.getBooks();
		
		if(b2.getBookQuanity()>0)
		  {	
			b2.decreaseBookQuantity();
			
		  }	
		
		if(books.length<4)
			for(int i=0;i<=3;i++)
				if(books[i] != null)
					books[i]=uname;
		
		}

	public void returnBook(String uname,String bname) {
		
        Book b2 = (Book)book.get(bname);
        
        b2.increaseBookQuantity();
		
		User u = (User)user.get(uname);
		
		String[]books = u.getBooks();
		
		for(int i=0;i<=3;i++)
			if(books[i].equals(uname))
				books[i]=null;
		
	}
	
   public Object deSerializeBook() {
		
		Employee e= new Employee();
		
		try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream("library.ser")))){
			  
    	    e = (Employee) in.readObject();
	     }
	    catch(IOException | ClassNotFoundException io) {
		
	    	io.printStackTrace();
	     }
	  
		return e;
	
	}
		

    public void serializeBook() {
	
	
	   Employee e = new Employee();
        
	   try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("library.ser")))){
	  
		out.writeObject(e);
        }
       catch(IOException io) {
	
    	io.printStackTrace();
       }
	
     }

}


	 
