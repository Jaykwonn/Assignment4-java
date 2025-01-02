/**
 * Title: JaykwonnJamesA4.zip
 * Semester: COP3337 – Fall 2024
 * @Jaykwonn James
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 *
 * The DecimalSeparatorFormatter class formats numbers by adding commas or other symbols for thousands.
 * It does this by using a tool in Java called NumberFormat.
 * The class follows the rules of an interface called NumberFormatter, which makes sure it has a method to format numbers.
 */
import java.text.NumberFormat;

public class DecimalSeparatorFormatter implements NumberFormatter {
    @Override
    /**
     * @param number the integer to be formatted
     * @return the formatted string version of the number
     * Description: This method formats an integer number based on the locale settings.
     * It uses the NumberFormat class to add commas or other locale-specific formatting.
     */
    public String format(int number) {
        return NumberFormat.getInstance().format(number);
    }
}
