
public abstract class Pokemon {
	protected int hp, baseHP, FOR, AGI, DEF;
	protected String tipo;
	protected String [] ataques;
	
	public int getHP() {
		return hp;
	}
	
	public int getBaseHP() {
		return baseHP;
	}
	
	public int getFOR() {
		return FOR;
	}

	public int getAGI() {
		return AGI;
	}
	
	public int getDEF() {
		return DEF;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String [] ataques() {
		return ataques;
	}
	
	public boolean morreu() {
		if (hp <= 0) return true;
		return false;
	}
	
	public void dano(int n) {
		if (n <= 0) hp--;
		else hp -= n;
	}
	
	public void cura(int n) {
		if ((hp + n) > baseHP) hp = baseHP;
		else hp += n;
	}
	
	
	abstract public void ataque1(Pokemon alvo);
	abstract public void ataque2(Pokemon alvo);
	abstract public void ataque3(Pokemon alvo);
	abstract public void ataque4(Pokemon alvo);
		
}