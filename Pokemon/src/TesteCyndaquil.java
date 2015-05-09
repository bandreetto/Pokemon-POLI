import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteCyndaquil {

	private Pokemon c;
	private String [] ataques = new String[4]; 
	
	@Before
	public void criaCyndaquil() {
		c = new Cyndaquil();
		ataques[0] = "Investida";
		ataques[1] = "Lanca Chamas";
		ataques[2] = "Estrela Cadente";
		ataques[3] = "Furia";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], c.ataques()[0]);
		assertEquals(ataques[1], c.ataques()[1]);
		assertEquals(ataques[2], c.ataques()[2]);
		assertEquals(ataques[3], c.ataques()[3]);
		assertEquals(5, c.getID());
		assertEquals("Cyndaquil", c.getNome());
		assertEquals(107, c.getHP());
		assertEquals(107, c.getBaseHP());
		assertEquals(26, c.getFOR());
		assertEquals(9, c.getAGI());
		assertEquals(13, c.getDEF());
		assertEquals("Fogo", c.getTipo());
	}
}
