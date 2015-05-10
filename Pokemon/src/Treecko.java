
public class Treecko extends Pokemon {

	public Treecko() {
		id = 11;
		nome = "Treecko";
		hp = 104;
		baseHP = 104;
		FOR = 27;
		AGI = 12;
		DEF = 14;
		tipo = "Grama";
		ataques = new String[4];
		ataques[0] = "Rajada de Sementes";
		ataques[1] = "Espancar";
		ataques[2] = "Absorver";
		ataques[3] = "Perseguir";
	}

	@Override
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Agua") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque2(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
			this.cura((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Agua") {
			alvo.dano((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
			this.cura((int)(FOR*0.1*15*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
			this.cura((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque4(Pokemon alvo) {
		alvo.dano((int)(FOR*0.1*14 - alvo.getDEF()));
	}

}
