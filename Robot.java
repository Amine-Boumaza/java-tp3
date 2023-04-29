import java.util.ArrayList;

public class Robot {
    ArrayList<Boit>chaine;

    private int defaultCharge;

    
    public Robot(ArrayList<Boit> chaine, int defaultCharge) {
        this.chaine = chaine;
        this.defaultCharge = defaultCharge;
    }

    public void oper() {
        for (Boit boit : chaine) {
            boit.remplir(defaultCharge);
        }
    }
    public void opermagic() {
        for (Boit boit : chaine) {
            if (boit instanceof Boitemagic){
                ((Boitemagic)boit).superMagic();
            }
        }
    }
}
