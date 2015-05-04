import static org.junit.Assert.assertEquals;

import org.junit.*;


public class TestePikachu {
	private Pokemon p;
	private String [] ataques = new String[4];
	
	@Before
	public void criaPikachu() {
		p = new Pikachu();
		ataques[0] = "Investida";
		ataques[1] = "Choque do Trovao";
		ataques[2] = "Cauda de Ferro";
		ataques[3] = "Corte Duplo";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], p.ataques()[0]);
		assertEquals(ataques[1], p.ataques()[1]);
		assertEquals(ataques[2], p.ataques()[2]);
		assertEquals(ataques[3], p.ataques()[3]);
		assertEquals(4, p.getID());
		assertEquals("Pikachu", p.getNome());
		assertEquals(105, p.getHP());
		assertEquals(105, p.getBaseHP());
		assertEquals(28, p.getFOR());
		assertEquals(10, p.getAGI());
		assertEquals(12, p.getDEF());
		assertEquals("Eletrico", p.getTipo());
	}

}
