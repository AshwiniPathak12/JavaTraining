package Question_7;

import java.util.Scanner;

public class StringComparision extends StringCompare {
    String str;



   public void SetString(String s) {
        this.str = s;
    }



   public String getString() {
        return str;
    }



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringComparision s = new StringComparision();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String str = sc.next();
        System.out.println("Enter second String");
        String str1 = sc.next();
        s.SetString(str);
        s.SetString(str1);
        //char c;
        System.out.println("Comparing  " + str + " and " + str1 + ":" + str.equalsIgnoreCase(str1));
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) == str1.charAt(j)) {
                    //c = str.charAt(i);
                    System.out.println("Comparing  " + str.charAt(i) + " and " + str1.charAt(j) + ":" + "true");
                } /*
                     * else { System.out.println("Comparing  " + str.charAt(i) + " and " +
                     * str1.charAt(j) + ":" + "false"); }
                     */



           }



       }



   }
}