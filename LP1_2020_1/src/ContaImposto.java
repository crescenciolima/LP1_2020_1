
public class ContaImposto extends ContaAbstrata{
	
	public static final double TAXA = 0.01;
	
	public ContaImposto(String numero, double saldo){
		super(numero, saldo);
	}
	
	public void debitar(double valor){
		double imposto = valor * TAXA;
		if((valor + imposto) <= saldo){
			saldo -= (valor+imposto);
		}else{
			System.out.println("Saldo Insuficiente");
		}
	}

}
