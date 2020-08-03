
public class Dependente {
	
	public int idadeDependente;
	
	//construtor
	public Dependente(int idadeDependente) {
		
		this.idadeDependente = idadeDependente;
		
	}
		
		
	public boolean naIdadeLimite(int idadeLimite){
		
		if(this.idadeDependente <= idadeLimite) {
			return true;
		}
		else {
			return false;	
		}
	}		
		
}
		

