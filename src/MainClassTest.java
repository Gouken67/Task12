import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("The getClassNumber() method should return number more than 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("The class_string doesn't contain 'hello' word", this.getClassString().contains("hello") || this.getClassString().contains("Hello") );
    }
}
