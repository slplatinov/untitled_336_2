package lab_5;

    class Person {
        String fullName;
        int age;
        void move(){
            System.out.println(fullName);

    }
    void talk(){
        System.out.println("is spiking");
    }

    public static void main(String[] args) {
        Person passenger = new Person();
        Person robot = new Person();
        //Person person = passenger;
        passenger.fullName = "Clavell James";
        passenger.age = 45;

        passenger.move();
        robot.talk();
    }
}