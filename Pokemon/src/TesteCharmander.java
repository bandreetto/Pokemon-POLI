import org.junit.*;
import static org.junit.Assert.*;

public class TesteCharmander {
	private String [] ataques = new String[4]; 
	Charmander c;
	
	@Before
	public void criaCharmander() {
		c = new Charmander();
		ataques[0] = "Brasas";
		ataques[1] = "Arranhao";
		ataques[2] = "Garra de Metal";
		ataques[3] = "Furia";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], c.ataques()[0]);
		assertEquals(ataques[1], c.ataques()[1]);
		assertEquals(ataques[2], c.ataques()[2]);
		assertEquals(ataques[3], c.ataques()[3]);
		assertEquals(100, c.getHP());
		assertEquals(100, c.getBaseHP());
		assertEquals(30, c.getFOR());
		assertEquals(9, c.getAGI());
		assertEquals(10, c.getDEF());
		assertEquals("Fogo", c.getTipo());
	}
	
}
