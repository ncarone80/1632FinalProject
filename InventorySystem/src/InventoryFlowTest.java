import static org.junit.Assert.*;
import java.util.InputMismatchException;

import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryFlowTest {
	static InventoryFlow iFlow;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Meat m = new Meat();
		m.upc = 1;
		Paper p = new Paper();
		p.upc = 2;
		Tires t = new Tires();
		t.upc = 3;
		iFlow = new InventoryFlow(m,p,t);
	}

	@Test
	public void testAddMeat(){
		iFlow.meat.quantity = 0;
		//Input = 12 Output = 12
		assertEquals(iFlow.addMeat(),12);
		//change upc to 0
		iFlow.meat.upc = 0;
		//Input = 1,36 Output = 36
		assertEquals(iFlow.addMeat(),36);
	}
	
	@Test
	public void testSellPaper(){
		iFlow.paper.quantity = 12;
		//Input = 13 Output = 12 because it should not subtract any 
		assertEquals(iFlow.sellPaper(),12);
		//Input = 6 Output = 6
		assertEquals(iFlow.sellPaper(),6);
		iFlow.paper.quantity = 0;
		assertEquals(iFlow.sellPaper(),0);
	}

	@Test
	public void testSellTires(){
		iFlow.tires.quantity = 12;
		//Input = 13 Output = 12 because it should not subtract any 
		assertEquals(iFlow.sellTires(),12);
		//Input = 6 Output = 6
		assertEquals(iFlow.sellTires(),6);
		iFlow.tires.quantity = 0;
		assertEquals(iFlow.sellTires(),0);
		
	}

	@Test
	public void testAddPaper() {
		iFlow.paper.quantity = 0;
		//Input = 12 Output = 12
		assertEquals(iFlow.addPaper(),12);
		//change upc to 0
		iFlow.paper.upc = 0;
		//Input = 2,36 Output = 36
		assertEquals(iFlow.addPaper(),36);

		
	}
	
	@Test
	public void testAddTires() {
		iFlow.tires.quantity = 0;
		//Input = 12 Output = 12
		assertEquals(iFlow.addTires(),12);
		//change upc to 0
		iFlow.tires.upc = 0;
		//Input = 3,36 Output = 36
		assertEquals(iFlow.addTires(),36);
		
	}
	
	@Test
	public void testSellMeat(){
		iFlow.meat.quantity = 12;
		//Input = 13 Output = 12 because it should not subtract any 
		assertEquals(iFlow.sellMeat(),12);
		//Input = 6 Output = 6
		assertEquals(iFlow.sellMeat(),6);
		iFlow.meat.quantity = 0;
		assertEquals(iFlow.sellMeat(),0);
		
		
	}

}
