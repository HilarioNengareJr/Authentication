public class Bicycle{
    // Attributes
    private int speed;
    private int cadence;
    public int gear;

    //Constructor

    // mutators
    void setSpeed(int speed){
        this.speed = speed;
    }

    void setCadence(int cadence){
        this.cadence = cadence;
    }

    // accessors
    int getSpeed(){
        return this.speed;
    }

    int getCadence(){
        return this.cadence;
    }

    // Methods
    void accelerate(int increment){
        System.out.println(speed += increment);
    }

    void decelerate(int decrement){
        System.out.println(speed -= decrement);
    }

    void changeGear(int toGear){
        System.out.println("Now in gear " + (gear += toGear));
    }

}