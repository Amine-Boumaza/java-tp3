import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Boit b1=new Boit(0);
        Boitemagic b2=new Boitemagic(1,2);
        Boit b3=new Boit(5);
        
        ArrayList<Boit>chaine=new ArrayList<>();

        chaine.add(b1);
        chaine.add(b2);
        chaine.add(b3);
        
        
        
        Robot r1=new Robot(chaine,5);
        r1.oper();

        r1.opermagic();
        r1.chaine.get(1);
    }
}


