import java.util.Scanner;


public class Curso {
	private int codigo;
	private String nome;
	
	public Curso(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Curso(){
		Scanner input = new Scanner(System.in);
		System.out.println("Nome do curso: ");
		nome = input.nextLine();
		System.out.println("Codigo do Curso: ");
		codigo = input.nextInt();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void relatorio(){
		System.out.println("Nome do Curso: " + nome);
		System.out.println("Codigo: " + codigo);
	}
}
