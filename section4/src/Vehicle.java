public class Vehicle {

    private int speed;
    protected String direction;


    public Vehicle(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public void steer(String direction) {
        if(direction == "left" || direction =="right"){
            this.direction = direction == "left"
                    ? "left"
                    : "right";
        }
    }

    public void changeSpeed(int speedChange) {
        this.speed = this.speed + speedChange;
    }


}
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.