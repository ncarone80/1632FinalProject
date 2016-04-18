
public class Warehouse {
	int numShelves;
	int totalProducts;
	int typesOfProducts;
	int warehouseID;
	String address;
	
	public Warehouse(){
		
	}
	public Warehouse(int ns, int tp, int tOp, int whID, String addr){
		numShelves = ns;
		totalProducts = tp;
		typesOfProducts = tOp;
		warehouseID = whID;
		address = addr;
	}
	
	public int getNumShelves(){
		return numShelves;
	}
	public int getNumProducts(){
		return totalProducts;
	}
	public int getTypesOfProducts(){
		return typesOfProducts;
	}
	public int getWarehouseID(){
		return warehouseID;
	}
	public String getAddress(){
		return address;
	}
	//////add a setter for each variable too
}
