import java.util.Scanner;

public class InventoryFlow {
	Meat meat;
	Paper paper;
	Tires tires;
	
	public InventoryFlow() {
		meat = new Meat();
		paper = new Paper();
		tires = new Tires();
	}
	
	public InventoryFlow(Meat m, Paper p, Tires t){
		meat = m;
		paper = p;
		tires = t;
	}
	
	public static void main (String [] args){
		Scanner reader = new Scanner(System.in);
		InventoryFlow iFlow = new InventoryFlow();
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
					+ "3 - \tAdd Tires to inventory\n"
					+ "4 - \tCheck Stock\n"
					+ "5 - \tChange Location of inventory\n"
					+ "6 - \tExit System");
			System.out.print("Enter Number: ");
			
			
			int n = reader.nextInt();
			switch (n) 
			{
				case 1:
					int totalMeat = iFlow.addMeat();
					iFlow.meat.setQuantity(totalMeat); 
					System.out.println("Meat successfully added!");
					break;
				case 2:
					int totalPaper = iFlow.addPaper();
					iFlow.paper.setQuantity(totalPaper);
					System.out.println("Paper successfully added!");
					break;
				case 3:
					int totalTires = iFlow.addTires();
					iFlow.tires.setQuantity(totalTires);
					System.out.println("Tires successfully added!");
					break;
				case 4:
					iFlow.checkStock();
					break;
				case 5:
					iFlow.changeLocation();
					break;
				case 6:
					System.out.println("Closing System.");
					System.exit(0);
				default:
					System.out.println("Please Enter A Correct Value");
			}
		}
		
	}
	public int addPaper() {
		Scanner read = new Scanner(System.in);
		int upc = paper.getUPC();
		if (upc == 0){
			System.out.println("System has no UPC for Paper yet");
			System.out.print("Please enter UPC for Paper: ");
			int newUpc = read.nextInt();
			paper.setUPC(newUpc);
			System.out.print("Please insert quantity for Paper: ");
			int total = read.nextInt();
			return total;
		}
		else{
			System.out.print("Please insert quantity for Paper: ");
			int newQuantity = read.nextInt();
			int current = paper.getQuantity();
			int total = newQuantity + current;
			return total;
		}
		
	}
	public int addTires() {
		Scanner read = new Scanner(System.in);
		int upc = tires.getUPC();
		if (upc == 0){
			System.out.println("System has no UPC for Tires yet");
			System.out.print("Please enter UPC for Tires: ");
			int newUpc = read.nextInt();
			tires.setUPC(newUpc);
			System.out.print("Please insert quantity for Tires: ");
			int total = read.nextInt();
			return total;
		}
		else{
			System.out.print("Please insert quantity for Tires: ");
			int newQuantity = read.nextInt();
			int current = tires.getQuantity();
			int total = newQuantity + current;
			return total;
		}
		
	}
	private void checkStock() {
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
	private void changeLocation() {
		// TODO Auto-generated method stub
		
	}
	public int addMeat(){
		Scanner read = new Scanner(System.in);
		int upc = meat.getUPC();
		if (upc == 0){
			System.out.println("System has no UPC for Meat yet");
			System.out.print("Please enter UPC for Meat: ");
			int newUpc = read.nextInt();
			meat.setUPC(newUpc);
			System.out.print("Please insert quantity for Meat: ");
			int total = read.nextInt();
			return total;
		}
		else{
			System.out.print("Please insert quantity for Meat: ");
			int newQuantity = read.nextInt();
			int current = meat.getQuantity();
			int total = newQuantity + current;
			return total;
		}
		
	}
}
