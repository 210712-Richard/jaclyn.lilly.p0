
public class VariableExample {
	int myVariable; 
	static int data=30;
	
	public static void main(String[] args) {
		 VariableExample obj= new VariableExample(); 
		 
		 System.out.println("Value of instance variable= "+ obj.myVariable);
		 System.out.println("Value of static variable= "+ VariableExample.data);

	}

}
