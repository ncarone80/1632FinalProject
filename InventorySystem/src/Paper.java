
public class Paper {
	int upc;
	int quantity;
	
	public Paper(){
		upc = 0;
		quantity = 0;
	}
	
	public int getQuantity(){
		return quantity;
	}
	public int getUPC(){
		return upc;
	}
	
	public void setUPC(int n){
		upc = n;
	}
	public void setQuantity(int n){	
		quantity = n;
	}
}
