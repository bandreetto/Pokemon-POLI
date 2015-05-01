
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
	
	abstract public void ataque1(Pokemon alvo);
	abstract public void ataque2(Pokemon alvo);
	abstract public void ataque3(Pokemon alvo);
	abstract public void ataque4(Pokemon alvo);
		
}