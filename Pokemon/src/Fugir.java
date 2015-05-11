

public class Fugir extends Evento {
	private static final int prioridade = 1;
	private Treinador treinador1;

	
	public Fugir(Treinador a){
		treinador1 = a;
	}
	
	public void acao(){
		System.out.println("Treinador "+treinador1.getNome()+" fugiu da batalha!");
	}
	
	public void descricao(){
		System.out.println("Treinador fugira da batalha.");
	}

	
	
	//****************************************************************************************************************
	public int getPrioridade() {
		return prioridade;
	}
}
