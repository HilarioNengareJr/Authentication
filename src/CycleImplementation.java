public class CycleImplementation implements Cycle{
    @Override
    public int numberOfWheels(int n){
        return n;
    }

    @Override
    public int numberOfSits(int x){
        return x;
    }

    @Override
    public void changeColor(String c){
        System.out.println(c);
    }
}
