package madslibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LibraryDao {

	public Map<String, Object> loadBookFromFile() {
		
		Map<String,Object> book = new HashMap<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("books.txt"))){
			
			do {
		    Book b1 = new Book();
			String bookdetail = reader.readLine();
			if(bookdetail!=null) {
			String[] words = bookdetail.split(",");
			book.put(words[0],b1);
			b1.setValues(Integer.parseInt(words[1]),words[0],Integer.parseInt(words[2]));
			}
			else break;
			}while(reader.readLine()!=null);
			
		}catch(IOException e ){
			System.out.println("File not found ...");
		}
		
		return book;
		
	}

	public Map<String,Object> loadUserFromFile() {
		

		Map<String,Object> users = new HashMap<>();
		
		
         try(BufferedReader reader = new BufferedReader(new FileReader("users.txt"))){
			
			do {
		        User u1 = new User();
		     	String userdetail = reader.readLine();
			
		     	if(userdetail!=null) {
		     		
		      	   String[] words = userdetail.split(",");
			       users.put(words[0],u1);
			       u1.setValues(words[1],words[0]);
			       try(BufferedReader reader1 = new BufferedReader(new FileReader("userbooks.txt"))){
		            	do {				    
				             String booknames=reader1.readLine();
				             if(booknames!=null) {
					         String[] words1 = booknames.split(",");
				        	 for(String word : words1) 
						         u1.addUserBook(word); 
					         }else break;
					     }while(reader.readLine()!=null);
					
				    }catch(IOException e ){
					System.out.println("File not found ...");
				    }
			       
			     }else break;
			
			 }while(reader.readLine()!=null);
			
	    }catch(IOException e ){
			System.out.println("File not found ...");
		}
		   
		return users;
	}

	
	public void updateBooksToFile(Map<String, Object> book) {
		
		 try(BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt"))) {	
			 
			 writer.flush();
				
			 for(String name : book.keySet()) {
		    		
	    	     Book b1 = (Book)book.get(name);
				 writer.write(b1.getBookName());
				 writer.write(",");
				 writer.write(String.valueOf(b1.getBookId()));
				 writer.write(",");
				 writer.write(String.valueOf(b1.getBookQuanity()));
				 writer.write('\n');
				
			 }
			
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File doesn't exist...");
			}
	}
	
	public void updateUsersToFile(Map<String, Object> user) {
		// TODO Auto-generated method stub
		 try(BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"))) {		
			 
			   writer.flush();
				
			 for(String name : user.keySet()) {
		    		
	    	     User u1 = (User)user.get(name);
				 writer.write(u1.getUserName());
				 writer.write(",");
				 writer.write(u1.getUserId());	
				 writer.write('\n');
				
			 }
			
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File doesn't exist...");
			}
	}
	
	public void updateUserBooksToFile(Map<String, Object> user) {
		// TODO Auto-generated method stub
		 try(BufferedWriter writer = new BufferedWriter(new FileWriter("userbooks.txt"))) {		
			 
			   writer.flush();
				
			 for(String name : user.keySet()) {
		    		
	    	     User u1 = (User)user.get(name);
				 writer.write(u1.getUserName());
			
				 
				 for(String bookname : u1.getUserBooks()) {
					 
					if(bookname!=null)
					{
					 writer.write(",");
					 writer.write(bookname);
					}
					else writer.write('\n');
					
				 }
				 
				 writer.write('\n');
				
			 }
			
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File doesn't exist...");
			}
	}

	
}
