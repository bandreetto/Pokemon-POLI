import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TesteGeodude {
	private Pokemon g;
	private String [] ataques = new String[4];
	
	@Before
	public void criaBulbassauro() {
		g = new Bulbassauro();
		ataques[0] = "Poder Oculto";
		ataques[1] = "Lançamento de Rocha";
		ataques[2] = "Mega-Soco";
		ataques[3] = "Tempestade de Areia";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], g.ataques()[0]);
		assertEquals(ataques[1], g.ataques()[1]);
		assertEquals(ataques[2], g.ataques()[2]);
		assertEquals(ataques[3], g.ataques()[3]);
		assertEquals(8, g.getID());
		assertEquals("Geodude", g.getNome());
		assertEquals(116, g.getHP());
		assertEquals(116, g.getBaseHP());
		assertEquals(21, g.getFOR());
		assertEquals(4, g.getAGI());
		assertEquals(18, g.getDEF());
		assertEquals("Pedra", g.getTipo());
	}

}
