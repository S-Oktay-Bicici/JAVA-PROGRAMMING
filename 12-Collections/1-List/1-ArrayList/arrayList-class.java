

	public class Customer{
		
		int id;
		String firstName;
		String lastName;
		
		public Customer(){
		
		}
		
		public Customer(int id, String firstName, String lastName){
			this.id = id;
			this.firsName = firsName;
			this.lastName = lastName;
		}
	}
	
import java.util.ArrayList;
	
	public class Main{
		public static void main(String[] args){
			
			ArrayList<Customer> customer = new ArrayList<Customer>();
			
			customer.add(new Customer(1,"Sadık Oktay","Biçici");
			customer.add(new Customer(2,"Oktay Sadık","Biçici");
			customer.add(new Customer(1,"Sadık","Biçici");
			customer.add(new Customer(2,"Oktay","Biçici");
			
			for(Customer customer:customer){
				System.out.println(customer.firsName);
			}
		}
	}