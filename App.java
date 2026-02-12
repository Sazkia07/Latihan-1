public class App{
    public static void main(String[] args) {
        bidangDuaDimensi bs = new bujurSangkar("bujursangkar", 4); 
        bidangDuaDimensi lg = new Lingkaran("lingkaran", 4);

        bs.info();
        System.out.println("Luas: "+bs.Luas());
        lg.info();
        System.out.println("Luas: "+lg.Luas());
    }
}