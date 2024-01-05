package EX02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtils_Test {

    @Test
    public void testIsPalindrome(){
        assertEquals(true,StringUtils.isPalindrome("ana"));
        assertEquals(false,StringUtils.isPalindrome("patos"));
        assertTrue(StringUtils.isPalindrome("ana"));
        assertFalse(StringUtils.isPalindrome("solsticio"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testReverseString(){
        assertEquals(true,StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("ana"));
        assertFalse(StringUtils.isPalindrome("solsticio"));
        assertFalse(StringUtils.isPalindrome(null));
    }


}
