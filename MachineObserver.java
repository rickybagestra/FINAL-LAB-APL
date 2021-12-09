import java.util.ArrayList;

public class MachineObserver implements InterfaceObserver { 
    private ArrayList<Notifikasi> RumahSakit= new ArrayList<>();  
    
    //Overide semua method yang ada pada class observable
    @Override
    public void addObserver(Notifikasi observer) {
        RumahSakit.add(observer);
    }

    @Override
    public void removeObserver(Notifikasi observer) {
        RumahSakit.remove(observer);
    }

    @Override
    public void notifikasi(String pcr) {
        for (Notifikasi RumahSakit : RumahSakit) {
        RumahSakit.update(pcr);
        }
    }
}

/* 
Class ini merupakan subject dari Observer.
*/
