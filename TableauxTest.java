import org.junit.Test;
import static org.junit.Assert.*;

public class TableauxTest {

    @Test
    public void trierCroissantSSS() {
        int[] tab = {20, 10, 0, -1, 50};
        int[] expectedResult = {-1, 0, 10, 20, 50};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(tab, expectedResult);
    }

    @Test
    public void testTrierCroissantSSS() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        String[] expectedResult = {"-1", "0", "10", "20", "50"};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(tab, expectedResult);
    }

    @Test
    public void triDecroissantSSS() {
        int[] tab = {20, 10, 0, -1, 50};
        int[] expectedResult = {50, 20, 10, 0, -1};
        Tableaux.triDecroissantSSS(tab);
        assertArrayEquals(tab, expectedResult);
    }

    @Test
    public void maximum() {
        int[] tab = {20, 10, 0, -1, 50};
        int expectedResult = 50;
        int result = Tableaux.maximum(tab);
        assertEquals(result, expectedResult);
    }

    @Test
    public void minimum() {
        int[] tab = {20, 10, 0, -1, 50};
        int expectedResult = -1;
        int result = Tableaux.minimum(tab);
        assertEquals(result, expectedResult);
    }

    @Test
    public void moyenne() {
        int[] tab = {20, 10, 0, -1, 50};
        double expectedResult = 15.8;
        double result = Tableaux.moyenne(tab);
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void fouilleSeq() {
        int[] tab = {20, 10, 0, -1, 50};
        int expectedResult = 1;
        int result = Tableaux.fouilleSeq(tab, 10);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testTriDecroissantSSS() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        String[] expectedResult = {"50", "20", "10", "0", "-1"};
        Tableaux.triDecroissantSSS(tab);
        assertArrayEquals(tab, expectedResult);
    }

    @Test
    public void testMaximum() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        int expectedResult = 50;
        int result = Tableaux.maximum(tab);
        assertEquals(result, expectedResult);
    }

    @Test
    public void testMinimum() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        int expectedResult = -1;
        int result = Tableaux.minimum(tab);
        assertEquals(result, expectedResult);
    }

    @Test
    public void testMoyenne() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        double expectedResult = 15.8;
        double result = Tableaux.moyenne(tab);
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testFouilleSeq() {
        String[] tab = {"20", "10", "0", "-1", "50"};
        int expectedResult = 1;
        int result = Tableaux.fouilleSeq(tab, "10");
        assertEquals(expectedResult, result);
    }
}