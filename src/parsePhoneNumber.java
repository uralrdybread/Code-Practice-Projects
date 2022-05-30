public class parsePhoneNumber {


    public static void main(String[] args) {
        String phoneNumber = "(234) 333-5551";
        String areaCode = parseAreaCode(phoneNumber);  //calls to the method parseAreaCode and plugs the parameter
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(openParens + 1, closeParens); //using the open and closing parens as
        // anchors I slice the required strings. closeParens has no params because the last is non-exclusive.
        return areaCode;

    }

    public static String parseExchange(String phoneNumber) {
        int spaceIndex = phoneNumber.indexOf(" ");
        int hyphenIndex = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIndex + 1, hyphenIndex);
        return exchange;

    }

    public static String parseLineNumber(String phoneNumber) {
        int hyphenIndex = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphenIndex + 1, hyphenIndex + 5);
        return lineNumber;

    }


}
