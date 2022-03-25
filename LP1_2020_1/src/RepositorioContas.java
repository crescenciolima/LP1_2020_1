
public class RepositorioContas {
	private ContaAbstrata [] contasBD;
	private int indice;
	
	public RepositorioContas(){
		contasBD = new ContaAbstrata[5];
		indice = 0;
	}
	
	public void inserir(ContaAbstrata c){
		contasBD[indice] = c;
		indice++;
	}
	
	public void imprimir(){
		System.out.println("Relatorio de Contas");
		for (int i = 0; i < indice; i++) {
			System.out.println("---------");
			System.out.println("Numero Conta " + (i+1) + ": "  + contasBD[i].getNumero());
			System.out.println("Saldo: " + contasBD[i].getSaldo());
			
		}
	}
	
}
