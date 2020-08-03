
public class Concursados extends Funcionarios {
	
	public int anosTrabalho;
	
	//construtor
	public Concursados(int anosTrabalho, int codigoFunc, double salarioBase) {
		super();
		this.anosTrabalho = anosTrabalho;
		super.codigoFunc = codigoFunc;
		super.salarioBase = salarioBase;
		

	}
	
	public void imprimeFuncionarios() {
		 
		System.out.println("========== FUNCIONÁRIO CONCURSADO ==========");
		 
		super.imprimeFuncionarios();
		 
		System.out.println("Anos de trabalho: " + this.anosTrabalho + " anos.");
		
		int contdep = this.confereIdades(21);
		
		System.out.println("Salário final: " + this.calculaSalario(contdep));
	 }
	
	
		public double calculaSalario(int contdep) { 
			
			return this.salarioBase + (this.anosTrabalho * 200) + (contdep * 100);
		}
}


