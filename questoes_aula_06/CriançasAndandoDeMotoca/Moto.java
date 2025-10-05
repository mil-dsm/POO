package POO.questoes_aula_06.CriançasAndandoDeMotoca;

public class Moto {
    int power;
    int time;
    Pessoa person;

    public Moto(int potencia) {
        this.power = potencia;
        this.time = 0;
        this.person = null;
    }

    public boolean inserir(Pessoa p) {
        if(person != null) {
            System.out.println("fail: busy motorcycle");
            return false;
        } else {
            person = p;
            return true;
        }
    }
    
    public String toString() {
        if (person == null) {
            return "power:" + power + ", time:" + time + ", person:(empty)";
        } else {
            return "power:" + power + ", time:" + time + ", person:(" + person.getName() + ":" + person.getAge() + ")";
        }
    }

    
    public Pessoa remover() {
        if (person == null) {
            System.out.println("fail: empty motorcycle");
            return null;
        }
        Pessoa aux = person;
        person = null;
        return aux;
    }

    
    public void buyTime(int n) {
        time += n;
    }
    
    public void drive(int n) {
        if(time == 0) {
            System.out.println("fail: buy time first");
            return;
        }
        if(person == null) {
            System.out.println("fail: empty motorcycle");
            return;
        }
        if(person.getAge() > 10) {
            System.out.println("fail: too old to drive");
            return;
        }
        if(time - n <= 0) {
            System.out.println("fail: time finished after " + time + " minutes");
            time = 0;
            return;
        }
        time -= n;
    }
    
    public void honk() {
        System.out.print("P");
        for(int i=0; i<power; i++) {
            System.out.print("e");
        }
        System.out.println("m");
    }
}