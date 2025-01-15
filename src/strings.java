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

        EscapeSequencesExample.run();
    }


    public class EscapeSequencesExample {
        public static void run() {
            System.out.println("Newline example:\nThis is on a new line.");
            System.out.println("Tab example:\tThis text is tabbed.");
            System.out.println("Backspace example: ABC\bD (removes C).");
            System.out.println("Carriage return example: Hello\rWorld (overwrites).");
            System.out.println("Single quote example: It\'s a great day.");
            System.out.println("Double quote example: \"Java is fun!\"");
            System.out.println("Backslash example: A backslash looks like this: \\");
            System.out.println("Form feed example: First page\fSecond page.");
            System.out.println("Unicode example: Greek Omega character: \u03A9");
        }
    }
}
