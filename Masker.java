//Method super untuk mempresentasikan objek class induk dari InterfaceDecorate
public class Masker extends MachineDecorate {
    public Masker(InterfaceDecorate InterfaceDecorate) {
        super(InterfaceDecorate); 
    }

    //Method this mepresentasikan objek dari class Masker
    public String Decorate() {
        return super.Decorate() + this.decorateMasker(); 
    }

    //Mengembalikan string dan jangan lupa pakai masker ke interfacenya Main.java
    public String decorateMasker(){
        return "dan jangan lupa pakai masker\n"; 
    }
}


