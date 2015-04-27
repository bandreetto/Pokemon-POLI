
import java.util.ArrayList;
public class Treinador {

	private int numero;
	private String nome;
	private ArrayList<Pokemon> time_pokemons = new ArrayList<Pokemon>();
	private Pokemon ativo;
	
	public Treinador(String nom, int num){
		int i;
		nome = nom;
		numero = num;
		montarTimePokemon();
		ativo = time_pokemons[0];
		
		
	} 
	//classe para monta time pokemon
	public void montarTimePokemon(){
		for(i = 0; i< 6; i++){
			time_pokemons[i] = 
		}
	}
	
	public void selecionaPokAtivo(){
		
	}
	
	//troca o Pokemon ativo pelo escolhido
	public void trocarPokemon(Pokemon [] time; Pokemon x){
		// o pokemon escolhido tem que estar no time!
		ativo = x;
		
	}
	
	public void fugir(){
		
		
	}
	public void
	public void usarItem(Item item){
		
	}
	
	public void atacar(){
		
	}

}
