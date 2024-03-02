/**
 * The type Negative quantity exception.
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class NegativeQuantityException extends RuntimeException {
    /**
     * Instantiates a new Negative quantity exception.
     *
     * @param invalid the invalid
     */
    public NegativeQuantityException(String invalid) {
        super("Quantity " + invalid + " is not positive.");

    }
}
