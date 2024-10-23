public class ReverseString {

public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            String reversed = reverse(input);
            System.out.println(reversed);
        } else {
            System.out.println("Please provide a string as an argument.");
        }
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

