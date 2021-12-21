package activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("Rennu");
        plane.onboard("Sita");
        plane.onboard("Ram");
        System.out.println("Plane took off at the time: " + plane.takeOff());
        //Print list of people on board
        System.out.println("All passengers in the plane: " + plane.getPassengers());
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    }
}

