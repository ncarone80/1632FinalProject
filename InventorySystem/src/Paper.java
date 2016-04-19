
public class Paper {
	int upc;
	int quantity;
	String location;
	
	public Paper(){
		upc = 0;
		quantity = 0;
		location = null;
	}
	public Paper(int newUPC, int newQuantity, String newLocation){
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
