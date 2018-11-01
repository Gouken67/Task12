import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("The getClassNumber() method should return number more than 45", this.getClassNumber() > 45);
    }
}
