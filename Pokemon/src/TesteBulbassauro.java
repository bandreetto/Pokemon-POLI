import static org.junit.Assert.assertEquals;

import org.junit.*;


public class TesteBulbassauro {
	private Pokemon b;
	private String [] ataques = new String[4];
	
	@Before
	public void criaBulbassauro() {
		b = new Bulbassauro();
		ataques[0] = "Investida";
		ataques[1] = "Folha Navalha";
		ataques[2] = "Absorver";
		ataques[3] = "Raio Solar";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], b.ataques()[0]);
		assertEquals(ataques[1], b.ataques()[1]);
		assertEquals(ataques[2], b.ataques()[2]);
		assertEquals(ataques[3], b.ataques()[3]);
		assertEquals(3, b.getID());
		assertEquals("Bulbassauro", b.getNome());
		assertEquals(110, b.getHP());
		assertEquals(110, b.getBaseHP());
		assertEquals(22, b.getFOR());
		assertEquals(3, b.getAGI());
		assertEquals(16, b.getDEF());
		assertEquals("Grama", b.getTipo());
	}

}
