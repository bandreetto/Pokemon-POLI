

public abstract class Evento {
	
	
	protected boolean ocorreu;
	
	abstract public int getPrioridade();
	abstract public void acao();
	abstract public void descricao();

}
