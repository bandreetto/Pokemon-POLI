
public class Geodude extends Pokemon{

	public Geodude() {
		id = 8;
		nome = "Geodude";
		hp = 116;
		baseHP = 116;
		FOR = 21;
		AGI = 4;
		DEF = 18;
		tipo = "Pedra";
		ataques = new String[4];
		ataques[0] = "Poder Oculto";
		ataques[1] = "Lançamento de Rocha";
		ataques[2] = "Mega-Soco";
		ataques[3] = "Tempestade de Areia";
		
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
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Voador") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() != "Voador"){
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		} else {
			System.out.println(alvo.getNome() + "não é afetado por Tempestade de Areia");
		}
	}

}
