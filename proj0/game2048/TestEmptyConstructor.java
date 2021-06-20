package game2048;

import org.junit.Test;

import static org.junit.Assert.*;

/** Tests the empty constructor of Model.
 *
 * @author Zoe Plaxco
 */
public class TestArgsConstructor {

    @Test
    /** Tests a board that is one element. */
    public void testOneItem() {

        Model m = new Model(1);
        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < 1; j++) {
                assertTrue(m.tile(i,j) == null);
            }
        }
    }

    @Test
    /** Tests a board that is two elements by two elements. */
    public void testTwoByTwo() {

        Model m = new Model(2);
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                assertTrue(m.tile(i,j) == null);
            }
        }
    }

    @Test
    /** Tests a board that is three by three. */
    public void testThreeElements() {
        Model m = new Model(3);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                assertTrue(m.tile(i,j) == null);
            }
        }
    }


    @Test
    /** Tests a board that is of a random size (between 1 and 25)*/
    public void testRandom() {
        int rand = (int) ((Math.random() * 25) + 1);

        Model m = new Model(rand);
        for(int i = 0; i < rand; i++) {
            for(int j = 1; j < rand; j++) {
                assertTrue(m.tile(i,j) == null);
            }
        }
    }
}
