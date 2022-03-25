import java.util.Scanner;


public class Conceitos {
	
	public static void relatorio(int idade, double media, int maior){
		System.out.println("Jornal Online");
		System.out.println("Relatorio estatistico");
		System.out.println("Idade do leitor mais velho: " + idade);
		System.out.println("Media de salario das mulheres: " + media);
		System.out.println("Quantidade de salario maior que mil: " + maior);
	}
	
	
	public static void main(String[] args) {
//		1.	Um jornal online deseja uma pesquisa para verificar o 
//		perfil dos seus leitores. O jornal entrevistará uma quantidade 
//		indeterminada de leitores. Para cada leitor são lidos os 
//		seguintes dados: idade, sexo(1-fem/2-mas) e salário. 
//		O jornal deseja saber:
//			1.1.	 Idade do leitor mais velho; 
//			1.2.	 Média do salário das mulheres; 
//   		1.3.	 Quantidade de leitores com salário maior que R$ 1000,00;
//			1.4. Qual o tipo de assinatura que ele assina? (R$15,00 normal e R$ 20,00 VIP);
//			1.5. Quando finalizar o programa, exibir o relatório.
		int op = 0;
		int idade, sexo, servico;
		int mais_velho = 0, qtd_mul = 0, maior_mil = 0;
		double salario, serv_valor, media_sal_mul = 0;
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("Jornal Online");
			System.out.println("Dados do leitor");
			System.out.println("Idade: ");
			idade = input.nextInt();
			System.out.println("Sexo (1 - fem / 2 - masc): ");
			sexo = input.nextInt();
			System.out.println("Salario: ");
			salario = input.nextDouble();
			System.out.println("Servico (1 - VIP / 2 - normal): ");
			servico = input.nextInt();
			
			if (servico == 1){
				serv_valor = 20.00;
			} else if(servico == 2){
				serv_valor = 15.00;
			} else {
				System.out.println("Opcao invalida");
				serv_valor = 0.00;
			}
			System.out.println("--------------------");
			System.out.println("Valor do servico: " + serv_valor);
			System.out.println("--------------------");
			
			if (idade > mais_velho)
				mais_velho = idade;
			
			if (sexo == 1){
				qtd_mul++;
				media_sal_mul += salario;
			}
			
			if(salario > 1000){
				maior_mil++;
			}
			
			System.out.println("Cadastrar Outro (1 - sim / 0 - nao)");
			op = input.nextInt();
			
		}while(op == 1);
		
		media_sal_mul = media_sal_mul/qtd_mul;
		
		relatorio(mais_velho, media_sal_mul, maior_mil);
		
	}
}
