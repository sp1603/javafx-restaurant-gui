/**
 * The type Illegal quantity exception.
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class IllegalQuantityException extends Exception {
    /**
     * Instantiates a new Illegal quantity exception.
     *
     * @param invalid the invalid
     */
    public IllegalQuantityException(String invalid) {
        super("Quantity " + invalid + " is not a number.");

    }
}
