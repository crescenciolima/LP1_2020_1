
public abstract class ContaAbstrata {
	protected String numero;
	protected double saldo;
	
	public ContaAbstrata(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public void creditar(double valor){
		this.saldo += valor;
	}
	
	public abstract void debitar(double valor);


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
