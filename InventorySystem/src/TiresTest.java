import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TiresTest {
	static Tires t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		t = new Tires();
	}

	@Test
	public void testGetQuanity() {
		assertEquals(t.getQuantity(),0);
		t.quantity = 10;
		assertEquals(t.getQuantity(),10);
		t.quantity = Integer.MAX_VALUE;
		assertEquals(t.getQuantity(),Integer.MAX_VALUE);
		t.quantity = Integer.MIN_VALUE;
		assertEquals(t.getQuantity(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testGetUPC() {
		assertEquals(t.getUPC(),0);
		t.upc = 398472;
		assertEquals(t.getUPC(),398472);
		t.upc = Integer.MAX_VALUE;
		assertEquals(t.getUPC(),Integer.MAX_VALUE);
		t.upc = Integer.MIN_VALUE;
		assertEquals(t.getUPC(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testGetLocation() {
		assertNull(t.getLocation());
		t.location = "4200 5th Ave";
		assertNotNull(t.getLocation());
		assertEquals(t.getLocation(), "4200 5th Ave");
	}
	
	@Test
	public void testSetQuantity(){
		int q = t.quantity;
		t.setQuantity(20);
		assertNotEquals(t.quantity,q);
		t.setQuantity(q);
		assertEquals(t.quantity,q);
		
	}
	
	@Test
	public void testSetUPC(){
		int u = t.upc;
		t.setUPC(970);
		assertNotEquals(t.upc,u);
		t.setUPC(u);
		assertEquals(t.upc,u);
	}

}
