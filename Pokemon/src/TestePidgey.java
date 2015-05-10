import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestePidgey {
	private Pokemon p;
	private String [] ataques = new String[4];
	
	@Before
	public void criaPidgey() {
		p = new Pidgey();
		ataques[0] = "Ventania";
		ataques[1] = "Ataque Rapido";
		ataques[2] = "Ataque de Areia";
		ataques[3] = "Ciclone";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], p.ataques()[0]);
		assertEquals(ataques[1], p.ataques()[1]);
		assertEquals(ataques[2], p.ataques()[2]);
		assertEquals(ataques[3], p.ataques()[3]);
		assertEquals(12, p.getID());
		assertEquals("Pidgey", p.getNome());
		assertEquals(111, p.getHP());
		assertEquals(111, p.getBaseHP());
		assertEquals(27, p.getFOR());
		assertEquals(8, p.getAGI());
		assertEquals(13, p.getDEF());
		assertEquals("Voador", p.getTipo());
	}
}
