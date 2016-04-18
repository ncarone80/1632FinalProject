
public class Shelf {
	int shelfNum;
	int shelfCapacity;
	String productOnShelf;
	String shelfLocation;
	int amountOnShelf;
	
	public Shelf(){
		
	}
	public Shelf(int sN, int sC, String pOs, String loc, int aOs){
		shelfNum = sN;
		shelfCapacity = sC;
		productOnShelf = pOs;
		shelfLocation = loc;
		amountOnShelf = aOs;
	}
	public int getShelfNum(){
		return shelfNum;
	}
	public int getCapacity(){
		return shelfCapacity;
	}
	public String getProduct(){
		return productOnShelf;
	}
	public String getLocation(){
		return shelfLocation;
	}
	public int getCurrentAmount(){
		return amountOnShelf;
	}
	//needs setter methods
}

