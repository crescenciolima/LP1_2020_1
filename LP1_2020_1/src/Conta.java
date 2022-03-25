
public class Conta extends ContaAbstrata{
	
	public Conta(String numero, double saldo){
		super(numero, saldo);
	}
	
	public void debitar(double valor){
		if(saldo > valor){
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void imprimir(){
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
}
