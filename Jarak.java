//Class ini merupakan decorator 
public class Jarak extends MachineDecorate {
    public Jarak(InterfaceDecorate InterfaceDecorate) {
        super(InterfaceDecorate);
    }

    public String Decorate() {
        return super.Decorate() + this.decorateJarak(); 
    }

    public String decorateJarak(){
        return "Bersama Kami, Tetap selalu jaga jarak "; 
    }
}


