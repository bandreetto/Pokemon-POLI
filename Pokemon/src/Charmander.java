
public class Charmander extends Pokemon{
	public static final int id = 1;
	private final int FOR = 3, AGI = 9, DEF = 10;
	private final String tipo = "Fogo";
	private int hp;
	
	// cria um charmander com 100 de hp
	public Charmander() { 
		hp = 100;
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
	// Fórmula para dano = FOR*ATQ BASE*FRAQUESA/RESISTÊNCIA - DEFESA ALVO
	public void Brasas(Pokemon alvo) {
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((FOR*15 - alvo.getDEF()));
		}
	}
	
	public void Arranhao(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*10*0.5 - alvo.getDEF())); 
		} else {
			alvo.dano((FOR*10 - alvo.getDEF()));
		}
	}
	
	public void GarradeMetal(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Agua" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano(FOR*15 - alvo.getDEF());
		}
	}
	
	// A furia depende do hp restante do pokemon, quanto menor o hp maior o dano
	public void Furia(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)((1/hp)*(FOR*30*0.5 - alvo.getDEF())));
		} else {
			alvo.dano((int)(1/hp)*(FOR*30 - alvo.getDEF()));
		}
	}
}
