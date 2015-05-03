import org.junit.*;
import static org.junit.Assert.*;


public class TesteAtaques {
	Charmander c;
	Squirtle s;
	
	@Before
	public void ciaPokemons() {
		c = new Charmander();
		s = new Squirtle();
	}
	
	@Test
	public void cura() {
		c.dano(50);
		assertEquals(50, c.getHP());
		c.cura(25);
		assertEquals(75, c.getHP());
		c.cura(100);
		assertEquals(100, c.getHP());
	}
	
	@Test
	public void testeCharmander() {
		/* ataque1 */
		
		c.ataque1(c);
		assertEquals(88, c.getHP());
		c.ataque1(s);
		assertEquals(118, s.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque2 */
		
		c.ataque2(c);
		assertEquals(74, c.getHP());
		c.ataque2(s);
		assertEquals(104, s.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque3 */
		
		c.ataque3(c);
		assertEquals(88, c.getHP());
		c.ataque3(s);
		assertEquals(118, s.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque4 */
		c.dano(50);
		c.ataque4(c);
		assertEquals(99, c.getHP());
		
	}

}
