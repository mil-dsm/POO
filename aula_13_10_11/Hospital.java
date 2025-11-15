package POO.aula_13_10_11;

public class Hospital {
	String nomeHospital;
	
	public Hospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	
	public void atenderPaciente(Paciente p) {
		System.out.println(p.imprimirValores());
	}
}