import java.util.ArrayList;


public class Funcionarios {
	
	public int codigoFunc;
	public double salarioBase;
	
	//lista de dependentes
	public ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
	
	
	public boolean associaDependente(Dependente d) {
				
		if(dependentes.size() > 5) {
			System.out.println("Você não esta autorizado a adicionar novos dependentes");
			return false;
		}
		else {
			dependentes.add(d);
			return true;
		}
		
	}
	

	public int confereIdades(int idadeLimite) {
		
		int cont = 0;
		
		for (Dependente a: dependentes){
			if(a.naIdadeLimite(idadeLimite))
				cont++;
			
		}
		return cont;
		
			
	}
	
	
	public void imprimeFuncionarios() {
		
		System.out.println("Código: " + this.codigoFunc);
		System.out.println("Salário Base: " + this.salarioBase);
		
	}
	

	
}
	