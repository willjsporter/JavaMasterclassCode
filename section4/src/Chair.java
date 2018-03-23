public class Chair {
    private int legs;
    private boolean rockingChair;
    private String madeOf;

    public Chair(int legs, boolean rockingChair, String madeOf) {
        this.legs = legs;
        this.rockingChair = rockingChair;
        this.madeOf = madeOf;
    }

    public String rockBackAndForth() {
            return rockingChair
                ? "Rock rock until you drop"
                : "you'll ruin the legs!";
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