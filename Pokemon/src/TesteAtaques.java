 
import org.junit.*;
import static org.junit.Assert.*;


public class TesteAtaques {
	Pokemon c, s;
	
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
		assertEquals(80, c.getHP());
		c.ataque1(s);
		assertEquals(110, s.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque2 */
		
		c.ataque2(c);
		assertEquals(65, c.getHP());
		c.ataque2(s);
		assertEquals(95, s.getHP());
		
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
		
		c.ataque4(c);
		assertEquals(86, c.getHP());
		c.dano(36);
		c.ataque4(c);
		assertEquals(22, c.getHP());
		
		c.ataque4(s);
		assertEquals(61, s.getHP());
		
		c.cura(500);
		s.cura(500);
	}
	
	@Test
	public void testeSquirtle() {
		/* ataque1 */
		s.ataque1(s);
		assertEquals(119, s.getHP());
		s.ataque1(c);
		assertEquals(50, c.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque2 */
		
		s.ataque2(s);
		assertEquals(110, s.getHP());
		s.ataque2(c);
		assertEquals(80, c.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque3 */
		
		s.ataque3(s);
		assertEquals(80, s.getHP());
		s.ataque3(c);
		assertEquals(80, s.getHP());
		
		c.cura(500);
		s.cura(500);
		
		/* ataque4 */
		
		s.ataque4(s);
		assertEquals(119, s.getHP());
		s.ataque4(c);
		assertEquals(90, c.getHP());
		
		c.cura(500);
		s.cura(500);

	}

}
