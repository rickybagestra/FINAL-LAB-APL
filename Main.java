class Main {
    public static void main (String[] args) {
        InterfaceObserver admin = new MachineObserver();
        Notifikasi Peserta1 = new RumahSakit("Halo, Pinem\n");
        Notifikasi Peserta2 = new RumahSakit("Halo, Syukran\n");
        Notifikasi Peserta3 = new RumahSakit("Halo, Rizky\n");
        Notifikasi Peserta4 = new RumahSakit("Halo, Kamisin\n");
        Notifikasi Peserta5 = new RumahSakit("Halo, Haris\n");
        admin.addObserver(Peserta1);
        admin.addObserver(Peserta2);
        admin.addObserver(Peserta3);
        admin.addObserver(Peserta4);
        admin.addObserver(Peserta5);

        //Memangil notifikasi dari setiap peserta
        admin.notifikasi("Hasil Test PCR Kamu Negatif. ");
       
    }
}