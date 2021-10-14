package Domain;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog1 =new Dog("Kurt",true);
        dog1.FeedDog();
        dog1.setOffSpring();
        System.out.println(dog1.getOffSpring());
    }
}
