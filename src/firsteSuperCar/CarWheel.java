package firsteSuperCar;

public class CarWheel {
    private double tireState;

    public CarWheel(){
        this.tireState = 1;
    }

    public CarWheel(double tireState){
        this.tireState = tireState;
    }

    public double getNewTire(){
        return tireState = 1;
    }

    public double makeOlderTire(double x){
        if ((x >= 0) && (x <= 100)){
            tireState = tireState *(x/100);
        }
        return tireState;
    }

    public double getTireState(){
        return tireState;
    }

    public void showInfo(){
        System.out.println("Tire State: " + getTireState());
    }
}
