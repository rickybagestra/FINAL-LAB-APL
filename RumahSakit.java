//Mengimplementasikan class dari Observer
public class RumahSakit implements Notifikasi {  
    private String peserta;

    public RumahSakit (String peserta){
        this.peserta=peserta;
    }

    //Notifikasi untuk peserta
    @Override
    public void update(String pcr) {
        InterfaceDecorate Aktifitas = new Masker(new Jarak(new Aktifitas()));   
          
        System.out.println("Kami Dari Rumah Sakit Sumber Waras\n" + this.peserta + pcr + Aktifitas.Decorate());
    }

}