
public class Mudkip extends Pokemon{

	public Mudkip() {
		id = 10;
		nome = "Mudkip";
		hp = 108;
		baseHP = 108;
		FOR = 25;
		AGI = 5;
		DEF = 13;
		tipo = "Agua";
		ataques = new String[4];
		ataques[0] = "Jato de Agua";
		ataques[1] = "Investida";
		ataques[2] = "Ataque de Lama";
		ataques[3] = "Lancamento de Rocha";
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
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}

	@Override
	public void ataque3(Pokemon alvo) {
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

	@Override
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Voador" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}
}
