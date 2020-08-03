
import java.util.ArrayList;
import java.util.Scanner;

public class FolhaPagamento {

	
	public static ArrayList <Funcionarios> todosFuncionarios;
	
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Informe a quantidade de funcionários que você deseja cadastrar: ");
		int qtdeFuncionarios = teclado.nextInt();teclado.nextLine();
		
		todosFuncionarios = new ArrayList<Funcionarios>();
		
		
		
		int c = 0;
		
		while(c < qtdeFuncionarios) {
			
			System.out.println("-*-*-*- Funcionário " + (c + 1) + " -*-*-*-");
			
			System.out.println("Informe o código do funcionário:");
			int codigoFunc = teclado.nextInt();teclado.nextLine();
			
			System.out.println("Informe o salário base do funcionário:");
			double salarioBase = teclado.nextDouble();
			
			System.out.println("Informe o tipo de funcionário:");
			System.out.println("1 - Concursado");
			System.out.println("2 - Temporário\n");
			int tipoFuncionario = teclado.nextInt();teclado.nextLine();
			
			
			
			System.out.println("Informe a quantidade de dependentes associadas a este funcionário: ");
			int qtdeDependentes = teclado.nextInt();teclado.nextLine();
			
		
			ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
			
		
				
			int i = 0;
			while (i < qtdeDependentes) {
				System.out.println("--- Dependentes ---");
						
				System.out.println("Informe a idade: ");
				int idadeDependente = teclado.nextInt(); teclado.nextLine();
						
			
				//cria um novo dependente
				Dependente d = new Dependente(idadeDependente);
						
				//adiciona dependente em lista temporária
				dependentes.add(d);
						
				i++;
					 
			}
			
					
				// fim dos dependentes,
				
				
			if (tipoFuncionario == 1) {
				System.out.println("Informe o tempo(anos) de trabalho: ");
				int anosTrabalho = teclado.nextInt();teclado.nextLine();
				
				Concursados funcionario = new Concursados(anosTrabalho, codigoFunc, salarioBase);
				
				//associando os dependentes
				for (Dependente d: dependentes) {
					funcionario.associaDependente(d);
				}
				//fim da associacao
				
				todosFuncionarios.add(funcionario);
				
				
			}
			else {
				System.out.println("Informe a quantidade de meses de trabalho: ");
				int mesesTrabalho = teclado.nextInt();teclado.nextLine();
				
				Temporarios funcionario = new Temporarios(mesesTrabalho, codigoFunc, salarioBase);
				
				//associando os dependentes
				for (Dependente d: dependentes) {
					funcionario.associaDependente(d);
				}
				//fim da associacao
				
				todosFuncionarios.add(funcionario);
			}
			
			
		
			c++;
		}
		
		for(Funcionarios funcionario: todosFuncionarios) {
			funcionario.imprimeFuncionarios();
		}
		
		
		
	}
}
