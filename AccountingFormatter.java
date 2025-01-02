/**
 * Title: JaykwonnJamesA4.zip
 * Semester: COP3337 – Fall 2024
 * @Jaykwonn James
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 *
 * This program formats numbers for accounting.
 * If the number is negative, it puts the number in parentheses.
 * If the number is positive, it just shows the number normally.
 */
public class AccountingFormatter implements NumberFormatter {
    @Override
    /**
     * @param number the integer to be formatted
     * @return a string with the formatted number; if the number is negative, it returns it in parentheses.
     * Description: This method formats negative numbers by wrapping them in parentheses, and returns the string version of positive numbers.
     */
    public String format(int number) {
        if (number < 0) {
            return "(" + Math.abs(number) + ")";
        } else {
            return Integer.toString(number);
        }
    }
}
