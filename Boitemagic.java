public class Boitemagic extends Boit{
    private int coe;

    public Boitemagic(int poids, int coe) {
        super(poids);
        this.coe = coe;
    }

    public void superMagic() {
        this.coe += 1;
    }
    
    public void remplir(int charge){
        super.remplir(charge*this.coe);
    }


}
