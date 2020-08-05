/**
 * @author Khizar Khan
 */

package atm;

class isItDivisbleByTwenty extends Exception {
    /**
     * Default constructor
     */
    public isItDivisbleByTwenty() {
        super();
    }

    /**
     * Parameterized constructor
     * @param String message
     */
    public isItDivisbleByTwenty(String message) {
       super(message);
    }

    /**
     * Parameterized constructor
     * @param String message
     * @param Throwable cause
     */
    public isItDivisbleByTwenty(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Parameterized constructor
     * @param Throwable cause
     */
    public isItDivisbleByTwenty(Throwable cause) {
        super(cause);
    }
}