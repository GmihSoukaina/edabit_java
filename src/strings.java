public class strings {
    public static void main(String[] args) {
        String message = "   Hello World!!!" + " soukaina  ";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("Hel"));
        System.out.println(message.length());
        System.out.println(message.indexOf("s")); // if char not excite write -1
        System.out.println(message.replace("!", "?")); // target and rep and ? and ! is arguments
        // this method does not modify our original string. it returns a new string
        // in java strings are immutable we cannot mutate them we cannot change them so any methods that modify a string will always return a new string

        System.out.println(message.trim());
    }
}
