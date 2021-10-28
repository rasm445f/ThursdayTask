package Domain;

import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> bilKælder = new ArrayList<Bil>();

    void tilføjBilerTilGarage(Bil bil) {
        bilKælder.add(bil);

    }

    @Override
    public String toString() {
        String resultat = "";

        for(Bil bil: bilKælder) {
            resultat += bil.toString();
            resultat += "\n";
        }
        return resultat;
    }
    double beregnGrønAfgiftForBilpark(){
       double resultat = 0;
        for(Bil bil: bilKælder) {
            resultat += bil.beregnGrønEjerafgift();
        }
        return resultat;

        }
    }


