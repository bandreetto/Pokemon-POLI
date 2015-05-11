import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTreinador {
	@Test
	public void testaTreinador() {
		Treinador t = new Treinador("Nome", 1);
		assertEquals(6, t.getTamanhoTime());
		/* escolha charmander para o teste dar certo */
		assertEquals(t.getAtivo().nome, "Charmander");
		/* escolha os pokemons 1 2 3 4 5 e 6 respectivamente */
		for (int i = 1; i <= 6; i++) {
			assertEquals(t.getPokemon(i-1).id, i);
		}
	}
}
