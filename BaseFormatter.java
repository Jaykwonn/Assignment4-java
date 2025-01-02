/**
 * Title: JaykwonnJamesA4.zip
 * Semester: COP3337 – Fall 2024
 * @Jaykwonn James
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 *
 * This program converts numbers into different bases, like binary or hexadecimal, using the BaseFormatter class.
 * It checks that the base is between 2 and 36, and if not, it throws an error.
 * The class follows rules from an interface, NumberFormatter, meaning it has to include a specific format method to change how numbers look.
 */
public class BaseFormatter implements NumberFormatter {
    private int base;

    /**
     * @param base The number base (between 2 and 36) for formatting.
     * @throws IllegalArgumentException if the base is less than 2 or greater than 36.
     * Description: This constructor sets the base for formatting numbers.
     */
    public BaseFormatter(int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }
        this.base = base;
    }

    @Override
    /**
     * @param number The integer value that needs to be formatted.
     * @return A string representing the integer in the specified base.
     * Description: This method takes an integer number and converts it into a string using the base that was defined when the class was created.
     */

    public String format(int number) {
        return Integer.toString(number, base);
    }
}
