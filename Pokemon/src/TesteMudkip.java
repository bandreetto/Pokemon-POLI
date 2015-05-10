import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteMudkip {
	private Pokemon m;
	private String [] ataques = new String[4];
	
	@Before
	public void criaMudkip() {
		m = new Mudkip();
		ataques[0] = "Jato de Agua";
		ataques[1] = "Investida";
		ataques[2] = "Ataque de Lama";
		ataques[3] = "Lancamento de Rocha";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], m.ataques()[0]);
		assertEquals(ataques[1], m.ataques()[1]);
		assertEquals(ataques[2], m.ataques()[2]);
		assertEquals(ataques[3], m.ataques()[3]);
		assertEquals(10, m.getID());
		assertEquals("Mudkip", m.getNome());
		assertEquals(108, m.getHP());
		assertEquals(108, m.getBaseHP());
		assertEquals(25, m.getFOR());
		assertEquals(5, m.getAGI());
		assertEquals(13, m.getDEF());
		assertEquals("Agua", m.getTipo());
	}
}
