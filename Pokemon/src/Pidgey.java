
public class Pidgey extends Pokemon{

	public Pidgey() {
		id = 12;
		nome = "Pidgey";
		hp = 111;
		baseHP = 111;
		FOR = 27;
		AGI = 8;
		DEF = 13;
		tipo = "Voador";
		ataques = new String[4];
		ataques[0] = "Ventania";
		ataques[1] = "Ataque Rapido";
		ataques[2] = "Ataque de Areia";
		ataques[3] = "Ciclone";
	}

	@Override
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Grama") {
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
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() != "Voador"){
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		} else {
			System.out.println(alvo.getNome() + "não é afetado por Ataque de Areia");
		}
	}

	@Override
	public void ataque4(Pokemon alvo) {
		alvo.dano((int)(FOR*0.1*14 - alvo.getDEF()));
	}

}
