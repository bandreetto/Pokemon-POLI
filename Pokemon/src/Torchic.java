
public class Torchic extends Pokemon {
	public Torchic() {
		id = 8;
		nome = "Torchic";
		hp = 107;
		baseHP = 107;
		FOR = 25;
		AGI = 11;
		DEF = 12;
		tipo = "Fogo";
		ataques = new String[4];
		ataques[0] = "Brasas";
		ataques[1] = "Arranhao";
		ataques[2] = "Bicada";
		ataques[3] = "Furia";
		
	}
	
	// a seguir os ataques de charmander já respeitando fraquezas e vantagens
	// Fórmula Dano = (FOR*0.1)*ATQ BASE*FRAQUESA/RESISTÊNCIA - DEFESA ALVO
	public void ataque1(Pokemon alvo) {
		if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Agua" || alvo.getTipo() == "Pedra" || alvo.getTipo() == "Fogo") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}
	
	public void ataque2(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)(FOR*0.1*15*0.5 - alvo.getDEF())); 
		} else {
			alvo.dano((int)(FOR*0.1*15 - alvo.getDEF()));
		}
	}
	
	public void ataque3(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra" || alvo.getTipo() == "Eletrico") {
			alvo.dano((int)(FOR*0.1*20*1.5 - alvo.getDEF()));
		} else if (alvo.getTipo() == "Grama") {
			alvo.dano((int)(FOR*0.1*20*0.5 - alvo.getDEF()));
		} else {
			alvo.dano((int)(FOR*0.1*20 - alvo.getDEF()));
		}
	}
	
	// A furia depende do hp restante do pokemon, quanto menor o hp maior o dano
	public void ataque4(Pokemon alvo) {
		if (alvo.getTipo() == "Pedra") {
			alvo.dano((int)((10/(double)hp)*(FOR*0.1*50*0.5 - alvo.getDEF())));
		} else {
			alvo.dano((int)((10/(double)hp)*(FOR*0.1*50 - alvo.getDEF())));
		}
	}
}
