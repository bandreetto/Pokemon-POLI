
public class Pikachu extends Pokemon {

	public Pikachu() {
		id = 4;
		nome = "Pikachu";
		hp = 105;
		baseHP = 105;
		FOR = 28;
		AGI = 10;
		DEF = 12;
		tipo = "Eletrico";
		ataques = new String[4];
		ataques[0] = "Investida";
		ataques[1] = "Choque do Trovao";
		ataques[2] = "Cauda de Ferro";
		ataques[3] = "Corte Duplo";
		
	}

	@Override
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque2(Pokemon alvo) {
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Agua") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Grama" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Agua" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}

	
	// Este ataque ignora a defesa do alvo
	@Override
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*13*1.5));
		} else if (alvo.getTipo() == "Fogo" || alvo.getTipo() == "Agua" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*13*0.5));
		} else {
			alvo.dano((int)(FOR*0.1*13));
		}	
	}

}
