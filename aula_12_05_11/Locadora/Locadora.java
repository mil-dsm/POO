package POO.aula_12_05_11.Locadora;

public class Locadora {
    Veiculo v1, v2, v3;
    
    public Locadora() {
        v1 = null;
        v2 = null;
        v3 = null;
    }
    
    public boolean cadastrarVeiculo(Veiculo nomeVeiculo){
        if(v1 == null){
            v1 = nomeVeiculo;
        } else if(v2 == null){
            v2 = nomeVeiculo;
        } else if(v3 == null){
            v3 = nomeVeiculo;
        } else{
            return (false);
        }
        return (true);
    }
    
    public boolean alugarVeiculo(String placa, String nome, int idade){
        if(v1 != null && v1.placa.equals(placa)){
            return v1.alugar(nome, idade);
        } else if(v2 != null && v2.placa.equals(placa)){
            return v2.alugar(nome, idade);
        } else if(v3 != null && v3.placa.equals(placa)){
            return v3.alugar(nome, idade);
        } else{
            return (false);
        }
    }
    
    public boolean devolverVeiculo(String placa){
        if(v1 != null && v1.placa.equals(placa)){
            return v1.devolver();
        } else if(v2 != null && v2.placa.equals(placa)){
            return v2.devolver();
        } else if(v3 != null && v3.placa.equals(placa)){
            return v3.devolver();
        } else{
            return (false);
        }
    }
    
    public void listarVeiculos() {
        if(v1 == null)
            System.out.println("empty slot");
        else
            v1.toString();
        if(v2 == null)
            System.out.println("empty slot");
        else
            v2.toString();
        if(v3 == null)
            v3.toString();
        else
            System.out.println(v3);
    }
    
    public int contarAlugados(){
    	int totalAlugados = 0;
        if(v1 != null && !v1.disponivel){
            totalAlugados++;
        }
        if(v2 != null && !v2.disponivel){
            totalAlugados++;
        }
        if(v3 != null && !v3.disponivel){
            totalAlugados++;
        }
        return (totalAlugados);
    }
}