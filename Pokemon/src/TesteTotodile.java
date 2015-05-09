import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteTotodile {
	private Pokemon t;
	private String [] ataques = new String[4];

	@Before
	public void criaSquirtle() {
		t = new Totodile();
		ataques[0] = "Jato de Agua";
		ataques[1] = "Mordida";
		ataques[2] = "Quebra-Cranio";
		ataques[3] = "Talhada";
		
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], t.ataques()[0]);
		assertEquals(ataques[1], t.ataques()[1]);
		assertEquals(ataques[2], t.ataques()[2]);
		assertEquals(ataques[3], t.ataques()[3]);
		assertEquals(6, t.getID());
		assertEquals("Totodile", t.getNome());
		assertEquals(104, t.getHP());
		assertEquals(104, t.getBaseHP());
		assertEquals(28, t.getFOR());
		assertEquals(7, t.getAGI());
		assertEquals(11, t.getDEF());
		assertEquals("Agua", t.getTipo());
	}


}
