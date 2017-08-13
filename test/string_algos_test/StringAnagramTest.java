package string_algos_test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import stringalgos.AnagramChecker;

/**
 *
 * @author Sushanth Bangera
 */
public class StringAnagramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(AnagramChecker.isAnagram("mary", "army"));
        assertFalse(AnagramChecker.isAnagram("scy", "cy"));
        assertTrue(AnagramChecker.isAnagram("word", "wrdo"));
        assertTrue(AnagramChecker.isAnagram("stop", "tops"));
        assertTrue(AnagramChecker.isAnagram("boat", "btoa"));
        assertFalse(AnagramChecker.isAnagram("pure", "in"));
        assertFalse(AnagramChecker.isAnagram("fill", "fil"));
        assertFalse(AnagramChecker.isAnagram("b", "bbb"));
        assertFalse(AnagramChecker.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramChecker.isAnagram("a", "a"));
        assertFalse(AnagramChecker.isAnagram("sleep", "slep"));
    }

    @Test
    public void testIsAnagram_2() {
        assertTrue(AnagramChecker.isAnagram_2("mary", "army"));
        assertFalse(AnagramChecker.isAnagram_2("scy", "cy"));
        assertTrue(AnagramChecker.isAnagram_2("word", "wrdo"));
        assertTrue(AnagramChecker.isAnagram_2("stop", "tops"));
        assertTrue(AnagramChecker.isAnagram_2("boat", "btoa"));
        assertFalse(AnagramChecker.isAnagram_2("pure", "in"));
        assertFalse(AnagramChecker.isAnagram_2("fill", "fil"));
        assertFalse(AnagramChecker.isAnagram_2("b", "bbb"));
        assertFalse(AnagramChecker.isAnagram_2("ccc", "ccccccc"));
        assertTrue(AnagramChecker.isAnagram_2("a", "a"));
        assertFalse(AnagramChecker.isAnagram_2("sleep", "slep"));
    }

    @Test
    public void testIsAnagram_3() {
        assertTrue(AnagramChecker.isAnagram_3("mary", "army"));
        assertFalse(AnagramChecker.isAnagram_3("scy", "cy"));
        assertTrue(AnagramChecker.isAnagram_3("word", "wrdo"));
        assertTrue(AnagramChecker.isAnagram_3("stop", "tops"));
        assertTrue(AnagramChecker.isAnagram_3("boat", "btoa"));
        assertFalse(AnagramChecker.isAnagram_3("pure", "in"));
        assertFalse(AnagramChecker.isAnagram_3("fill", "fil"));
        assertFalse(AnagramChecker.isAnagram_3("b", "bbb"));
        assertFalse(AnagramChecker.isAnagram_3("ccc", "ccccccc"));
        assertTrue(AnagramChecker.isAnagram_3("a", "a"));
        assertFalse(AnagramChecker.isAnagram_3("sleep", "slep"));
    }

}
