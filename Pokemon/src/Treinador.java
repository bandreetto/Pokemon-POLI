import java.util.Scanner;
import java.util.ArrayList;

public class Treinador {
	
	private String nome;
	private ArrayList<Pokemon> time_pokemons = new ArrayList<Pokemon>();
	private Pokemon ativo;
	private String [] pokemons = {"Charmander", "Squirtle", "Bulbassauro", "Pikachu",
			"Cyndaquil", "Totodile", "Chikorita", "Geodude", 
			"Torchic", "Mudkip", "Treecko", "Pidgey"};
	
	private boolean Item1 = true;
	private boolean Item2 = true;
	
	public Treinador(String nom, int escolha){
		nome = nom;
		montarTimePokemon(escolha);
		setAtivo(time_pokemons.get(0));	
	} 
	
	// metodo para criar pokemon++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private Pokemon criaPokemon(int id){
		Pokemon novo = null;
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
		int i = 0, j = 0, ant = 0;
		Pokemon x;
		Scanner entrada = new Scanner(System.in);
	
		int id, escol;
		
		if (escolha == 1) { //escolhe time
			for (String p: pokemons) {
				System.out.println(++j + ". " + p);
			}
			while (i < 6) {
				System.out.println("Digite o numero do pokemon desejado para seu time [1-12]: ");
				id = entrada.nextInt();
				if (id >=1 && id<=12 && id != ant) {
					x = criaPokemon(id);
					time_pokemons.add(x);
					ant = id;
					System.out.println("Deseja escolher mais pokemons? (1)sim (2)nao: ");
						escol = entrada.nextInt();
					if(escol == 1)
						i++;
					else
						i = 6; // forca saida do laco
				} else {
					System.out.println("Numero invalido. Escolha outro pokemon.");
				}
			}
		}
		
		if (escolha == 2) { //escolha random : todos pegam 6 pokemons
			while(i < 6) {
				id = (int) (Math.random()*12 + 1);  
				if(ant != id) { //nao pode haver pokemons repetidos
					x = criaPokemon(id);
					time_pokemons.add(x);
					ant = id;
					i++;
				}
				
			}
		}
		entrada.close();
		
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void selecionaPokemonAtivo(){ //seleciona o primeiro pokemon do grupo ( ativo)
		
		Scanner entrada = new Scanner(System.in);
		boolean trocou = false;
		int indice;
		while(trocou == false){
			System.out.println(this.getNome() + " selecione seu pokemon para batalha. ");
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

	public int getIndiceAtivo(){
		return this.time_pokemons.indexOf(ativo);
	}
	public boolean isItem1() {
		return Item1;
	}

	public void setItem1(boolean item1) {
		Item1 = item1;
	}

	public boolean isItem2() {
		return Item2;
	}

	public void setItem2(boolean item2) {
		Item2 = item2;
	}
	
	public int getTamanhoTime(){
		return this.time_pokemons.size();
	}
	
	public Pokemon getPokemon(int i){
		return this.time_pokemons.get(i);
	}
	public boolean removePokemon(Pokemon a){
		return this.time_pokemons.remove(a);
		
	}
	

}