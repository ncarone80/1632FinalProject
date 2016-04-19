import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PaperTest {
	static Paper p;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Paper();
	}

	@Test
	public void testGetQuanity() {
		assertEquals(p.getQuantity(),0);
		p.quantity = 10;
		assertEquals(p.getQuantity(),10);
		p.quantity = Integer.MAX_VALUE;
		assertEquals(p.getQuantity(),Integer.MAX_VALUE);
		p.quantity = Integer.MIN_VALUE;
		assertEquals(p.getQuantity(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testGetUPC() {
		assertEquals(p.getUPC(),0);
		p.upc = 398472;
		assertEquals(p.getUPC(),398472);
		p.upc = Integer.MAX_VALUE;
		assertEquals(p.getUPC(),Integer.MAX_VALUE);
		p.upc = Integer.MIN_VALUE;
		assertEquals(p.getUPC(),Integer.MIN_VALUE);
	}
	
	@Test
	public void testSetQuantity(){
		int q = p.quantity;
		p.setQuantity(20);
		assertNotEquals(p.quantity,q);
		p.setQuantity(q);
		assertEquals(p.quantity,q);
		
	}
	
	@Test
	public void testSetUPC(){
		int u = p.upc;
		p.setUPC(970);
		assertNotEquals(p.upc,u);
		p.setUPC(u);
		assertEquals(p.upc,u);
	}

}
