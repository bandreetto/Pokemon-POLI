import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteTorchic {
	private Pokemon t;
	private String [] ataques = new String[4]; 
	
	@Before
	public void criaTorchic() {
		t = new Torchic();
		ataques[0] = "Brasas";
		ataques[1] = "Arranhao";
		ataques[2] = "Bicada";
		ataques[3] = "Furia";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], t.ataques()[0]);
		assertEquals(ataques[1], t.ataques()[1]);
		assertEquals(ataques[2], t.ataques()[2]);
		assertEquals(ataques[3], t.ataques()[3]);
		assertEquals(9, t.getID());
		assertEquals("Torchic", t.getNome());
		assertEquals(107, t.getHP());
		assertEquals(107, t.getBaseHP());
		assertEquals(25, t.getFOR());
		assertEquals(11, t.getAGI());
		assertEquals(12, t.getDEF());
		assertEquals("Fogo", t.getTipo());
	}
	
}
