import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest
{
    @Test
    public void addTest()
    {
        int x = 5;
        int y = 6;
        int sum = 11;

        Library l = new Library();
        int res = l.add(x, y);
 
        assertEquals(sum, res);
    }
}
