package EX02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtils_Test {

    @Test
    public void testIsPalindrome(){
        assertEquals(true,StringUtils.isPalindrome("ana"));
        assertEquals(false,StringUtils.isPalindrome("patos"));
        assertTrue(StringUtils.isPalindrome("reviver"));
        assertFalse(StringUtils.isPalindrome("solsticio"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testReverseString(){
        assertEquals("ana",StringUtils.reverseString("ana")); //mudei o metodo pars proteced na classe stringunits
        assertEquals("ytilauq",StringUtils.reverseString("quality")); //mudei o metodo pars proteced na classe stringunits
        assertEquals("ooo",StringUtils.reverseString("ooo")); //mudei o metodo pars proteced na classe stringunits
        assertEquals("o",StringUtils.reverseString("o")); //mudei o metodo pars proteced na classe stringunits
        assertEquals("",StringUtils.reverseString("")); //mudei o metodo pars proteced na classe stringunits


    }


}
