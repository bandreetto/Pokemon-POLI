public class Chikorita extends Pokemon{
	private int carga;

	public Chikorita() {
		id = 7;
		nome = "Chikorita";
		hp = 112;
		baseHP = 112;
		FOR = 24;
		AGI = 2;
		DEF = 14;
		tipo = "Grama";
		carga = 0;
		ataques = new String[4];
		ataques[0] = "Investida";
		ataques[1] = "Chicote de Cipo";
		ataques[2] = "Absorver";
		ataques[3] = "Raio Solar";
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
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Agua") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	// Cura a mesma quantidade de dano causado;
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
		if (carga < 1) {
			carga ++;
			System.out.println("Bulbassauro esta juntando energia!");
		} else {
			if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Grama") {
				alvo.dano((int)(FOR*0.1*40*0.5 - alvo.getDEF()));
			} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Agua") {
				alvo.dano((int)(FOR*0.1*40*1.5 - alvo.getDEF()));
			} else {
				alvo.dano((int)(FOR*0.1*40 - alvo.getDEF()));
			}
			carga--;
		}	
	}
}

