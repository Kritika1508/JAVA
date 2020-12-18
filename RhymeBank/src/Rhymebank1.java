import java.util.Scanner;
public class Rhymebank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bank Admin Menu:");
		System.out.println("*Please enter a menu option*");
		System.out.println("(1): add customer");
		System.out.println("(2):Check customer name");
		System.out.println("(3): check account balance");
		System.out.println("(4):Modify account balance");
		System.out.println("(5): summary of all accounts");
		System.out.println("(-1)Quit:");
		
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		int size=0;
		double [] balance = new double[250];
		String[] name = new String[250];
		
		
		
		if(userinput == 1) {
		System.out.println("bank add customer menu:");
		System.out.println("plz enter account balance...");
		double openbalance = input.nextDouble();
		balance[size]= openbalance;
		System.out.println("enter name...");
		input.hasNextLine();
		String aname= input.nextLine();
		name[size]=aname;
		System.out.println("customer id =" + size);
		size+=size;
		}
		else if(userinput == 2) {
			System.out.println("bank add customer menu:");
			System.out.println("plz enter a customer ID to change name...");
			int index = input.nextInt();
			System.out.println("enter new name...");
			input.nextLine();
			name[index] = input.nextLine();
		}
		else if(userinput == 3) {
			System.out.println("bank add customer menu:");
			System.out.println("plz enter a customer ID for balance...");
			int index = input.nextInt();
			double openbalance= balance[index]; 
			System.out.println("this customer has " + openbalance + " in their account");
		
	
}
		else if(userinput == 4) {
			System.out.println("bank add customer menu:");
			System.out.println("plz enter a customer ID to modify  balance...");
			int index = input.nextInt();
			System.out.println("plz input new balance...");
			balance[index]= input.nextDouble(); 
		
	
	
}
		else if(userinput == 5) {
			
			double total=0;
			for(int i=0;i<size;i++) {
				total = total + balance[i];
				System.out.println(name[i]+"has " + balance[i]+"in his account");
			}
			System.out.println("total is=" +total);
}
		else if(userinput == -1) {
	     System.exit(0);
}
		else {
	System.out.println("invalid input");
		}
	}

}
