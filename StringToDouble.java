
public class StringToDouble {

    public double stringToDouble(String string) throws NumberFormatException {

        double number = 0;
        char[] chrs = string.toCharArray();

        boolean decimal = false;
        double divPow =1;
        double divBy = 0;

        int i=0;

        //if first char is '-' or '+' then it is valid but we don't want to process it,
        // so increment the index
        if(chrs[i] == '-' || chrs[i] == '+')
            i++;

        for (; i<chrs.length; i++) {
            if (chrs[i] == '.' && !decimal) {
                decimal = true;
                continue;
            }

            //if there is any other char other than the digit,
            // then it means the given string is invalid
            //Note: we've already processed the decimal and '-' / '+'
            if (chrs[i] < '0' || chrs[i] > '9')
                throw new NumberFormatException("Given string is invalid.");

            if (decimal) {
                divBy = Math.pow(10, divPow++);
                number = number + (chrs[i] - '0') / divBy;
            } else
                number = (number*10) + chrs[i] - '0'; //this will put the digit at unit's place
        }

        //no need to add minus sign if the number is 0
        if (chrs[0] == '-' && number != 0)
            number = -number;

        return  number;
    }
    public static void main(String[] args) {
        StringToDouble  stringToDouble = new StringToDouble();

        System.out.println(stringToDouble.stringToDouble("-123.015"));
        System.out.println(stringToDouble.stringToDouble("-000.1213"));
        System.out.println(stringToDouble.stringToDouble("-."));
        System.out.println(stringToDouble.stringToDouble("-.12.+1-3"));
        System.out.println(stringToDouble.stringToDouble("+000.12.+1-3"));
        System.out.println(stringToDouble.stringToDouble("-98hghvhgv@%$!&7.1..+2.+1-3"));
    }
}
