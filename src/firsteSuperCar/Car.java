package firsteSuperCar;

public class Car {
    private String date;
    private String typeEngine;
    private int maxSpeed;
    private int accelerationTime;
    private int passengerCapacity;
    private int countOfPassengersInside;
    private double currentSpeed;
    private CarWheel[] wheels = new CarWheel[MAX_WHEELS];
    private CarDoor[] doors = new CarDoor[MAX_DOORS];
    private static final int MAX_DOORS = 4;
    private static final int MAX_WHEELS = 5;

    public Car(String date) {
        this.date = date;
    }

    public Car(String typeEngine, int maxSpeed, int accelerationTime,
                   int passengerCapacity, int numberOfPassengersInside, int currentSpeed) {
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.countOfPassengersInside = numberOfPassengersInside;
        this.currentSpeed = currentSpeed;
        for(int i = 0; i < wheels.length; i++) {
            wheels[i] = new CarWheel();
        }
        for(int i = 0; i < doors.length; i++) {
            doors[i] = new CarDoor();
        }

    }
    //Change the current speed
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    //To put 1 passenger in the car
    public void addPassengers() {
        if(countOfPassengersInside <= passengerCapacity) {
            countOfPassengersInside++;
        } else {
            System.out.println("There are no seats in the car");
        }
    }
    //Disembark 1 passenger
    public void removePassengers() {
        if(countOfPassengersInside > 0){
            countOfPassengersInside--;
        } else {
            System.out.println("There are no passengers in the car");
        }
    }
    //Disembark all passengers
    public void getNumberOfPassengersInside() {
        if(countOfPassengersInside > 0) {
            countOfPassengersInside = 0;
        } else {
            System.out.println("There are no passengers in the car");
        }
    }
    //Get the doors by index
    public CarDoor getDoor(int i) {
        return doors[i];
        }
    //Get the wheels by index
    public CarWheel getWheel(int i) {
        return wheels[i];
    }
    //Remove all wheels from the car
    public void getRemoveAllWheels() {
        wheels = null;
    }
    //Install the new wheel on the X machine
    public void setNewWheels(int x) {
        wheels = new CarWheel[x];
    }

    //Current maximum possible speed
    public double getCurrentMaxSpeed() {
        if (countOfPassengersInside == 0) {
            return 0;
        }
        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].getTireState() == 0) {
                currentSpeed = maxSpeed * wheels[i].getTireState();
            }
        }
        return currentSpeed;
    }

    public void showInfo() {
        System.out.println("Date of production of the machine: " + date);
        System.out.println("Type of engine: " + typeEngine);
        System.out.println("The maximum speed of a new car: " + maxSpeed);
        System.out.println("Time of acceleration up to 100km: " + accelerationTime);
        System.out.println("Capacity of passengers: " + passengerCapacity);
        System.out.println("Count of passengers at the moment: " + countOfPassengersInside);
        System.out.println("Current speed: " + currentSpeed);
        System.out.println("Current maximum possible speed: " + getCurrentMaxSpeed());
    }
}

