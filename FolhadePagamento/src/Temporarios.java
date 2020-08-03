
public class Temporarios extends Funcionarios {
	
	public int mesesTrabalho;
	
	public Temporarios(int mesesTrabalho, int codigoFunc, double salarioBase) {
		super();
		this.mesesTrabalho = mesesTrabalho;
		super.codigoFunc = codigoFunc;
		super.salarioBase = salarioBase;
		
	}
			
	public void imprimeFuncionarios() {
		 
		System.out.println("========== FUNCIONÁRIO TEMPORÁRIO ==========");
		 
		super.imprimeFuncionarios();
		 
		System.out.println("Meses de trabalho: " + this.mesesTrabalho + " meses.");
		
		int contdep = this.confereIdades(18);
		
		System.out.println("Salário final: " + this.calculaSalario(contdep));
	 }
	
	
		public double calculaSalario(int contdep) { 
			
			return this.salarioBase + (this.mesesTrabalho * 15) + (contdep * 50);
		}
}
