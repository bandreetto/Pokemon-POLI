
import java.util.Scanner;
import java.util.ArrayList;

public class Treinador {
	
	private int numero;
	private String nome;
	private ArrayList<Pokemon> time_pokemons = new ArrayList<Pokemon>();
	private Pokemon ativo;
	
	public Treinador(String nom, int num, int escolha){
		int i;
		nome = nom;
		numero = num;
		montarTimePokemon(escolha);
		setAtivo(time_pokemons.get(0));	
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
	public void montarTimePokemon(int escolha){
		int i = 0, ant = 0;
		Scanner id_pok = new Scanner(System.in);
		int id;
		
		if(escolha == 1){ //escolhe time
			while(i < 6){
				System.out.println("Digite o numero do pokemon desejado para seu time [1-12]: ");
				id = id_pok.nextInt();
				if(id >=1 && id<=12 && id != ant){
					Pokemon x = criaPokemon(id);
					time_pokemons.add(x);
					ant = id;
					i++;
				}
				if( id < 1 || id > 12){
					System.out.println("Numero invalido. Escolha outro pokemon.");
				}	
			}
		}
		
		if (escolha == 2){ //escolha random
			while(i < 6){
				id = (int) (Math.random()*12 + 1);  
				if(ant != id){ //nao pode haver pokemons repetidos
					Pokemon x = criaPokemon(id);
					time_pokemons.add(x);
					ant = id;
					i++;
				}
				
			}
		}
		id_pok.close();
		
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void selecionaPokemonAtivo(){ //seleciona o primeiro pokemon do grupo ( ativo)
		
		Scanner entrada = new Scanner(System.in);
		boolean trocou = false;
		int indice;
		while(trocou == false){
			System.out.println(this.getNome() + " selecione seu pokemon inicial. ");
			this.mostrarTime();
			System.out.println("Digite o indice do pokemon inicial: ");
			indice = entrada.nextInt();
			
			if( indice >= 1 && indice <=6){
				setAtivo(time_pokemons.get(indice));
				trocou = true;
			}
			else
				System.out.println("O pokemon escolhido nao pertence a seu grupo. Digite o indice novamente.");
		
		}
		entrada.close();
		
	}//*********************************************************************************************************************
	

	//4 ?ACOES DO TREINADOR ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// fugir da batalha
	public void fugir(){
		int prior = 1;
		System.out.println("Treinador fugiu da batalha!");
		
	}
	//troca o Pokemon ativo pelo escolhido********************************************************************************
	public boolean trocarPokemon(){ //retorna um boolea pra saber se a troca foi realizada
		int prior = 2;
		
		Scanner entrada = new Scanner(System.in);
		boolean trocou = false;
		int indice;
		//troca soh pode acontecer se tiver 2 ou mais pokemons no time
		if(time_pokemons.size() >=2){
			while(trocou == false){
				this.mostrarTime();
				System.out.println("Digite o indice do pokemon desejado: ");
				indice = entrada.nextInt();
			
				if( indice > 1 && indice <= time_pokemons.size()){
					setAtivo(time_pokemons.get(indice));
					trocou = true;
				}
				else
					System.out.println("O pokemon escolhido nao pertence a seu grupo. Digite o indice novamente.");
		
			}
		}
		
		entrada.close();
		return trocou;
			
	}
	
	//usar um item
	public void usarItem(Item item){
		int prior = 3;
		
	}
	
	public void atacar(){
		int prior = 4;
		
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	// imprime o time do  treinador **************************************************************************************
	public void mostrarTime(){
		System.out.println("Time pokemon.");
		for(int i = 0; i < time_pokemons.size() ; i++){
			System.out.println("Nome Pokemon: "+time_pokemons.get(i).getNome()+" Indice: "+(i+1)+"\n");
		}
	}//********************************************************************************************************************
	
	//getters and setters
	public String getNome(){
		return nome;
	}

	public Pokemon getAtivo() {
		return ativo;
	}

	public void setAtivo(Pokemon ativo) {
		this.ativo = ativo;
	}

}
