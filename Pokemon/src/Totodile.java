
public class Totodile extends Pokemon{

	public Totodile() {
		id = 6;
		nome = "Totodile";
		hp = 104;
		baseHP = 104;
		FOR = 28;
		AGI = 7;
		DEF = 11;
		tipo = "Agua";
		ataques = new String[4];
		ataques[0] = "Jato de Agua";
		ataques[1] = "Mordida";
		ataques[2] = "Quebra-Cranio";
		ataques[3] = "Talhada";
	}

	@Override
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque2(Pokemon alvo) {
		alvo.dano((int)(FOR*0.1*14 - alvo.getDEF()));
		
	}

	@Override
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*0.5 + 1.5*alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1 + 1.5*alvo.getDEF()));
		}
	}

	@Override
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}
}
