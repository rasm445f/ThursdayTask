public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String makeX,String modelX,int YearX, String BodyStyleX) {
        this.make = makeX;
        this.model = modelX;
        this.year = YearX;
        this.bodyStyle = BodyStyleX;        //coupe, suv...

    }


    @Override
    public String toString() {
        return String.format(make+" "+model+" "+year+" "+bodyStyle);
    }

    public void setDriver(Driver driver1) {
        this.driver = driver1;
    }
}
