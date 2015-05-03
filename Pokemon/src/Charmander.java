
public class Charmander extends Pokemon{
	public static final int id = 1;
	private final int FOR = 30, AGI = 9, DEF = 10;
	private final String tipo = "Fogo";
	private String [] ataques = new String[4];
	private int hp;
	
	// cria um charmander com 100 de hp e cria o vetor de ataques
	public Charmander() { 
		hp = 100;
		ataques[0] = "Brasas";
		ataques[1] = "Arranhao";
		ataques[2] = "Garra de Metal";
		ataques[3] = "Furia";
		
	}
	
	public int getHP(){
		return hp;
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
	
	public String getTipo() {
		return tipo;
	}
	
	// a seguir os ataques de charmander já respeitando fraquezas e vantagens
	// Fórmula Dano = (FOR*0.1)*ATQ BASE*FRAQUESA/RESISTÊNCIA - DEFESA ALVO
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}
	
	public void ataque2(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*12*0.5 - alvo.getDEF())); 
		} else {
			alvo.dano((int)(FOR*0.1*12 - alvo.getDEF()));
		}
	}
	
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Agua" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}
	
	// A furia depende do hp restante do pokemon, quanto menor o hp maior o dano
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)((1/hp)*(FOR*0.1*30*0.5 - alvo.getDEF())));
		} else {
			alvo.dano((int)((1/hp)*(FOR*0.1*30 - alvo.getDEF())));
		}
	}
}
