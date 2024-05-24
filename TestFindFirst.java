import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFindFirst {

    @Test
    public void testDuplicate(){
        int[] input = new int[] {4, 2, 1, 3, 1};
        FindFirst findFirst = new FindFirst();

        assertEquals(1,findFirst.findFirst(input));
    }
    
}
