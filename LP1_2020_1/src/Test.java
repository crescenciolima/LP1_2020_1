import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome do curso: ");
		String nome_curso = input.nextLine();
		System.out.println("Codigo do Curso: ");
		int codigo = input.nextInt();
		
		Curso BSI = new Curso(codigo, nome_curso);
		Aluno old_aluno = new Aluno("Danilo", "123", 21, BSI);
		
		Curso teste = new Curso();
		teste.relatorio();
		
		old_aluno.relatorio();
		
	}
}
