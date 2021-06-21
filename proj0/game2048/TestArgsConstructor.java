package game2048;

import org.junit.Test;

import static org.junit.Assert.*;

/** Tests the non empty constructor of Model.
 *
 * @author Zoe Plaxco
 */
public class TestArgsConstructor {

    @Test
    /** Note that this isn't a possible board state. */
    public void testCompletelyEmpty() {
        int[][] rawVals = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        Model m = new Model(rawVals, 0, 0, false);
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                assertEquals(null, m.tile(1, 1));
            }
        }
    }

    @Test
    /** Tests a board that is completely full except for the top row. */
    public void testEmptyTopRow() {
        int[][] rawVals = new int[][] {
                {0, 0, 0, 0},
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 4, 2, 4},
        };

        Model m = new Model(rawVals, 0, 0, false);
        
        assertNotEquals(null, m.tile(1, 1));
    }

    @Test
    /** Tests a board that is completely full except for the bottom row. */
    public void testEmptyBottomRow() {
        int[][] rawVals = new int[][] {
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 4, 2, 4},
                {0, 0, 0, 0},
        };

        Model m = new Model(rawVals, 0, 0, false);
        assertNotEquals(null, m.tile(1, 1));
    }


    @Test
    /** Tests a board that is completely full except for the left column. */
    public void testEmptyLeftCol() {
        int[][] rawVals = new int[][] {
                {0, 4, 2, 4},
                {0, 2, 4, 2},
                {0, 4, 2, 4},
                {0, 2, 4, 2},
        };

        Model m = new Model(rawVals, 0, 0, false);
        assertNotEquals(null, m.tile(1, 1));
    }

    @Test
    /** Tests a board that is completely full except for the right column. */
    public void testEmptyRightCol() {
        int[][] rawVals = new int[][] {
                {2, 4, 2, 0},
                {4, 2, 4, 0},
                {2, 4, 2, 0},
                {4, 2, 4, 0},
        };

        Model m = new Model(rawVals, 0, 0, false);
        assertNotEquals(null, m.tile(1, 1));
    }

    @Test
    /** Tests a completely full board except one piece. */
    public void testAlmostFullBoard() {
        int[][] rawVals = new int[][] {
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 0, 2, 4},
                {4, 2, 4, 2},
        };

        Model m = new Model(rawVals, 0, 0, false);
        assertNotEquals(null, m.tile(0, 0));
    }

    @Test
    /** Tests a completely full board.
     * The game isn't over since you can merge, but the emptySpaceExists method
     * should only look for empty space (and not adjacent values). */
    public void testFullBoard() {
        int[][] rawVals = new int[][] {
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2},
        };

        Model m = new Model(rawVals, 0, 0, false);
        assertNotEquals(null, m.tile(1, 1));
    }

    @Test
    /** Tests a completely full board. */
    public void testFullBoardNoMerge() {
        int[][] rawVals = new int[][] {
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 4, 2, 4},
                {4, 2, 4, 2},
        };

        Model m = new Model(rawVals, 0, 0, false);
        for(int i = 1; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                assertNotEquals(null, m.tile(1, 1));
            }
        }
    }
}
