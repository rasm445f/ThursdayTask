public class Driver {

    private int age;
    private String name;

    Driver driver1 = new Driver(20,"Rasmus");

    public Driver (int ageX, String nameX) {
        age = ageX;
        name = nameX;
    }


    public Driver getDriver() {
        return driver1;
    }
}
