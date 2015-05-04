import org.junit.*;
import static org.junit.Assert.*;


public class TesteSquirtle {
	private Pokemon s;
	private String [] ataques = new String[4];

	@Before
	public void criaSquirtle() {
		s = new Squirtle();
		ataques[0] = "Jato de Agua";
		ataques[1] = "Giro Rapido";
		ataques[2] = "Quebra-Cranio";
		ataques[3] = "Raio de Gelo";
		
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], s.ataques()[0]);
		assertEquals(ataques[1], s.ataques()[1]);
		assertEquals(ataques[2], s.ataques()[2]);
		assertEquals(ataques[3], s.ataques()[3]);
		assertEquals(2, s.getID());
		assertEquals("Squirtle", s.getNome());
		assertEquals(120, s.getHP());
		assertEquals(120, s.getBaseHP());
		assertEquals(20, s.getFOR());
		assertEquals(1, s.getAGI());
		assertEquals(20, s.getDEF());
		assertEquals("Agua", s.getTipo());
	}

}
