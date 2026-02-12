class Lingkaran extends bidangDuaDimensi{
    protected double r;

    public Lingkaran(String nama, double r){
        super(nama);
        this.r=r;
    }

    @Override
    public double Luas(){
        return 3.14*r*r;
    }
    
}
