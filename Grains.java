public class Grains {

    public static void testArgument (int testSquare) {
        if (testSquare < 1 || testSquare > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

}
