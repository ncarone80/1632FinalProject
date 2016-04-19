
public class Tires {
	int upc;
	int quantity;
	String location;
	
	public Tires(){
		upc = 0;
		quantity = 0;
		location = null;
	}
	public Tires(int newUPC, int newQuantity, String newLocation){
		upc = newUPC;
		quantity = newQuantity;
		location = newLocation;
	}
	public int getQuantity(){
		return quantity;
	}
	public int getUPC(){
		return upc;
	}
	public String getLocation(){
		return location;
	}
	
	public void setUPC(int n){
		upc = n;
	}
	public void setQuantity(int n){	
		quantity = n;
	}
}
