package utils.StringUtil;

/**
 *
 * @author teyyub 1:12:26 PM
 */
public class StringUtil {

    final static String NEW_LINE = System.getProperty("line.separator");
    public static StringBuilder builder = new StringBuilder();
    public static String appendNewLine(String line) {        
        builder.append(line).append(NEW_LINE);
        return builder.toString();
    }

  

}
