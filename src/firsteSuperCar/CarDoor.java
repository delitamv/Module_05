package firsteSuperCar;

public class CarDoor {
    private String statusDoor;
    private String statusWindow;


    // constructor 1
    public CarDoor(){
        statusDoor = "close";
        statusWindow = "close";
    }
    // constructor 2
    public CarDoor(String statusDoor, String statusWindow){
        this.statusDoor = statusDoor;
        this.statusWindow = statusWindow;
    }


    // method for door
    public void getStatusDoor(){
    if (statusDoor.equals("close")) {
        statusDoor = "open";
    }
        System.out.println(statusDoor);
    }

    public void getStatusDoorClose(){
        if (statusDoor.equals("open")) {
            statusDoor = "close";
        }
        System.out.println(statusDoor);
    }

    public void openOrClose() {
        if (statusDoor.equals("open")) {
            statusDoor = "close";
        } if (statusDoor.equals("close")) {
            statusDoor = "open";
        }
        System.out.println(statusDoor);
    }
    // method for window
    public void getStatusWindow(){
        if (statusWindow.equals("close")) {
            statusWindow = "open";
        }
        System.out.println(statusWindow);
    }
    public void getStatusWindowClose(){
        if (statusWindow.equals("open")) {
            statusWindow = "close";
        }
        System.out.println(statusWindow);
    }
    public void openOrCloseWindow() {
        if (statusWindow.equals("open")) {
            statusWindow = "close";
        } if (statusWindow.equals("close")) {
            statusWindow = "open";
        }
        System.out.println(statusWindow);
    }

    public void showInfo(){
        System.out.println("State door: " + statusDoor);
        System.out.println("State window: " + statusWindow);
    }
}
