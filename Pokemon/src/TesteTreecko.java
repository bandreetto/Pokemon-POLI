import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteTreecko {
	private Pokemon t;
	private String [] ataques = new String[4];
	
	@Before
	public void criaTreecko() {
		t = new Treecko();
		ataques[0] = "Rajada de Sementes";
		ataques[1] = "Espancar";
		ataques[2] = "Absorver";
		ataques[3] = "Perseguir";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], t.ataques()[0]);
		assertEquals(ataques[1], t.ataques()[1]);
		assertEquals(ataques[2], t.ataques()[2]);
		assertEquals(ataques[3], t.ataques()[3]);
		assertEquals(11, t.getID());
		assertEquals("Treecko", t.getNome());
		assertEquals(104, t.getHP());
		assertEquals(104, t.getBaseHP());
		assertEquals(27, t.getFOR());
		assertEquals(12, t.getAGI());
		assertEquals(14, t.getDEF());
		assertEquals("Grama", t.getTipo());
	}
}
