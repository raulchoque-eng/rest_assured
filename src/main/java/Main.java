import java.util.Arrays;

/**
 * Main class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Main {
    public static void main(String[] args) {
        String s = "";
//        System.out.println(s.length());
//        System.out.println(revRot("", 8));
//        System.out.println(revRot("123456779", 0));
//        System.out.println(revRot("123456779", 10));
//        System.out.println(revRot("1232210", 3));
//        System.out.println(revRot("66443875", 4));
//        System.out.println(isPair("12345677"));
//
//        get("/lotto").then().body("lotto.lottoId", equalTo(5));
//        get("/lotto").then().assertThat().body("lotto.lottoId", equalTo(5));

    }
    public static String revRot(String strng, int sz) {
        String result = "empty";
        if((sz < strng.length()) && (sz > 0)) {
            String[] chunkStr = getChunkStr(strng, sz);
            for (int i = 0; i < chunkStr.length; i++) {
                System.out.println(chunkStr[i]);
//                int number = Integer.valueOf(chunkStr[i]);
                String number = chunkStr[i];
                chunkStr[i] = isPair(number) ? reverse(number) : rotate(number);
            }
            result = Arrays.toString(chunkStr);
        }
        return result;
    }

    public static String[] getChunkStr(String strng, int sz) {
        int digit = strng.length() / sz;
        int temp = 0;
        int index = 0;
        String[] equalStr = new String [digit];
        for(int j = 1; j <= digit; j = ++j) {
            String part = strng.substring(index, index+sz);
            index = index + sz ;
            equalStr[temp] = part;
            temp++;
        }
        return equalStr;
    }

    public static Boolean isPair(String num) {

        char[] digits = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < digits.length ; i++) {
            sum = (int)Math.pow(((double)(digits[i] - '0')), 3.0) + sum;
        }
        System.out.println(sum);
        return  (sum % 2) == 0 ? true : false;
    }

    public  static String reverse(String num) {
        String result = "";
        return result;
    }

    public  static String rotate(String num) {
        String result = "";
        return result;
    }
}
