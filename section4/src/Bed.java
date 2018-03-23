public class Bed {
    private double width;
    private double length;
    private String typeOfBed;

    public Bed(double width, double length, String typeOfBed) {
        this.width = width;
        this.length = length;
        this.typeOfBed = typeOfBed;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

}

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.