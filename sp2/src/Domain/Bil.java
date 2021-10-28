package Domain;
//Bil. En bil har attributterne regNr, mærke, model, årgang, antalDøre. Klassen er abstrakt.
public abstract class Bil {
    int regNr;
    String mærke;
    String model;
    int årgang;

    public Bil(int regNr, String mærke, String model, int årgang){
        this.regNr=regNr;
        this.mærke=mærke;
        this.model=model;
        this.årgang=årgang;


    }
    public abstract double beregnGrønEjerafgift();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }
}
