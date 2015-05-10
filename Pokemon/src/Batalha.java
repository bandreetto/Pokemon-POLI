import java.util.Scanner;

public class Batalha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int escolha, x;
		Evento []eventos = new Evento[2]; // vetor de eventos para comparacao
		boolean acao_valida;
		boolean terminou = false;
				
		System.out.println("Criando Treinadores...\n");
		
		// criando treinador 1 ***********************************************************************************************
		System.out.println("Treinador 1, digite seu nome: ");
		nome = entrada.next();
		System.out.println("Treinador 1.\n Deseja Montar time (1) ou Escolhe time aleratoriamente (2): ");
		escolha = entrada.nextInt();
		Treinador Jogador1 = new Treinador(nome, escolha);
	
		//****************************************************************************************************************
		
		//criando treinador 2 *********************************************************************************************
		System.out.println("Treinador 2 digite seu nome: ");
		nome = entrada.next();
		System.out.println("Treinador 2.\n Deseja Montar time (1) ou Escolher time aleatoriamente(2):");
		escolha = entrada.nextInt();
		Treinador Jogador2 = new Treinador(nome, escolha);
		
		//*****************************************************************************************************************
		
		//
		
		System.out.println("A batalha esta prestes a comecar! ");
		System.out.println("Treinadores escolham seus pokemons iniciais!\n ");

		//selecionando pokemon inicial*********************************************************************************8
		Jogador1.selecionaPokemonAtivo();
		Jogador2.selecionaPokemonAtivo();
		
		
		
		//fase descritiva
		System.out.println();
		System.out.println("Treinadores lancam suas pokebolas eee........");
		System.out.println("Treinador "+ Jogador1.getNome() + " comeca com o pokemon "+Jogador1.getAtivo().getNome());
		System.out.println("..............................");
		System.out.println("..............................");
		System.out.println("Treinador "+Jogador2.getNome() + " comeca com o pokemon " + Jogador2.getAtivo().getNome());
		
		
		while(!terminou){
			
			//Turno, treinadores escolhe suas acoes**********************************************************************8
			for( int i = 0; i < 2; i++){
				acao_valida = false;
				
				Treinador a = null, b = null;
				if( i == 0){
					a = Jogador1;
					b = Jogador2;
				}
				if( i == 1){
					a = Jogador2;
					b = Jogador1;
				}
			
				System.out.println("Treinador "+(i+1)+" o que deseja fazer?");
				while(!acao_valida){
					System.out.println("(1)Fugir       (2)Trocar Pokemom\n(3)Usar Item   (4)Atacar\n: ");
					x = entrada.nextInt();
						if( x == 1 || x == 3 || x == 4){
							if( x == 1)
								eventos[i] = new Fugir(a);
							else if( x == 3)
								eventos[i] = new UsaItem(a);
							else if( x == 4)
								eventos[i] = new Ataque(a, b);
							acao_valida = true;
						}
						else if( x == 2){
							if(a.getTamanhoTime()>=2){ //soh pode trocar se tiver 2 pokemons ou mais
								eventos[i] = new TrocarPokemon(a);
								acao_valida = true;
							}
							else if (a.getTamanhoTime() == 1)
								System.out.println("Nao eh possivel trocar pokemon, vc tem apenas 1!");
						}
						
						else
							System.out.println("Opcao invalida. Escolha novamente");
				}	//fecha laco	
			}//fecha escolha de acoes************************************************************************************
			
			//comeca faze de turnos*****************************************************************************************
			if( eventos[0].getPrioridade() == 1 || eventos[1].getPrioridade() == 1){
				if (eventos[0].getPrioridade() == 1){
					eventos[0].acao();	//vence treinador 2
				}
				else if(eventos[1].getPrioridade() == 1){
					eventos[1].acao(); //vence treinador 1
				}
				terminou = true; // se qualquer um fugir termina
			} 
			else{
				if (eventos[0].getPrioridade() > eventos[1].getPrioridade()){
					eventos[0].acao();
					eventos[1].acao();
				}
				else if (eventos[1].getPrioridade() > eventos[0].getPrioridade()){
					eventos[1].acao();
					eventos[0].acao();
				}
			}
			
			
		}//fecha jogo
			
		
		
		
		
		
		
		entrada.close();
	}
}