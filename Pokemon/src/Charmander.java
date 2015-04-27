
public class Charmander extends Pokemon{
	public static final int id = 1;
	public static final int FOR = 30, AGI = 9, DEF = 100;
	private final String tipo = "Fogo";
	private int hp;
	
	
	public Charmander() {
		hp = 1000;
	}
	
	public int getFOR() {
		return FOR;
	}
	
	public int getAGI() {
		return AGI;
	}
	
	public int getDEF() {
		return DEF;
	}
	
	public void Brasas(Pokemon alvo) {
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*15 - alvo.getDEF()));
		}
	}
	
	public void Arranhão(Pokemon alvo) {
		alvo.dano((int)(FOR*10 - alvo.getDEF()));
	}

}
