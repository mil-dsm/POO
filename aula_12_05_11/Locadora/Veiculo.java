package POO.aula_12_05_11.Locadora;

public class Veiculo {
    String placa;
    boolean disponivel;
    String nomeLocatario;
    int idadeLocatario;
    
    public Veiculo(String placa){
        this.placa = placa;
        disponivel = true;
        nomeLocatario = null;
        idadeLocatario = 0;
    }
    
    public boolean alugar(String nomeLocatario, int idadeLocatario){
        if(disponivel && idadeLocatario >= 18){
            this.nomeLocatario = nomeLocatario;
            this.idadeLocatario = idadeLocatario;
            disponivel = false;
            return (true);
        }
        return (false);
    }
    
    public boolean devolver(){
        if(!disponivel){
            disponivel = true;
            nomeLocatario = null;
            idadeLocatario = 0;
            return (true);
        }
        return (false);
    }
    
    public String toString(){
        return "Placa: " + placa + ", Disponivel: " + (disponivel == true ? "sim" : "nao") 
        + ", Locatario: " + (disponivel == true ? "(empty)" : nomeLocatario + ":" + idadeLocatario);
    }
}