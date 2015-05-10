
import java.util.Scanner;

public class UsaItem extends Evento{
	private final static int prioridade = 3;
	private Treinador treinador;
	private int Item;
	
	public UsaItem(Treinador a){ //usa item "i" no pokemon alvo
		treinador = a;	
		this.escolherItem();
	}
	//****************************************************************************************************
	public void escolherItem(){
		int b;
		boolean esc = false;
		Scanner a = new Scanner(System.in);
		
		while (esc == false){
			//tem item1 e item 2**********************************************************************
			if(treinador.isItem1() && treinador.isItem2()){
				System.out.println("Escolha o item de cura desejado.\n(1)Item1 cura 50hp quantidade = 1\n(2)Item2 cura 100hp quantidade = 1: ");
				b = a.nextInt();
				if(b == 1 || b == 2){
					Item = b;
					esc = true;
				}
				else
					System.out.println("Este item nao existe.");
			}
			//tem item1 e nao tem item2**************************************************************
			if(treinador.isItem1() && !treinador.isItem2()){
				System.out.println("Escolha o item de cura desejado.\n(1)Item1 cura 50hp quantidade = 0\n(2)Item2 cura 100hp quantidade = 1: ");
				b = a.nextInt();
				if(b == 1){
					Item = b;
					esc = true;
				}
				if(b == 2)
					System.out.println("Voce nao tem mais este item!");
				else
					System.out.println("Este item nao existe.");
			}
			
			
			//tem item2 e nao tem item1 ******************************************************************
			if(!treinador.isItem1() && treinador.isItem2()){
				System.out.println("Escolha o item de cura desejado.\n(1)Item1 cura 50hp quantidade = 1\n(2)Item2 cura 100hp quantidade = 0: ");
				b = a.nextInt();
				if(b == 2){
					Item = b;
					esc = true;
				}
				if(b == 1)
					System.out.println("Voce nao tem mais este item!");
				else
					System.out.println("Este item nao existe.");
			}
			//*********************************************************************************************	
		}
		a.close();
	}
	//*************************************************************************
	public void acao(){
		this.descricao();
		//na escolha do item ja garanto que o numero seja de um Item que existe
		if(Item == 1){
				treinador.getAtivo().cura(50);
				treinador.setItem1(false);			
		}
		
		if(Item == 2){
				treinador.getAtivo().cura(100);
				treinador.setItem2(false);
		}	
	}
	
	public void descricao(){
		System.out.println("Treinador "+treinador.getNome()+" usou o item "+Item+" em seu pokemon.");
		
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getPrioridade() {
		return prioridade;
	}

}
