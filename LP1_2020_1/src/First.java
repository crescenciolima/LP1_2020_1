

public class First {
		
	public static void main(String[] args) {
		Conta C1 = new Conta("555", 25.50);
		Conta C2 = new Conta("123", 100.0);
		Conta C3 = new Conta("444", 250.0);
		Poupanca P1 = new Poupanca("333", 150.0);
		ContaImposto I1 = new ContaImposto("456", 200.00);
		
		C1.creditar(100);
		C1.debitar(120);
		P1.creditar(100);
		P1.debitar(50);
		//C1.renderjuros(0.01);
		P1.renderJuros(0.01);
		I1.debitar(10.0);
		
		RepositorioContas BD = new RepositorioContas();
		BD.inserir(C1);
		BD.inserir(C2);
		BD.inserir(C3);
		BD.inserir(P1);
		BD.inserir(I1);
		
		BD.imprimir();
		
		
	}
}
