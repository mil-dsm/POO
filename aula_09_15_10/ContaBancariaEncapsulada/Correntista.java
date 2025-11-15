package POO.aula_09_15_10.ContaBancariaEncapsulada;

public class Correntista {
    private String nome;
    private String cpf;

    // getNome()
    public String getNome(){
        return this.nome;
    }
    // setNome()
    public void setNome(String nome){
        this.nome = nome;
    }
    // getCpf()
    public String getCpf(){
        return this.cpf;
    }
    // setCpf()
    public void setCpf(String cpf){
        this.cpf = cpf.replaceAll("[^0-9]", "");
        this.cpf = cpf;
    }
}