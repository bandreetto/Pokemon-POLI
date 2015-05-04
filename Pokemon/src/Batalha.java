import java.util.Scanner;

public class Batalha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int escolha, indice, x;
		int [] opcao = new int[2];
		boolean trocou1 = false, trocou2 = false, valido;
		
		String [] nome_pokemon = new String[]{"Charmander", "Squirtle", "Bulbassauro", "Pikachu", "Cyndaquil", "Totodile", "Chikorita", "Geodude", "Torchic", "Mudkip", "Treecko", "Pidgey"};
		
		System.out.println("Criando Treinadores...\n");
		
		// criando treinador 1 ***********************************************************************************************
		System.out.println("Treinador 1, digite seu nome: ");
		nome = entrada.next();
		System.out.println("Treinador 1.\n Deseja Montar time (1) ou Escolhe time aleratoriamente (2): ");
		escolha = entrada.nextInt();
		Treinador Jogador1 = new Treinador(nome, 1, escolha);
	
		//****************************************************************************************************************
		
		//criando treinador 2 *********************************************************************************************
		System.out.println("Treinador 2 digite seu nome: ");
		nome = entrada.next();
		System.out.println("Treinador 2.\n Deseja Montar time (1) ou Escolher time aleatoriamente(2):");
		escolha = entrada.nextInt();
		Treinador Jogador2 = new Treinador(nome, 2, escolha);
		
		//*****************************************************************************************************************
		
		//
		
		System.out.println("A batalha esta prestes a comecar! ");
		System.out.println("Treinadores escolham seus pokemons iniciais!\n ");

		//selecionando pokemon inicial*********************************************************************************8
		while(trocou1 == false){
			System.out.println(Jogador1.getNome() + " selecione seu pokemon inicial. ");
			Jogador1.mostrarTime();
			System.out.println("Digite o indice do pokemon inicial: ");
			indice = entrada.nextInt();
			
			if( indice >= 1 && indice <=6){
				Jogador1.selecionaPokemonAtivo(indice);
				trocou1 = true;
			}
			else
				System.out.println("O pokemon escolhido nao pertence a seu grupo. Digite o indice novamente.");
		
		}
		System.out.println("Jogador 2, escolha seu pokemon inicial...");
		
		//Treinador 2 selecionando pokemon inicial*************************************************************************
		while(trocou2 == false){
			System.out.println(Jogador2.getNome() + " selecione seu pokemon inicial. ");
			Jogador2.mostrarTime();
			System.out.println("Digite o indice do pokemon inicial: ");
			indice = entrada.nextInt();
			
			if( indice >= 1 && indice <=6){
				Jogador2.selecionaPokemonAtivo(indice);
				trocou2 = true;
			}
			else
				System.out.println("O pokemon escolhido nao pertence a seu grupo. Digite o indice novamente.");
		
		}
		//fase descritiva
		System.out.println("Treinadores lancam suas pokebolas eee........");
		System.out.println("Treinador "+ Jogador1.getNome() + " comeca com o pokemon "+Jogador1.getAtivo().getNome());
		System.out.println("..............................");
		System.out.println("..............................");
		System.out.println("Treinador "+Jogador2.getNome() + " comeca com o pokemon " + Jogador2.getAtivo().getNome());
		
		//1 turno
		for( int i = 0; i < 2; i++){
			valido = false;
			System.out.println("Treinador "+(i+1)+" o que deseja fazer?");
			while(!valido){
				System.out.println("(1)Fugir       (2)Trocar Pokemom\n(3)Usar Item   (4)Atacar\n: ");
				x = entrada.nextInt();
				if( x >= 1 && x <= 4){
					opcao[i] = x;
					valido = true;
				}
				else
					System.out.println("Opcao invalida");
			}
		}
		
		
		
		
		entrada.close();
	}

}
