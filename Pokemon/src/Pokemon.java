
public abstract class Pokemon {
	private int numero;
	private String tipo;
	private String nome;
	private int hp;
	private String[] ataques;
	
	
	public void ataque1(Pokemon alvo) {}
	
	public void ataque2(Pokemon alvo) {}
	
	public void ataque3(Pokemon alvo) {}
		
	public void ataque4(Pokemon alvo) {}
	
	public boolean morreu() {
		if (hp <= 0) return true;
		return false;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void dano(int n) {
		hp -= n;
	}
		
}