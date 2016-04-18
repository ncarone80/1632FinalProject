import java.util.Scanner;

public class InventoryFlow {
	static Meat meat = new Meat();
	static Paper paper = new Paper();
	static Tires tires = new Tires();
	
	public static void main (String [] args){
		Scanner reader = new Scanner(System.in);
		//User Interface
		while(true)
		{
			
			System.out.println(""
					+ "------------------------------------------------------\n"
					+ "Welcome to the Inventory Management System. Select how you \n"
					+ "would like to interact with the system:\n"
					+ "------------------------------------------------------");
			System.out.println(""
					+ "1 - \tAdd Meat to inventory\n"
					+ "2 - \tAdd Paper to inventory\n"
					+ "3 - \tAdd tires to inventory\n"
					+ "4 - \tCheck Stock\n"
					+ "5 - \tChange Location of inventory\n"
					+ "6 - \tExit System");
			System.out.print("Enter Number: ");
			
			
			int n = reader.nextInt();
			switch (n) 
			{
				case 1:
					addMeat();
					break;
				case 2:
					addPaper();
					break;
				case 3:
					addTires();
					break;
				case 4:
					checkStock();
					break;
				case 5:
					changeLocation();
					break;
				case 6:
					System.out.println("Closing System.");
					System.exit(0);
				default:
					System.out.println("Please Enter A Correct Value");
			}
		}
		
	}
	private static void addPaper() {
		// TODO Auto-generated method stub
		
	}
	private static void addTires() {
		// TODO Auto-generated method stub
		
	}
	private static void checkStock() {
		Scanner read = new Scanner(System.in);
		System.out.print("Please enter name of stock to check (meat, paper, or tires): ");
		String input = read.nextLine();
		String cleanInput = input.toLowerCase();
		if (cleanInput.equals("meat")){
			int quantity = meat.getQuantity();
			System.out.println("Current quantity of Meat is: " + quantity + ".");
		}
		else if (cleanInput.equals("paper")){
			int quantity = paper.getQuantity();
			System.out.println("Current quantity of Paper is: " + quantity + ".");
		}
		else if (cleanInput.equals("tires")){
			int quantity = tires.getQuantity();
			System.out.println("Current quantity of Tires is: " + quantity + ".");
		}
	}
	private static void changeLocation() {
		// TODO Auto-generated method stub
		
	}
	public static void addMeat(){
		Scanner read = new Scanner(System.in);
		int upc = meat.getUPC();
		if (upc == 0){
			System.out.println("System has no UPC for Meat yet");
			System.out.print("Please enter UPC for Meat: ");
			int newUpc = read.nextInt();
			meat.setUPC(newUpc);
			System.out.print("Please insert quantity for Meat: ");
			int q = read.nextInt();
			meat.setQuantity(q);
			System.out.println("Meat successfully added!");
		}
		else{
			System.out.print("Please insert quantity for Meat: ");
			int newQuantity = read.nextInt();
			int current = meat.getQuantity();
			int total = newQuantity + current;
			meat.setQuantity(total);
			System.out.println("Meat successfully added!");
		}
		
	}
}
