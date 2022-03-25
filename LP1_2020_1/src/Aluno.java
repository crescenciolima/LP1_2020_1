
public class Aluno {
	private String nome;
	private String cpf;
	private int idade;
	private Curso cursoAluno;
	
	public Aluno(String nome, String cpf, int idade, Curso cursoAluno){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cursoAluno = cursoAluno;
	}
	
	public void relatorio(){
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade); 
		cursoAluno.relatorio();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Curso getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(Curso cursoAluno) {
		this.cursoAluno = cursoAluno;
	}	
}
