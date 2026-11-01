/*
 * Week 9 lab starter — Build Your First Pipeline
 * SDEV 3320
 */
public class Greeter {
    public static String greet(String name) {
        //if (name == null || name.isEmpty()) {
        if (name == null || name.isBlank()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name + "!";
    }
}
