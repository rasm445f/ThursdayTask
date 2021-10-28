package Domain;
//harPartikelfilter og kmPrL
public class DieselBil extends Bil{
    boolean harPartikelfilter;
    float kmPrl;

    public DieselBil(Boolean harPartikelfilter, float kmPrl, int regNr, String mærke, String model, int årgang) {
        super(regNr, mærke, model, årgang);
        this.harPartikelfilter=harPartikelfilter;
        this.kmPrl=kmPrl;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {
        this.kmPrl = kmPrl;
    }

    //Hvis den er mellem 20 og 50 er udligningsafgiften 130kr,
    // mellem 15 og 20 er den 1390 kr,
    // mellem 10 og 15 er den 1850kr,
    // mellem 5 og 10 er den 2770kr, og
    // under 5 er den 15260kr.
    // Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter monteret.



    @Override
    public double beregnGrønEjerafgift() {
        double grønAfgift = 0;

        if(kmPrl >= 20 && kmPrl <=50)
            grønAfgift=130;
        if(kmPrl >= 15 && kmPrl <=20)
            grønAfgift=1390;
        if(kmPrl >= 10 && kmPrl <=15)
            grønAfgift=1850;
        if(kmPrl >= 5 && kmPrl <= 10)
            grønAfgift=2770;
        if(kmPrl<5)
            grønAfgift=15260;
        if(harPartikelfilter == false)
            grønAfgift= grønAfgift+1000;



        return grønAfgift;
    }

    @Override
    public String toString() {
        return "DieselBil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrl +
                '}';
    }
}
