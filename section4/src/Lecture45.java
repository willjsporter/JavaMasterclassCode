public class Lecture45 {

    public static void main(String[] args){
        Bed bed = new Bed(1.5,2.5, "double");
        Chair chair = new Chair(4,false, "wood");
        Window window = new Window(new Dimensions(4.0,2.0,0.1), false);
        Room bedroom = new Room(bed, chair, window);

        System.out.println(bedroom.getBed().getTypeOfBed());

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