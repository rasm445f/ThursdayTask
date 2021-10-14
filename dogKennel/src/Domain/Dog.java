package Domain;

import java.util.ArrayList;

public class Dog {
    String name;
    Boolean isHungry = true;
    ArrayList<String> offSpring;


    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        ArrayList<String> offSpring = new ArrayList<>();
    }
public ArrayList<String> getOffSpring(){
        return offSpring;

}

    public void setOffSpring(ArrayList<String> offSpring) {
        this.offSpring = offSpring;
    }

    public boolean FeedDog() {
        if (!isHungry) {
            System.out.println(name + " needs food");
        }
        if (isHungry == true) {
            System.out.println(name + " is now feed");
            isHungry = false;
        }

        return false;
    }

    public void setOffSpring() {
    }
}
