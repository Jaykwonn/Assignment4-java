/**
 * Title: JaykwonnJamesA4.zip
 * Semester: COP3337 – Fall 2024
 * @Jaykwonn James
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 *
 * This program creates a class called DefaultFormatter that turns numbers into strings.
 * It uses something called an interface, NumberFormatter, which tells the class it must have a format method.
 * The class follows this rule and converts numbers to strings using Integer.toString().

 */
public class DefaultFormatter implements NumberFormatter {
    @Override
    /**
     * @param number the integer to be formatted
     * @return the string representation of the integer
     * Description: This method takes an integer, converts it to a string, and returns that string.
     */
    public String format(int number) {
        return Integer.toString(number);
    }
}
