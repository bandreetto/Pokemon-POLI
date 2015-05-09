
public class Cyndaquil extends Pokemon {

	public Cyndaquil() {
		id = 5;
		nome = "Cyndaquil";
		hp = 107;
		baseHP = 107;
		FOR = 26;
		AGI = 9;
		DEF = 13;
		tipo = "Fogo";
		ataques = new String[4];
		ataques[0] = "Investida";
		ataques[1] = "Lanca Chamas";
		ataques[2] = "Estrela Cadente";
		ataques[3] = "Furia";
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
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo") {
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

	@Override
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)((10/(double)hp)*(FOR*0.1*50*0.5 - alvo.getDEF())));
		} else {
			alvo.dano((int)((10/(double)hp)*(FOR*0.1*50 - alvo.getDEF())));
		}	
	}
}
