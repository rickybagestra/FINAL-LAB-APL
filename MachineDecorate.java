//Class ini merupakan impelement dari class Interface untuk overide Method decorate
public abstract class MachineDecorate implements InterfaceDecorate{
    private InterfaceDecorate InterfaceDecorate;

    public MachineDecorate(InterfaceDecorate InterfaceDecorate) {
        this.InterfaceDecorate = InterfaceDecorate;
    }
    
    @Override
    public String Decorate(){
        return InterfaceDecorate.Decorate();
    }
}
