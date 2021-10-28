package Domain;

public class Main {

    public static void main(String[] args) {
	BenzinBil b1 =new BenzinBil(85,23,32901323,"toyota","rav4",2017);
    ElBil e1 = new ElBil(23000,430,500,12345678,"honda","lada",2900);
    DieselBil d1 =new DieselBil(false,8,41,"BMW","X5",2019);
    DieselBil d2 = new DieselBil(true,19,63,"Toyota","land rover",1999);

        Garage g1 =new Garage();
g1.tilføjBilerTilGarage(b1);
g1.tilføjBilerTilGarage(e1);
g1.tilføjBilerTilGarage(d1);
g1.tilføjBilerTilGarage(d2);
        //System.out.println(g1);
        System.out.println(g1.beregnGrønAfgiftForBilpark());

    }
}
