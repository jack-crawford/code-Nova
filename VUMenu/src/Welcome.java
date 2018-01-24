import java.util.*;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input;
		System.out.println("Welcome to the jungle (aka the something menu system)");
		System.out.println("––––––––––––––––––––––-\n");
		System.out.println("[1] push an element");
		System.out.println("[2] pop an element");
		System.out.println("[3] place an element on top");
		System.out.println("[4] clear the stack");
		System.out.println("[5] print the stack");
		System.out.println("[0] quit");
		
		Stack letters = new Stack();
		
		Stack temp = new Stack();
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter your choice: ");
			input = (char) scan.next().charAt(0);
			switch (input) {
				case '1': 
					System.out.print("Enter a letter to push: ");
					letters.push(scan.next().charAt(0));
					break;
				case '2': 
					letters.pop();
					System.out.println("popped!"); 
					break;
				case '3': 
					System.out.println("The top element is: "+ letters.peek());
					break;
				case '4': 
					letters.clear();
					System.out.println("cleared!"); 
					break;
				case '5': 
					System.out.println(letters);
					temp.addAll(letters);
					//temp = letters will not duplicate the stack but just add an alias
					while (!temp.empty()) {
						System.out.println(temp.peek());
						temp.pop();
					}
					break;
				case '0': 
					System.out.println("quit"); 
					break;
				default: 
					System.out.println("weird!"); 
					break;
			}
		
			
		} while (input != '0');
	}

}
