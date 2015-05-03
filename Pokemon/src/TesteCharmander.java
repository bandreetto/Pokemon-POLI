import static org.junit.Assert.*;

import org.junit.*;

public class TesteCharmander {
	private String [] ataques = new String[4]; 
	Charmander c1, c2;
	
	@Before
	public void criaCharmander() {
		c1 = new Charmander();
		c2 = new Charmander();
		ataques[0] = "Brasas";
		ataques[1] = "Arranhao";
		ataques[2] = "Garra de Metal";
		ataques[3] = "Furia";
	}
	
	@Test
	public void getMethods() {
		assertEquals(ataques[0], c1.ataques()[0]);
		assertEquals(ataques[1], c1.ataques()[1]);
		assertEquals(ataques[2], c1.ataques()[2]);
		assertEquals(ataques[3], c1.ataques()[3]);
		assertEquals(100, c1.getHP());
		assertEquals(100, c1.getBaseHP());
		assertEquals(30, c1.getFOR());
		assertEquals(9, c1.getAGI());
		assertEquals(10, c1.getDEF());
		assertEquals("Fogo", c1.getTipo());
	}
	
	@Test
	public void ataque1() {
		c1.ataque1(c2);
		assertEquals(88, c2.getHP());
		c2.cura(50);
		assertEquals(100, c2.getHP());
	}
	
	

}
