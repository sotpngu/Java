package examples.String;

public class StringCompareEmp {

    public static void main(String[] args) {
        String str = "Hello world";
        String anotherString = "Hello world";
        Object objStr = str;

        // 以下实例中我们通过字符串函数
        // compareTo (string) ，
        // compareToIgnoreCase(String)
        // 及 compareTo(object string) 来比较两个字符串，
        // 并返回字符串中第一个字母ASCII的差值。
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }

}
