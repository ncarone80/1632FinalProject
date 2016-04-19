import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class MeatTest {
	static Meat m;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m = new Meat();
	}

	@Test
	public void testGetQuanity() {
		assertEquals(m.getQuantity(),0);
		m.quantity = 10;
		assertEquals(m.getQuantity(),10);
		m.quantity = Integer.MAX_VALUE;
		assertEquals(m.getQuantity(),Integer.MAX_VALUE);
		m.quantity = Integer.MIN_VALUE;
		assertEquals(m.getQuantity(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testGetUPC() {
		assertEquals(m.getUPC(),0);
		m.upc = 398472;
		assertEquals(m.getUPC(),398472);
		m.upc = Integer.MAX_VALUE;
		assertEquals(m.getUPC(),Integer.MAX_VALUE);
		m.upc = Integer.MIN_VALUE;
		assertEquals(m.getUPC(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testGetLocation() {
		assertNull(m.getLocation());
		m.location = "4200 5th Ave";
		assertNotNull(m.getLocation());
		assertEquals(m.getLocation(), "4200 5th Ave");
	}
	
	@Test
	public void testSetQuantity(){
		int q = m.quantity;
		m.setQuantity(20);	
		assertNotEquals(m.quantity,q);
		m.setQuantity(q);
		assertEquals(m.quantity,q);
		
	}
	
	@Test
	public void testSetUPC(){
		int u = m.upc;
		m.setUPC(970);
		assertNotEquals(m.upc,u);
		m.setUPC(u);
		assertEquals(m.upc,u);
	}
	

}
