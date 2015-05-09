import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteChikorita {
	private Pokemon c;
	private String [] ataques = new String[4];
	
	@Before
	public void criaBulbassauro() {
		c = new Chikorita();
		ataques[0] = "Investida";
		ataques[1] = "Chicote de Cipo";
		ataques[2] = "Absorver";
		ataques[3] = "Raio Solar";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], c.ataques()[0]);
		assertEquals(ataques[1], c.ataques()[1]);
		assertEquals(ataques[2], c.ataques()[2]);
		assertEquals(ataques[3], c.ataques()[3]);
		assertEquals(7, c.getID());
		assertEquals("Chikorita", c.getNome());
		assertEquals(112, c.getHP());
		assertEquals(112, c.getBaseHP());
		assertEquals(24, c.getFOR());
		assertEquals(2, c.getAGI());
		assertEquals(14, c.getDEF());
		assertEquals("Grama", c.getTipo());
	}
}

