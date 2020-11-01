import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


//JUnit Example
public class LFUCacheTest {

    private LFUCache obj;
    @Before
    public void setup(){
        obj = new LFUCache(3);
    }

    @Test
    public void test(){

        obj.set(new Integer(1), new String("Karan"));
        obj.set(new Integer(2), new String("Bhaumik"));
        obj.set(new Integer(3), new String("Ruchin"));

        assertEquals("Karan", obj.get(1));
        assertEquals("Bhaumik", obj.get(2));
        assertEquals("Ruchin", obj.get(3));

        obj.set(new Integer(2), new String("Harshit"));
        obj.set(new Integer(4), new String("Amit"));

        assertEquals("Harshit", obj.get(2));
        assertEquals(null, obj.get(1));
        assertEquals("Amit", obj.get(4));


    }
}
