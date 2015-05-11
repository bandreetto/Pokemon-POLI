import java.util.Scanner;

public class Batalha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int escolha, x;
		Evento []eventos = new Evento[2]; // vetor de eventos para comparacao
		boolean acao_valida;
		boolean terminou1 = false, terminou2 = false;
				
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
		
		
		while(!terminou1 || !terminou2){
			
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
						if( x == 1 || x == 4){
							if( x == 1)
								eventos[i] = new Fugir(a);
							
							else // x = 4
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
						
						else if( x == 3){ //so pode escolher item se tiver!
							if(a.isItem1() || a.isItem2()){
								eventos[i] = new UsaItem(a);
								acao_valida = true;
							}
							else
								System.out.println("Voce nao tem mais items de cura! Escolha outra acao");
						}
						
						else
							System.out.println("Opcao invalida. Escolha novamente");
				}	//fecha laco	
			}//fecha escolha de acoes************************************************************************************
			
			//comeca faze de turnos*****************************************************************************************
			//caso de fuga***********************************************************************************************
			if( eventos[0].getPrioridade() == 1 || eventos[1].getPrioridade() == 1){
				if (eventos[0].getPrioridade() == 1 || (eventos[0].getPrioridade() == 1 && eventos[1].getPrioridade() == 1)){ 
					eventos[0].acao();	//vence treinador 2 . Se AMBOS tentarem fugir, o treinador 1 foge primeiro e o 2 vence
					terminou2 = true;
				}
				else if(eventos[1].getPrioridade() == 1){
					eventos[1].acao(); //vence treinador 1
					terminou1 = true;
				}
				// se qualquer um fugir termina
			} 
			
			//caso de ataques**************************************************************************************************
			else if(eventos[0].getPrioridade() == 4 || eventos[1].getPrioridade() == 4 ){ // no caso de ataque
				if(eventos[0].getPrioridade() == 4 || (eventos[0].getPrioridade() == 4 && eventos[1].getPrioridade() == 4)){
					//se os dois escolherem ataque jogador 1 ataca primeiro
					eventos[0].acao();
					if(Jogador2.getAtivo().morreu()){
						boolean morreu = Jogador2.removePokemon(Jogador2.getAtivo());
						Jogador2.setAtivo(null);
						if(Jogador2.getTamanhoTime() <=0)
							terminou1 = true;
						else
							Jogador2.selecionaPokemonAtivo();
					}
					eventos[1].acao();
				}
				else{ //se evento[1] eh 4 e [0] nao
					eventos[1].acao();
					if(Jogador1.getAtivo().morreu()){
						boolean morreu = Jogador1.removePokemon(Jogador1.getAtivo());
						Jogador1.setAtivo(null);
						if(Jogador1.getTamanhoTime() <= 0)
							terminou2 = true;
						else
							Jogador1.selecionaPokemonAtivo();
					}
					eventos[0].acao();
				} 		
			}//fecha caso de ataque
	
			
			else{ // caso cura(prior 3) e troca(prior 2)
				if (eventos[0].getPrioridade() > eventos[1].getPrioridade()){
					eventos[0].acao();
					eventos[1].acao();
				}
				else if (eventos[1].getPrioridade() > eventos[0].getPrioridade()){
					eventos[1].acao();
					eventos[0].acao();
				}
			}
			
		}//sai do laco com terminou
		
		if(terminou1)
			System.out.println("O Jogo terminou. Treinador 1 "+Jogador1.getNome()+" eh o vencedor!");
		if(terminou2)
			System.out.println("O Jogo terminou. Treinador 1 "+Jogador2.getNome()+" eh o vencedor!");
		
		System.out.println("Fim de jogo.");
		
		entrada.close();
	}
}