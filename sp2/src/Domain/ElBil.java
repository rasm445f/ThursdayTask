package Domain;

//batterikapacitetKWh, maxKm og whPrKm.

public class ElBil extends Bil{
    int batterikapacitetKW;
    int maxKm;
    float whPrKm;

    public ElBil(int batterikapacitetKW, int maxKm, float whPrKm, int regNr, String mærke, String model, int årgang) {
        super(regNr, mærke, model, årgang);
        this.batterikapacitetKW=batterikapacitetKW;
        this.maxKm=maxKm;
        this.whPrKm=whPrKm;
    }

    public int getBatterikapacitetKW() {
        return batterikapacitetKW;
    }

    public void setBatterikapacitetKW(int batterikapacitetKW) {
        this.batterikapacitetKW = batterikapacitetKW;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(float whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double grønAfgift = 0;
        double kmPrl = 100 / (whPrKm / 91.25);


        if(kmPrl >= 20 && kmPrl <=50)
            grønAfgift=330;
        if(kmPrl >= 15 && kmPrl <=20)
            grønAfgift=1050;
        if(kmPrl >= 10 && kmPrl <=15)
            grønAfgift=2340;
        if(kmPrl >= 5 && kmPrl <= 10)
            grønAfgift=5500;
        if(kmPrl<5)
            grønAfgift=10370;



        return grønAfgift;
    }

    @Override
    public String toString() {
        return "ElBil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", batterikapacitetKW=" + batterikapacitetKW +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
