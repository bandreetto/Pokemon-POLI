 
import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;


public class TesteAtaques {
	private Pokemon c, s, b, p;
	private ArrayList<Pokemon> alvos = new ArrayList<Pokemon>();
	
	private void ataca(Pokemon atacante, ArrayList<Pokemon> alvos, int ataque) {
		switch (ataque){
			case 1:
				for (Pokemon p: alvos) {
					atacante.ataque1(p);
				}
				break;
			case 2:
				for (Pokemon p: alvos) {
					atacante.ataque2(p);
				}
				break;
			case 3:
				for(Pokemon p: alvos) {
					atacante.ataque3(p);
				}
				break;
			case 4:
				for(Pokemon p: alvos) {
					atacante.ataque4(p);
				}
				break;
		}
	}
	
	private void cura(ArrayList<Pokemon> alvos) {
		for (Pokemon p: alvos) {
			p.cura(500);
		}
	}
	
	
	
	@Before
	public void criaPokemons() {
		c = new Charmander();
		s = new Squirtle();
		b = new Bulbassauro();
		p = new Pikachu();
		
		alvos.add(c);
		alvos.add(s);
		alvos.add(b);
		alvos.add(p);
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

		ataca(c, alvos, 1);
		assertEquals(80, c.getHP());
		assertEquals(110, s.getHP());
		assertEquals(36, b.getHP());
		assertEquals(57, p.getHP());
		cura(alvos);
		
		/* ataque2 */
		
		ataca(c, alvos, 2);
		assertEquals(65, c.getHP());
		assertEquals(95, s.getHP());
		assertEquals(81, b.getHP());
		assertEquals(72, p.getHP());
		cura(alvos);
		
		/* ataque3 */
		
		ataca(c, alvos, 3);
		assertEquals(88, c.getHP());
		assertEquals(118, s.getHP());
		assertEquals(81, b.getHP());
		assertEquals(95, p.getHP());
		cura(alvos);
		
		/* ataque4 */
		
		c.ataque4(c);
		assertEquals(86, c.getHP());
		c.dano(36);
		
		ataca(c, alvos, 4);
		assertEquals(22, c.getHP());
		assertEquals(61, s.getHP());
		assertEquals(50, b.getHP());
		assertEquals(43, p.getHP());
		cura(alvos);
	}
	
	@Test
	public void testeSquirtle() {
		/* ataque1 */

		ataca(s, alvos, 1);
		assertEquals(50, c.getHP());
		assertEquals(119, s.getHP());
		assertEquals(106, b.getHP());
		assertEquals(77, p.getHP());
		cura(alvos);
		
		/* ataque2 */
		
		ataca(s, alvos, 2);
		assertEquals(80, c.getHP());
		assertEquals(110, s.getHP());
		assertEquals(96, b.getHP());
		assertEquals(87, p.getHP());
		cura(alvos);
		
		/* ataque3 */
		
		ataca(s, alvos, 3);
		assertEquals(83, c.getHP());
		assertEquals(88, s.getHP());
		assertEquals(84, b.getHP());
		assertEquals(85, p.getHP());
		cura(alvos);
		
		/* ataque4 */
		
		ataca(s, alvos, 4);
		assertEquals(90, c.getHP());
		assertEquals(119, s.getHP());
		assertEquals(66, b.getHP());
		assertEquals(77, p.getHP());
		cura(alvos);

	}
	
	@Test
	public void testeBulbassauro() {
		/* ataque1 */
		
		ataca(b, alvos, 1);
		assertEquals(77, c.getHP());
		assertEquals(107, s.getHP());
		assertEquals(93, b.getHP());
		assertEquals(84, p.getHP());
		cura(alvos);
		
		/* ataque2 */
		
		ataca(b, alvos, 2);
		assertEquals(88, c.getHP());
		assertEquals(74, s.getHP());
		assertEquals(104, b.getHP());
		assertEquals(73, p.getHP());
		cura(alvos);
		
		/* ataque3 */
		
		ataca(b, alvos, 3);
		assertEquals(94, c.getHP());
		assertEquals(91, s.getHP());
		assertEquals(110, b.getHP());
		assertEquals(84, p.getHP());
		cura(alvos);
		
		/* ataque4 */
		
		ataca(b, alvos, 4);
		b.ataque4(s);
		ataca(b, alvos, 4);
		assertEquals(66, c.getHP());
		assertEquals(8, s.getHP());
		assertEquals(82, b.getHP());
		assertEquals(29, p.getHP());
		cura(alvos);
	}
	
	
	@Test
	public void testePikachu() {
		/* ataque1 */
		
		ataca(p, alvos, 1);
		assertEquals(68, c.getHP());
		assertEquals(98, s.getHP());
		assertEquals(84, b.getHP());
		assertEquals(75, p.getHP());
		cura(alvos);
		
		/* ataque2 */
		
		ataca(p, alvos, 2);
		assertEquals(54, c.getHP());
		assertEquals(56, s.getHP());
		assertEquals(98, b.getHP());
		assertEquals(89, p.getHP());
		cura(alvos);
		
		/* ataque3 */
		
		ataca(p, alvos, 3);
		assertEquals(89, c.getHP());
		assertEquals(119, s.getHP());
		assertEquals(84, b.getHP());
		assertEquals(96, p.getHP());
		cura(alvos);
		
		/* ataque4 */
		
		ataca(p, alvos, 4);
		assertEquals(82, c.getHP());
		assertEquals(102, s.getHP());
		assertEquals(74, b.getHP());
		assertEquals(87, p.getHP());
		cura(alvos);
	}
}
