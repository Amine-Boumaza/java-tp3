

/**
 * Boit
 */
public class Boit {

    protected int poids;
    public Boit(int poids) {
        this.poids = poids;
    }
    
    public void remplir(int charge){
        this.poids += charge;
    }
}