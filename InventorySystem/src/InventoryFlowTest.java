import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryFlowTest {
	static InventoryFlow iFlow;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Meat m = mock(Meat.class);
		Paper p = mock(Paper.class);
		Tires t = mock(Tires.class);
		iFlow = new InventoryFlow(m,p,t);
	}

	@Test
	public void testAddPaper() {
		fail("Not yet implemented");
	}

}
