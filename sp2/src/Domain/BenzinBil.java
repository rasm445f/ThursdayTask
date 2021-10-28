package Domain;
//Benzinbil. Denne klasse nedarver fra Bil og har desuden attributterne oktantal og kmPrL
public class BenzinBil extends Bil{
    float oktanTal;
    float kmPrl;

    public BenzinBil(float oktanTal, float kmPrl,int regNr, String mærke, String model, int årgang){
super(regNr,mærke, model, årgang);
this.oktanTal=oktanTal;
this.kmPrl=kmPrl;
    }

    public float getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(float oktanTal) {
        this.oktanTal = oktanTal;
    }

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {
        this.kmPrl = kmPrl;
    }
//For en Benzinbil er afgiften afhængig af kmPrL. Hvis den er mellem 20 og 50 er den 330kr, mellem
//15 og 20 er den 1050 kr, mellem 10 og 15 er den 2340kr, mellem 5 og 10 er den 5500kr, og under 5
//er den 10470kr.
    @Override
    public double beregnGrønEjerafgift() {

        double grønAfgift = 0;

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
        return "BenzinBil{" +
                "oktanTal=" + oktanTal +
                ", kmPrl=" + kmPrl +
                ", regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                '}';
    }
}
