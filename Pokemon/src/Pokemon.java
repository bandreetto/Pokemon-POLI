
public abstract class Pokemon {
	private int hp;
	private String nome;
	
	public boolean morreu() {
		if (hp <= 0) return true;
		return false;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void dano(int n) {
		hp -= n;
	}
	
	abstract public int getFOR();
	abstract public int getAGI();
	abstract public int getDEF();
	abstract public String getTipo();
		
}