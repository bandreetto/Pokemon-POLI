

public class Fugir extends Evento {
	private static final int prioridade = 1;
	private Treinador treinador;
	
	public Fugir(Treinador a){
		treinador = a;
	}
	
	public void acao(){
		System.out.println("Treinador "+treinador.getNome()+" fugiu da batalha!");
	}
	
	public void descricao(){
		System.out.println("Treinador fugira da batalha.");
	}

	
	
	//****************************************************************************************************************
	public int getPrioridade() {
		return prioridade;
	}
}
