import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void greetWithName() {
        assertEquals("Hello, Ada!", Greeter.greet("Ada"));
    }

    @Test
    public void greetWithEmptyString() {
        assertEquals("Hello, stranger!", Greeter.greet(""));
    }

    @Test
    public void greetWithNull() {
        assertEquals("Hello, stranger!", Greeter.greet(null));
    }
}
