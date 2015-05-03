
public class Squirtle extends Pokemon{
	public static final int id = 2;
	
	// cria um squirtle com 115 de hp
	public Squirtle() {
		hp = 120;
		baseHP = 120;
		FOR = 20;
		AGI = 2;
		DEF = 20;
		tipo = "Agua";
		ataques = new String[4];
		ataques[0] = "Jato de Agua";
		ataques[1] = "Giro Rapido";
		ataques[2] = "Quebra-Cranio";
		ataques[3] = "Raio de Gelo";
	}
	
	
	// Ataques de Squirtle
	// Formula Dano = (FOR*0.1)*ATQ BASE*FRAQUEZA/RESISTENCIA - DEF
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Grama") {
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
	
	// Quebra-Cranio causa dano baseado na defesa do alvo
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*10*0.5 + alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*10 + alvo.getDEF()));
		}
	}

	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Agua") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}		
	}
		
}
