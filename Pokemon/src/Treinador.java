
import java.util.ArrayList;

public class Treinador {
	
	private int numero;
	private String nome;
	private ArrayList<Pokemon> time_pokemons = new ArrayList<Pokemon>();
	private Pokemon ativo;
	
	public Treinador(String nom, int num, int [] ids_pokemon, int escolha){
		int i;
		nome = nom;
		numero = num;
		montarTimePokemon(ids_pokemon, escolha);
		ativo = time_pokemons.get(0);	
	} 
	
	// metodo para criar pokemon++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private Pokemon criaPokemon(int id){
		Pokemon novo;
		if(id == 1)
			novo = new Charmander();
		if(id == 2)
			novo = new Squirtle();
		if(id == 3)
			novo = new Bulbassauro();
		if(id == 4)
			novo = new Pikachu();
		if(id == 5)
			novo = new Cyndaquil();
		if(id == 6)
			novo = new Totodile(); 	
		if(id == 7)
			novo = new Chikorita();
		if(id == 8)
			novo = new Geodude();
		if(id == 9)
			novo = new Torchic();
		if(id == 10)
			novo = new Mudkip();
		if(id == 11)
			novo = new Treecko();
		if(id == 12)
			novo = new Pidgey();
		
		return novo;		
	}//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//metodo para montar time pokemon++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void montarTimePokemon( int [] ids_pokemon, int escolha){
		int i = 0, igual, j;
		if ( escolha == 1){
			igual = (int) (Math.random()*12 + 1);
			while(i < 6){
				j = (int) (Math.random()*12 + 1);
				if(igual != j){
					Pokemon x = criaPokemon(j);
					time_pokemons.add(x);
					i++;
				}
				igual = j;
			}
		}
		
		if(escolha == 2){
			
		}
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void selecionaPokemonAtivo(){
		
	}
	
	// fugir da batalha
	public void fugir(){
		int prior = 1;
		
	}
	//troca o Pokemon ativo pelo escolhido
	public void trocarPokemon(Pokemon [] time, Pokemon x){
		int prior = 2;
		// o pokemon escolhido tem que estar no time!
		ativo = x;
		
	}
	//usar um item
	public void usarItem(Item item){
		int prior = 3;
		
	}
	
	public void atacar(){
		int prior = 4;
		
	}

}
