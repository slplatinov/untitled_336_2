package lab_2;

public class User {
    String name;
    int age = 10;
    int weight = 190;

    public void eat(){
        System.out.println("I'm eating" );
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.eat();
    }


}
