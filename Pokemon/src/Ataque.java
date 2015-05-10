
import java.util.Scanner;

public class Ataque extends Evento {

	private final static int  prioridade = 4;
	private Treinador treinadordois;
	private Pokemon atacante;
	private Pokemon alvo;
	private int ataque;
	
	public Ataque(Treinador Atacante, Treinador Alvo){
		treinadordois = Alvo;
		atacante = Atacante.getAtivo();
		alvo = Alvo.getAtivo();
		escolherAtaque();
	}
	//*******************************************************************************
	public void escolherAtaque(){
		boolean escolheu = false;
		Scanner a = new Scanner(System.in);
		int b;
		
		while(!escolheu){
			imprimeAtaques(atacante);
			System.out.println("Escolha o ataque: ");
			b = a.nextInt();
			if(b >= 1 && b<= 4){
				ataque = b;
				escolheu = true;
			}
			else
				System.out.println("Escolha um ataque valido (1-4).");
		}
		a.close();
	}
	
	public void imprimeAtaques(Pokemon a){
		int i;
		System.out.println("Habilidades do seu pokemon.");
		for(i = 0; i < 4 ; i++)
			System.out.println("("+(i+1)+")"+a.getAtaque(i)+"\n");
	}
	//****************************************************************************************
	
	public void acao(){
		this.descricao();
		if(ataque == 1)
			atacante.ataque1(alvo);
		else if(ataque == 2)
			atacante.ataque2(alvo);
		else if(ataque == 3)
			atacante.ataque3(alvo);
		else if(ataque == 4)
			atacante.ataque4(alvo);
		else
			System.out.println("Ataque nao disponivel");
		
		if(alvo.morreu()){
			boolean morreu = treinadordois.removePokemon(alvo);
			treinadordois.selecionaPokemonAtivo();	
		}
	}
	
	
	
	public void descricao(){
		System.out.println("Pokemon "+atacante+" atacara o pokemon " +alvo+" com "+ atacante.getAtaque(ataque-1));
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getPrioridade() {
		return prioridade;
	}

	
}
