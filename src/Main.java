public class Main {
    public static void main(String[] args) {
        // creating a Bicycle() instance
        Bicycle bike = new Bicycle();
        Motorcycle mike = new Motorcycle();
        CycleImplementation cycle =  new CycleImplementation();

        bike.setSpeed(54);
        System.out.println(bike.getSpeed());
        bike.accelerate(2);
        mike.setSpeed(56);
        System.out.println(mike.getSpeed());
        }
    }
