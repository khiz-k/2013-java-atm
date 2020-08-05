/**
 * @author Khizar Khan
 */

package atm;

class NegativeInput extends Exception {
    /**
     * Default constructor
     */
    public NegativeInput() {
        super();
    }

    /**
     * Parameterized constructor
     * @param String message
     */
    public NegativeInput(String message) {
       super(message);
    }

    /**
     * Parameterized constructor
     * @param String message
     * @param Throwable cause
     */
    public NegativeInput(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Parameterized constructor
     * @param Throwable cause
     */
    public NegativeInput(Throwable cause) {
        super(cause);
    }
}