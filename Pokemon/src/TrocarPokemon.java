
import java.util.Scanner;


public class TrocarPokemon extends Evento{
	private final static int prioridade = 2;
	private Treinador treinador;
	private int novo_indice; //indice do pokemon a ser colocado como ativo
	
	public TrocarPokemon(Treinador a){
		treinador = a;
		this.escolherPokemon();
	}
	//*************************************************************************************************
	public void escolherPokemon(){
		int indice_ativo = treinador.getIndiceAtivo() + 1; //pego indice do ativo
		Scanner entrada = new Scanner(System.in);
		boolean trocavalida = false;
		int ind;
		
		
		while(!trocavalida){
			treinador.mostrarTime();
			System.out.println("Digite o indice do pokemon desejado: ");
			ind = entrada.nextInt();
			if( ind >= 1 && ind <= treinador.getTamanhoTime()){
				if( ind == indice_ativo)
					System.out.println("Este pokemon ja esta batalhando!");
				else{
					novo_indice = ind - 1;
					trocavalida = true;
				}
				
			}
			else
				System.out.println("Opcao invalide. Escolha outro numero.");
		
		}
		entrada.close();
	}
	//******************************************************************************************************
	
	public void acao(){
		treinador.setAtivo(treinador.getPokemon(novo_indice));
			
	}
	
	public void descricao(){
		System.out.println("Treinador "+treinador.getNome()+" trocou o seu pokemon ativo");
	}
	
	
	//******************************************************************************************************
	public int getPrioridade() {
		return prioridade;
	}
	
	
	
}
