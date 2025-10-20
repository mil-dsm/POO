package POO.questoes_aula_10_20_10.RoboSimples;

public class RoboSimples{
    private String nome;
    private int x;
    private int y;
    private char direcao;
    
    public RoboSimples(String nome, int x, int y, char direcao){
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }
    
    public RoboSimples(String nome){
        this.nome = nome;
        x = 0;
        y = 0;
        direcao = 'N';
    }
    
    public RoboSimples(){
        nome = "";
        x = 0;
        y = 0;
        direcao = 'N';
    }
    
    public void mover(){
        if(direcao == 'N'){
            y++;
        }else if(direcao == 'S'){
            y--;
        }else if(direcao == 'L'){
            x++;
        }else{
            x--;
        }
    }
    
    public void mover(int passos){
        if(direcao == 'N'){
            y += passos;
        }else if(direcao == 'S'){
            y -= passos;
        }else if(direcao == 'L'){
            x += passos;
        }else{
            x -= passos;
        }
    }
    
    public void mudarDirecao(char novaDirecao){
        direcao = novaDirecao;
    }
    
    public String toString(){
        String saida = "nome: "+nome+"\n" +
	                    "x: " + x + "\n" +
		                "y: " + y + "\n" +
 		                "direcao: " + direcao + "\n";
        return(saida);
    }

}