package POO.aula_14_12_11.SistemaHospitalar;

public class Hospital {
	String nomeHospital;
	
	public Hospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	
	public void atenderPaciente(Paciente p) {
		System.out.println(p.imprimirValores());
	}
}